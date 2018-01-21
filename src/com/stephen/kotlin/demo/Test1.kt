package com.stephen.kotlin.demo

import java.util.function.Consumer


fun main(args : Array<String>){


    //println("Hello World!")
    //集合的构建
    val list : List<String> = listOf("Hello","world","Hello World")


    for (str in list){

        println(str)

    }


    println("--------改进版----------")


    list.forEach(Consumer { println(it) })

    println("---------增强改进版---------")

    //方法引用
    list.forEach(System.out::println)



}

