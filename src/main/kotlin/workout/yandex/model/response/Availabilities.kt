package workout.yandex.model.response

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class Availabilities {

    @JsonProperty("Intervals")
    var intervals: List<Intervals> = ArrayList();

    @JsonProperty("Everyday")
    var everyDay: Boolean = false;
}