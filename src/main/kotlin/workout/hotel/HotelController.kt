package workout.hotel

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HotelController {

    @GetMapping("/test")
    fun testMapping(): List<Hotel>{
        val hotels = ArrayList<Hotel>();

        hotels.add(Hotel(1, "Hyatt", 4, "Uzb", "Tashkent", "A. Temur"));
        hotels.add(Hotel(2, "Ibis", 3, "Rus", "Krasnoyarsk", "Mir"));

        for(hotel in hotels){
            println(hotel);
        };

        return hotels;
    }
}