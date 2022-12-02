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
    empl.salary=6000;
    println("Salary: ${empl.salary}");

    var customer: Customer = Customer( "Veronica", "Obedina", 20, 1, "veronica@example.com");
    println("\n CUSTOMER");
    println(customer.id);
    println(customer.firstname);
    println(customer.lastname);
    println(customer.toString());

    person1.showId(1);
    customer.showId(customer.id);

    var pers: Person = Customer("A", "B", 18, 1, "sagfdg");
    println(pers);
}