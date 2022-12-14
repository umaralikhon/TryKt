package workout.yandex.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import workout.yandex.model.YaRequest
import workout.yandex.model.response.YaResponse
import workout.yandex.service.YaService

@RestController
@RequestMapping("/ya")
class YaController (yaService: YaService){

    val yaService: YaService;

    init {
        this.yaService = yaService;
    }

    @PostMapping("/test")
    fun testYandex(@RequestBody yaRequest: YaRequest): YaResponse{

        return yaService.findFromYandexByOrganisationName(yaRequest);
    }
}