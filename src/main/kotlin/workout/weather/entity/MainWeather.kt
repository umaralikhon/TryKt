package workout.weather.entity

import com.fasterxml.jackson.annotation.JsonProperty

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
}