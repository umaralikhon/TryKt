package com.example.trykt

fun main() {

    var name: String = "Alex";
    var greeting: String = "Mother fucker";

    println("Hello $name $greeting");

    var a: Int = 3;
    var b: Int = 2;

    println("C: ${a + b}")

    val userJava = UserJava("veronica@java.com");
//    println(userJava.email)

    var firstname: Any = "Veronica";
    println(firstname);

    firstname = 45;
    println(firstname + 5);

    println("Enter your name: ");
    var lastname = readLine();

    println("Hello $lastname");

    var age = readLine();
    println("${ (age?.toInt() ?: 0) + 50 }");
}