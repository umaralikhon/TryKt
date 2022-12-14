package workout.yandex.service

import workout.yandex.model.YaRequest
import workout.yandex.model.response.YaResponse

interface YaService {

    fun findFromYandexByOrganisationName(yaRequest: YaRequest): YaResponse;
}