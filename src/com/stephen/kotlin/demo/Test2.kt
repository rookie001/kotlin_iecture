package com.stephen.kotlin.demo

import java.util.function.Consumer

fun main(args: Array<String>) {

    //println("Hello World")



    val list : List<String> = listOf("hello","world","hello world");


    for (str in list){

        println(str)
    }


    list.forEach(Consumer { println(it) })

    //list.forEach(System.out::println)

    println(sum(1,2))


    println(sum2(3,4))


    println(myPrint(1,2))

    println(myPrint(2,3))


    println(myPrint1(3,1))



}


fun sum(a : Int,b : Int) : Int{


    return a+b;
}

//简化

fun sum2(a : Int,b: Int) /*: Int8*/ = a + b

//无返回值的

fun myPrint(a: Int,b: Int) : Unit{

    println(a + b)

}


//字符串模板
fun myPrint1(a : Int,b: Int){


    //println("a + b = "+a +b)

    println("$a + $b = ${a + b}")


}






