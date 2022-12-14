package workout.yandex.model.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class Phones {

    @JsonProperty("type")
    var type: String = "";

    @JsonProperty("formatted")
    var formatted: String = "";

}