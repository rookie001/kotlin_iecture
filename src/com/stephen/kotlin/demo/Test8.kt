package com.stephen.kotlin.demo

fun main(args: Array<String>) {

    //数组
    var arr: IntArray = intArrayOf(1,2,3,4,5)


    for (item: Int in arr){
        println(item)
    }

    println("------")
    //遍历角标以及角标值
    //第二种遍历方式
    for (i: Int in arr.indices){


        println("array[$i] = ${arr[i]}")

    }

    println("-------")

    //第三种遍历方式,可以同时遍历角标以及角标值

    for ((index,value) in arr.withIndex()) {


        println("array[$index] = $value")


    }


}