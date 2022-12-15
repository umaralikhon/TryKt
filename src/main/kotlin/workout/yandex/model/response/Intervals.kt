package workout.yandex.model.response

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDateTime

@JsonIgnoreProperties(ignoreUnknown = true)
class Intervals {

    val timeFormat: String = "HH:mm:ss";

    @JsonProperty("from")
//TODO:  @DateTimeFormat(style = "HH:mm:ss")
    var from: String = "";

    @JsonProperty("to")
//    @DateTimeFormat(style = "HH:mm:ss")
    var to: String = "";

}