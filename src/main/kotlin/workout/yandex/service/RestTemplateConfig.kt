package workout.yandex.service

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate
import java.time.Duration

@Configuration
class RestTemplateConfig {

    @Bean
    fun restTemplate(): RestTemplate = RestTemplateBuilder()
        .setReadTimeout(Duration.ofSeconds(30))
        .setConnectTimeout(Duration.ofSeconds(30))
        .build();
}