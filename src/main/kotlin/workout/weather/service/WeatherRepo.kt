package workout.weather.service

import org.springframework.data.jpa.repository.JpaRepository
import workout.weather.entity.WeatherEntity

interface WeatherRepo : JpaRepository<WeatherEntity, Long> {

}