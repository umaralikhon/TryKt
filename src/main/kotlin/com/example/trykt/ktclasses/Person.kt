package com.example.trykt.ktclasses

import lombok.Data
import lombok.NoArgsConstructor

@Data
open class Person constructor(firstname: String, lastname: String, age: Int) {
    constructor() : this("", "", 0);
    constructor(firstname: String) : this("", "", 0);

    var firstname: String = "None";
    var lastname: String = "None";
    var age: Int = 0;

    private var email: String = "18"
        set(email) {
            field = email;
        }
        get():String {
            return this.email;
        }

    init {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    init {
        this.lastname = lastname;
        this.age = age;
    }
}