package com.stephen.kotlin.demo

fun main(args: Array<String>) {


    //定义一个集合
    var array: List<String> = listOf<String>("hello","world","hello world","welcome","goodbye")

    for (it in array){

        println(it)
    }

    println("------")

    when{

        "world" in array -> println("world in collection")

    }


    println("------")

    //需求 ： 筛选出array集合中 字符串 长度 > 5 并将其转换成大写，然后进行自然排序，最后输出

    array.filter { it.length > 5 }.map { it.toUpperCase() }.sorted().forEach { println(it) }






}