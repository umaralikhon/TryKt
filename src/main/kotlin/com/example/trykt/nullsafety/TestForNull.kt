package com.example.trykt.nullsafety

import com.example.trykt.functions.multiple

fun main(){

    var temp:String? = testForNull();
    var size = temp!!.length

    println(temp);
    println(size);

    println(multiple(5,9));
}

fun testForNull() : String?{
    return "Hello world";
}