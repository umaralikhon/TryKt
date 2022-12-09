package workout.step5

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController {

    @GetMapping("/get-message")
    fun index():List<Message> = listOf(
        Message(1, "Veronica", "Obedina"),
        Message(2, "Alisa", "Alekseeva")
    );
}