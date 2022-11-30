package com.example.trykt.loopandcondition

fun main() {

    val a = 10;
    val b = 15;

    if (a > b) {
        println("Num: ${a}");
    } else if (a < b) {
        println("Num: ${b}");
    } else {
        println("Nums ${a} ${b}");
    }


    //Возвращения значения if
    val c = if (a < b) a else b;
    println("num: ${c}");

    val d = if (a > b) {
        println("${a} > ${b}");
        a;
    } else {
        println("${a}<${b}");
        b;
    }

    println("num: ${d}");


    //When construction
    val name = "Alexa";
    when (name) {
        "Veronica" -> println("V");
        "Alisa" -> println("A");
        else -> println("я хз");
    }

    //Return in When
    val sum = 500;
    val rate = when (sum) {
        in 100..499 -> 100;
        in 500..999 -> 500;
        else -> 1000;
    }

    println(rate);
}