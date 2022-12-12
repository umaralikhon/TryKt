package workout.hotel

import jakarta.persistence.*

@Entity
@Table(name = "hotel")
class Hotel constructor(id: Int, name: String, stars: Int, country: String, city:String, street: String){

    constructor(): this(0, "",  0, "", "","");

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0;
    var name: String = "";
    var stars: Int = 0;
    var country: String = "";
    var city: String = "";
    var street: String = "";

    init {
        this.id = id;
        this.name = name;
        this.stars = stars;
        this.country = country;
        this.city = city;
        this.street = street;
    }

    override fun toString(): String {
        return "Id: $id, name: $name, stars: $stars, country: $country, city: $city, street: $street";
    }
}