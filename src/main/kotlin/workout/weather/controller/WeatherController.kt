package workout.weather.controller

import mu.KotlinLogging
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import workout.weather.entity.WeatherEntity
import workout.weather.entity.WeatherRequestDto
import workout.weather.service.WeatherService

@RestController
@RequestMapping("/weather")
class WeatherController(weatherService: WeatherService) {

    private val weatherService: WeatherService;
    private val logger = KotlinLogging.logger {};

    init {
        this.weatherService = weatherService;
    }

    @GetMapping("/get/{id}")
    fun getWeatherDataById(@PathVariable id: Long): Any {
        try {
            return ResponseEntity.ok(weatherService.getWeatherById(id));
        } catch (ex: Exception) {
            return ResponseEntity.notFound();
        }
    }

    @PostMapping("/save")
    fun saveWeatherData(@RequestBody weatherRequestDto: WeatherRequestDto): WeatherEntity? {
        return weatherService.saveWeatherData(weatherRequestDto);
    }
}