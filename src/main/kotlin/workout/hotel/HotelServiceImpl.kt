package workout.hotel

import org.springframework.stereotype.Service

@Service
class HotelServiceImpl(hotelRepository: HotelRepository) : HotelService{

    val hotelRepository: HotelRepository;

    init {
        this.hotelRepository = hotelRepository;
    }

    override fun saveHotel(hotel: Hotel): Hotel {
        return hotelRepository.save(hotel);
    }

    override fun getById(id: Long): Hotel {
        return hotelRepository.getReferenceById(id);
    }
}