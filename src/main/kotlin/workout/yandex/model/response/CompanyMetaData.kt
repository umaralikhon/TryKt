package workout.yandex.model.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Arrays

@JsonIgnoreProperties(ignoreUnknown = true)
class CompanyMetaData {

    @JsonProperty("id")
    var id: Long = 0;

    @JsonProperty("name")
    var name: String = "";

    @JsonProperty("address")
    var address: String = "";

    @JsonProperty("Phones")
    var phones: List<Phones> = ArrayList();

    @JsonProperty("Categories")
    var categories:  List<Category> = ArrayList();

    @JsonProperty("Hours")
    var hours: Hours = Hours();
}