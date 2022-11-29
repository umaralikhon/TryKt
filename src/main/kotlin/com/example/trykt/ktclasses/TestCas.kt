package com.example.trykt.ktclasses

fun main() {
    var person = Person("Veronica", "Obedina", 20);
    println(person.firstname);
    println(person.lastname);
    println(person.age);

    var user= User("veronica", "1111");
    user.isActive = false;

    println(user.isActive);
}