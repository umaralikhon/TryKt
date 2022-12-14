package workout.yandex.model.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class YaResponse {

    @JsonProperty("features")
    val features: List<Feature> = ArrayList();
}