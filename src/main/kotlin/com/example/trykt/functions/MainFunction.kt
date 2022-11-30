package com.example.trykt.functions

fun main() {
    display();
    varArgExample("Hello", "Mother", "Fucker");

    val arr: IntArray = intArrayOf(0, 1, 2, 3, 4, 5, 7);
    spreadExample(*arr, koef = 2);

    println(localFun(155));

    //Types of messages
    val simpleType: () -> Unit;
    simpleType = ::simpleTypeFun;
    simpleType();

    val anotherType: (Int, Int) -> Int;
    anotherType = ::multiple;
    println(anotherType(5, 7));

    //High level function
    highFun(simpleType);
}

//High type function
fun highFun(message: () -> Unit) {
    message();
}