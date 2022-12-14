package workout.yandex.model.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class Property {

    @JsonProperty("name")
    var name: String = "";

    @JsonProperty("description")
    var description:String = "";

    @JsonProperty("CompanyMetaData")
    var companyMetaData: CompanyMetaData = CompanyMetaData();
}