package com.example.trykt.ktclasses.interfaces

fun main() {

    var human: Human= Man("Tom", "Henks");

    println(human);
    human.hello();
    human.bye();

    var cat: Animal = Cat("Masyana", 2);
    println(cat.getInfo());
}