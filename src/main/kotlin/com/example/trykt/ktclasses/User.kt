package com.example.trykt.ktclasses

class User(private var username: String, private var password: String) {

    var isActive: Boolean = true
        set(isActive) {
            field = isActive;
        }
        get() {
            return false;
        }
}