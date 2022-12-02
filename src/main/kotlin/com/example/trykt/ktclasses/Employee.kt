package com.example.trykt.ktclasses

class Employee : Person {
    constructor(firstname: String, lastname: String, age: Int) : super(firstname, lastname, age);

    var salary: Int = 5000
}