package workout.hotel

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HotelController(hotelService: HotelService) {

    val hotelService: HotelService;

    init {
        this.hotelService = hotelService;
    }
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

    @PostMapping("/save")
    public fun saveHotel(@RequestBody hotel : Hotel ): Hotel{

        return hotelService.saveHotel(hotel);
    }

    @GetMapping("/get/{id}")
    public fun getHotelById(@PathVariable id: Long) : Hotel{
        return hotelService.getById(id);
    }

}