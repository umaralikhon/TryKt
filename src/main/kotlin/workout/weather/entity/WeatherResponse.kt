package workout.weather.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class WeatherResponse {

    @JsonProperty("main")
    var mainWeather: MainWeather = MainWeather();
}