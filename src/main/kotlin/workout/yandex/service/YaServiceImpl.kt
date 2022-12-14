package workout.yandex.service

import org.springframework.http.HttpEntity
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import workout.yandex.model.YaRequest
import workout.yandex.model.response.YaResponse

@Service
class YaServiceImpl (restTemplate: RestTemplate, yaConfig: YaConfig) : YaService{

    val restTemplate: RestTemplate;
    val yaConfig: YaConfig;

    init{
        this.restTemplate = restTemplate;
        this.yaConfig = yaConfig;
    }

    override fun findFromYandexByOrganisationName(yaRequest: YaRequest): YaResponse{

        return restTemplate.exchange(
            String.format(yaConfig.url, yaRequest.name, yaRequest.lang),
            HttpMethod.GET,
            HttpEntity.EMPTY,
            YaResponse::class.java
        ).body!!;
    }
}