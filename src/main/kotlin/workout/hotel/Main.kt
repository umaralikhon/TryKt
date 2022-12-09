package workout.hotel

fun main() {

    val hotels = ArrayList<Hotel>();

    hotels.add(Hotel(1, "Hyatt", 4, "Uzb", "Tashkent", "A. Temur"));
    hotels.add(Hotel(2, "Ibis", 3, "Rus", "Krasnoyarsk", "Mir"));

    for(hotel in hotels){
        println(hotel);
    }
}