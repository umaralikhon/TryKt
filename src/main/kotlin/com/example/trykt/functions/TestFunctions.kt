package com.example.trykt.functions

fun myFirstFunction(): Int{
    return 0;
}

fun mySecondFunction(a: Long): Int{
    return a.toInt()
}

fun myThirdFunction(){
    println("Hello from third fun")
}

fun myFourthFunction(a: Long, b: Double) = a + b;

fun display(){
    println(myFirstFunction());
    println(mySecondFunction(5));
    println(myThirdFunction());
    println(myFourthFunction(2,5.1));
}