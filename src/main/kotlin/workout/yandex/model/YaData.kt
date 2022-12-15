package workout.yandex.model

import jakarta.persistence.*

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
    val phone = mutableListOf<String>();

    @Column(name= "category")
    @ElementCollection(targetClass = String::class)
    var category = mutableListOf<String>();

    @Column(name = "work_hours_from")
    var workHoursFrom: String = "";

    @Column(name = "work_hours_to")
    var workHoursTo: String = "";

    @Column(name="every_day")
    var everyDay: Boolean = false;
}