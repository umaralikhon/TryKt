package com.example.trykt.ktclasses

class Customer : Person {

    constructor(firstname: String, lastname: String, age: Int, id: Int, email:String) : super(firstname, lastname, age){
        this.id = id;
        this.email = email;
    }

    var id: Int = 0;
    var email: String = "";

    override fun toString(): String {
        return "Customer: ${id} ${super.firstname} ${super.lastname} ${email}";
    }

    override fun showId(id: Int){
        println("Id of customer: ${id}");
    }
}