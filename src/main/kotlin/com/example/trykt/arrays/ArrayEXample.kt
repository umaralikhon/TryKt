package com.example.trykt.arrays

fun main() {

    val intArr: Array<Int>;
    intArr = arrayOf(1,2,3,4,5,5,6,7);

    for(n in intArr){
        print("${n} \t");
    }
    println();

    val strArr = Array(3, {"Hello"});
    for (n in strArr){
        println(n);
    }

    var i = 0;
    while (i in strArr.indices){
        println(strArr[i]);
        ++i;
    }

    //Проверка наличия элемента в массиве
    println(4 in intArr);
    println("Fuck off" in strArr);
}