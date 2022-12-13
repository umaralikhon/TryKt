package workout.weather.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class MainWeather {

    @JsonProperty("temp")
    var temp: Double = 0.0;

    @JsonProperty("feels_like")
    var feelsLike: Double = 0.0;

    @JsonProperty("temp_min")
    var tempMin: Double = 0.0;

    @JsonProperty("temp_max")
    var tempMax: Double = 0.0;

    @JsonProperty("pressure")
    var pressure: Int = 0;

    @JsonProperty("humidity")
    var humidity: Int = 0;

    @JsonProperty("sea_level")
    var seaLevel: Int = 0;

    @JsonProperty("grnd_level")
    var grndLevel: Int = 0;
}