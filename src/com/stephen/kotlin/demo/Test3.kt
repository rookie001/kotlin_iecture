package com.stephen.kotlin.demo

fun main(args: Array<String>){

    //常量 val 相当于JAVA中的final关键字
    val a: Int = 1

    //a = 2 错误


    val b = 2


    //定义变量

    var c: Int = 4

    c = 1




    //注释，kotlin里面的注释其实跟Java类似，只不过kotlin中的注释是可以嵌套的


    var x = 10

    var y: Byte = 20

    //x = y; 这种赋值是错误的，在kotlin中，变量之间的赋值必须是相同类型的，对于Java来说小范围值是可以复制给大范围的值的

    //如果碰到这种情况的话，那么你必须要转化成要赋值的相同类型

    x = y.toInt()


    println(x)






}