package workout.weather.config

import org.springframework.stereotype.Component

@Component
class RapidConfig {

    val apiKey: String = "e5f88c2061f0ac900e6669da976bf1fc";
    var url: String = "https://api.openweathermap.org/data/2.5/weather?lat=%s&lon=%s&units=metric&appid=".plus(apiKey);
}
