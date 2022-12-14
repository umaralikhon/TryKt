package workout.yandex.model.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class Category {

    @JsonProperty("class")
    var class_: String = "";

    @JsonProperty("name")
    var name: String = "";
}