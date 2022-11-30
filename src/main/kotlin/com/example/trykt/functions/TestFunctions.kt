package com.example.trykt.functions

fun myFirstFunction(): Int {
    return 0;
}

fun mySecondFunction(a: Long): Int {
    return a.toInt()
}

fun myThirdFunction() {
    println("Hello from third fun")
}

fun myFourthFunction(a: Long, b: Double) = a + b;

fun display() {
    println(myFirstFunction());
    println(mySecondFunction(5));
    println(myThirdFunction());
    println(myFourthFunction(2, 5.1));
}

fun varArgExample(vararg str: String) {
    for (s in str) {
        println(s);
    }
}

fun spreadExample(vararg numbers: Int, koef: Int) {
    for (num in numbers) {
        println("${num * koef}");
    }
}

//Однострочные функции
fun multiple(a: Int, b: Int): Int = a * b;

//Локальные фунции
fun localFun(age: Int): Boolean {

    fun checker(a: Int): Boolean {
        var temp: Boolean = when (a) {
             in 0..150 -> true;
            else -> false;
        }
        return temp;
    }
    return checker(age);
}

fun simpleTypeFun(){
    println("This is simple type function");
}