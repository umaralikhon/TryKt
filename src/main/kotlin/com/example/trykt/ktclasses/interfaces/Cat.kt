package com.example.trykt.ktclasses.interfaces

class Cat : Animal {

    constructor(name: String, age: Int){
        this.name = name;
        this.age = age;
    }

    override var age: Int = 0;
    override var name: String = "";

    override fun getInfo():String = "Name: ${name}, Age: ${age}";

}