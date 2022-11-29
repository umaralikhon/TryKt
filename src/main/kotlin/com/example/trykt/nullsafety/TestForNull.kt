package com.example.trykt.nullsafety

fun main(){

    var temp:String? = testForNull();
    var size = temp!!.length

    println(temp);
    println(size);


}

fun testForNull() : String?{
    return null;
}