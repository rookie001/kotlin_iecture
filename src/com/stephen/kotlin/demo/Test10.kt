package com.stephen.kotlin.demo

fun main(args: Array<String>) {



    var a = 5

    var b = 10


    if(a in 2..b){//表示的是范围  a 是否在2 ~ 10之间的数字


        println("a in the range")

    }

    if (a !in 2..b){//表示的是范围 a 不是在2 ~ b(10) 之间的数 就打印

        println("out of the range")

    }


    println("--------")


    for (i in 2..10){// 表示的是 2 到 10 的一个闭区间

        println(i)

    }

    println("-------")


    for (i in 2.rangeTo(10)){//这个等同于上面的for循环，效果是一样的

        println(i)

    }

    println("--------")

    for (i in 2..10 step 2){//表示的是2 ~10 范围内进行步进 每次步进 2 ，顺序步进
        println(i)
    }

    println("------")
    //倒序步进
    for (i in 10 downTo 2 step 3){//表示的是 从10开始步进(范围： 2 ~ 10）每次步进3  打印： 10,7,4
        println(i)
    }







}