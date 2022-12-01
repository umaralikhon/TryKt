package com.example.trykt.ktclasses.interfaces

abstract class Human (var name: String){

    fun hello(){
        println("Hello ${name}");
    }

    abstract fun bye();
}