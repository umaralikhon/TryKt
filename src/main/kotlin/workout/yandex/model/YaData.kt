package workout.yandex.model

import jakarta.persistence.*
import java.util.Arrays
import java.util.LinkedList

@Entity
@Table(name = "ya_data")
class YaData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0;

    @Column(name ="name")
    var name: String = "";

    @Column(name = "address")
    var address: String = "";

    @Column(name = "phone")
    @ElementCollection(targetClass = (String::class))
    var phone: List<String> = ArrayList();

    @Column(name= "category")
    @ElementCollection(targetClass = String::class)
    var category: List<String> = ArrayList();

    @Column(name = "work_hours_from")
    var workHoursFrom: String = "";

    @Column(name = "work_hours_to")
    var workHoursTo: String = "";

    @Column(name="every_day")
    var everyDay: Boolean = false;
}