package workout.weather.service

import lombok.extern.slf4j.Slf4j
import mu.KotlinLogging
import org.springframework.http.HttpEntity
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import workout.weather.config.RapidConfig
import workout.weather.entity.WeatherEntity
import workout.weather.entity.WeatherRequestDto
import workout.weather.entity.WeatherResponse
import java.util.Optional

@Service
@Slf4j
class WeatherServiceImpl(weatherRepo: WeatherRepo, restTemplate: RestTemplate, rapidConfig: RapidConfig) :
    WeatherService {

    private val weatherRepo: WeatherRepo;
    private val logger = KotlinLogging.logger {};
    private val restTemplate: RestTemplate;
    private val rapidConfig: RapidConfig

    init {
        this.weatherRepo = weatherRepo;
        this.restTemplate = restTemplate;
        this.rapidConfig = rapidConfig;
    }

    override fun getWeatherById(id: Long): WeatherEntity {

        var optional: Optional<WeatherEntity>;

        optional = weatherRepo.findById(id);
        return optional.get();
    }

    override fun saveWeatherData(request: WeatherRequestDto): WeatherEntity? {

        if (!requestDtoChecker(request)) {
            logger.error { "Invalid Request ${request}" };
            throw Exception("Invalid Data...");
        }

        val weatherEntity = WeatherEntity();
        val weatherResponse = getWeatherDataFromApi(request);

        weatherEntity.temp = weatherResponse.mainWeather.temp.toInt();
        weatherEntity.feelsLike = weatherResponse.mainWeather.feelsLike.toInt();
        weatherEntity.humidity = weatherResponse.mainWeather.humidity;
        weatherEntity.pressure = weatherResponse.mainWeather.pressure;

        try {
            logger.info { "Saved data: ${weatherEntity}" }
            return weatherRepo.save(weatherEntity);
        } catch (ex: Exception) {
            logger.error { ex.message }
        }
        return null;
    }

    private fun getWeatherDataFromApi(weatherRequest: WeatherRequestDto): WeatherResponse {

        try {
            return restTemplate.exchange(
                String.format(rapidConfig.url, weatherRequest.lat, weatherRequest.lon),
                HttpMethod.GET,
                HttpEntity.EMPTY,
                WeatherResponse::class.java
            ).body!!;
            logger.info { "Success API connection" }
        } catch (ex: java.lang.Exception) {
            logger.error { ex.message }
            return WeatherResponse();
        }
    }

    private fun requestDtoChecker(weatherRequest: WeatherRequestDto): Boolean {

        if (weatherRequest.lat !in (0..190)) {
            return false;
        }
        if (weatherRequest.lon !in 0..180) {
            return false
        }
        return true;

    }
}