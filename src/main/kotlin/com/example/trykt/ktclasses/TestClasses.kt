package com.example.trykt.ktclasses

fun main() {

    val person1: Person = Person("Alisa", "Obedina", 25);
    var person2: Person = Person();
    var person3: Person = Person("Obedina", "Alexa", 30);

    println(person1.firstname);
    println(person1.lastname);
    println(person1.age)

    person1.firstname = "Veronica";
    person1.lastname = "Obedina";
    person1.age = 20;

    println(person1.firstname);
    println(person1.lastname);
    println(person1.age);

    println(person3.firstname);
    println(person3.lastname);
    println(person3.age);


    var empl: Employee = Employee("Veronica", "Obedina", 22);
    println(empl.firstname);
    println(empl.lastname);
    println(empl.age);

    var user: Person = Person();
    user
}