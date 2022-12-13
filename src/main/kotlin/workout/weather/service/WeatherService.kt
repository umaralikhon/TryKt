package workout.weather.service

import workout.weather.entity.WeatherEntity
import workout.weather.entity.WeatherRequestDto

interface WeatherService {

    fun saveWeatherData(request: WeatherRequestDto): WeatherEntity?;
    fun getWeatherById(id: Long): WeatherEntity;
}