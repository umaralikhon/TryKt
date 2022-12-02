package com.example.trykt.ktclasses.interfaces

class Man : Human{

    var lastname:String = "";

    constructor(firstname: String, lastname:String) : super(firstname){
        this.lastname = lastname;
    }

    override fun bye() {
        println("Bye mother fucker")
    }

    override fun toString(): String = "firstname: ${super.name} lastname: ${lastname}";
}