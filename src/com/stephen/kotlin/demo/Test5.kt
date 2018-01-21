package com.stephen.kotlin.demo

fun main(args: Array<String>){


    /*var x = 10
    var y = 20


    var max: Int

    var min: Int


    if(x > y){

        max = y
        min = x

    }else{
        max = x
        min = y
    }*/


    /*var x = 10
    var y = 20

    var max = if (x > y) x else y
    var min = if(x > y) y else x*/


    //还可以这样写
    var x = 10
    var y = 20
    var max = if( x > y){
        print("x > y")
        x
    }else{
        println("x < y")
        y
    }

    var min = if(x > y){

        println(" x > y ")

        y

    }else{
        println(" x > y ")

        x
    }





    println("max = $max,min = $min")


}