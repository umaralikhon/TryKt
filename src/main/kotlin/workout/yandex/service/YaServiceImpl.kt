package workout.yandex.service

import mu.KotlinLogging
import org.springframework.http.HttpEntity
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import workout.yandex.model.YaData
import workout.yandex.model.YaRequest
import workout.yandex.model.response.YaResponse
import workout.yandex.repo.YaRepo
import java.util.Optional

@Service
class YaServiceImpl(restTemplate: RestTemplate, yaConfig: YaConfig, yaRepo: YaRepo) : YaService {

    private val logger = KotlinLogging.logger {};
    private val restTemplate: RestTemplate;
    private val yaConfig: YaConfig;
    private val yaRepo: YaRepo;

    init {
        this.restTemplate = restTemplate;
        this.yaConfig = yaConfig;
        this.yaRepo = yaRepo;
    }

    //--------------------------------- API connection ---------------------------------//
    override fun findFromYandexByOrganisationName(yaRequest: YaRequest): YaResponse {

        checkYaRequestValidity(yaRequest);

        try {
            return restTemplate.exchange(
                String.format(yaConfig.url, yaRequest.name, yaRequest.lang),
                HttpMethod.GET,
                HttpEntity.EMPTY,
                YaResponse::class.java
            ).body!!;
        } catch (ex: Exception) {
            return YaResponse(); //Empty response
        }
    }

    private fun checkYaRequestValidity(yaRequest: YaRequest): Boolean {

        if (yaRequest.lang.name.isNullOrBlank()) {
            logger.error { "Empty Lang in request: ${yaRequest.lang}" }
            throw Exception();
        }

        if (yaRequest.name.isNullOrBlank()) {
            logger.error { "Empty Name in request: ${yaRequest.name}" }
            throw java.lang.Exception();
        }

        return true;
    }
    //------------------------------------------------------------------//

    //--------------------------------- Entity Operations --------------------------------- //
    override fun saveYaData(yaRequest: YaRequest): YaData {
        val yaResponse = findFromYandexByOrganisationName(yaRequest);
        val yaData = initYaData(yaResponse);

        try {
            logger.info { "Saved Data: ${yaData}" }
            return yaRepo.save(yaData);
        } catch (ex: Exception) {
            logger.error { "Error in saving Data: ${yaData}" }
            return YaData(); //Empty data
        }
    }

    private fun initYaData(yaResponse: YaResponse): YaData {

        val yaData = YaData();

        yaData.name = yaResponse
            .features
            .get(0)
            .properties
            .name;

        yaData.address = yaResponse
            .features
            .get(0)
            .properties
            .companyMetaData
            .address;

        yaData.workHoursFrom = yaResponse
            .features
            .get(0)
            .properties
            .companyMetaData
            .hours
            .availabilities
            .get(0)
            .intervals
            .get(0)
            .from;

        yaData.workHoursTo = yaResponse
            .features
            .get(0)
            .properties
            .companyMetaData
            .hours
            .availabilities
            .get(0)
            .intervals
            .get(0)
            .to;

        yaData.everyDay = yaResponse
            .features
            .get(0)
            .properties
            .companyMetaData
            .hours
            .availabilities
            .get(0)
            .everyDay;

        val phoneList = yaResponse.features.get(0).properties.companyMetaData.phones;
        val categories = yaResponse.features.get(0).properties.companyMetaData.categories;

        for (phone in phoneList) {
            yaData.phone.add(phone.formatted);
        }

        for (category in categories) {
            yaData.category.add(category.name);
        }

        return yaData;
    }

    override fun findById(id: Long): YaData {
        val optional: Optional<YaData> = yaRepo.findById(id);

        if (optional.isEmpty) {
            logger.info { "Nothing found by ID: ${id}" }
            throw Exception();
        }

        return optional.get();
    }
}