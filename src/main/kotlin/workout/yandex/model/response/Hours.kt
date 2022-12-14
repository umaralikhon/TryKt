package workout.yandex.model.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class Hours {

    @JsonProperty("text")
    var text: String = "";

    @JsonProperty("Availabilities")
    var availabilities: List<Availabilities> = ArrayList();
}