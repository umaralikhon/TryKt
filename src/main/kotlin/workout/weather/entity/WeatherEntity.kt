package workout.weather.entity

import jakarta.persistence.*

@Entity
@Table(name = "weather")
class WeatherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0;
    var temp: Int = 0;
    var pressure: Int = 0;
    var humidity: Int = 0;

    @Column(name = "feels_like")
    var feelsLike: Int = 0;
}