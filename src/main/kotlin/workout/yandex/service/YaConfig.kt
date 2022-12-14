package workout.yandex.service

import org.springframework.stereotype.Component

@Component
class YaConfig {

    val apiKey = "5b775f53-0bb7-4ae9-b2dc-e75b773e066a";
    val url = "https://search-maps.yandex.ru/v1/?text=%s&lang=%s&apikey=".plus(apiKey);

}