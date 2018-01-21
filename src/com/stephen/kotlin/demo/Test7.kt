package com.stephen.kotlin.demo

fun main(args: Array<String>) {

    println(conver2Uppercase("hello world"))
    println(conver2Uppercase(11))



}



fun conver2Uppercase(str: Any): String?{

    //is 关键字  相当于Java中的instanceof关键字
    if(str is String){

        return str.toUpperCase()
    }

    return null
}
