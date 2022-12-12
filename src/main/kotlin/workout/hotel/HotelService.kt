package workout.hotel

interface HotelService {

    fun saveHotel(hotel: Hotel): Hotel;

    fun getById(id: Long): Hotel;
}