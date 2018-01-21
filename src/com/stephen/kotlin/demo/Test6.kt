package com.stephen.kotlin.demo

fun main(args: Array<String>) {


    //printMultiply("2","3")

    printMultiply("a","3")

}


fun conver2Int(str: String): Int?{


    try {

        return str.toInt();


    }catch (ex: NumberFormatException){


        return null;

    }

}


fun printMultiply(a: String,b: String){


    val a2Int = conver2Int(a)//其实返回的是Int?  相当于JDK 8中Optional

    var b2Int = conver2Int(b)



    //println(a2Int * b2Int)

    if(null != a2Int && null != b2Int)
    {
        println(a2Int * b2Int)
    }else{

        println("param is not int")

    }



}


fun printMultiply2(a: String,b: String){


    val a2Int = conver2Int(a)//其实返回的是Int?  相当于JDK 8中Optional

    var b2Int = conver2Int(b)


    //println("a = $a,b = $b")


    //println(a2Int * b2Int)//错误


    if(null == a2Int){
        println("param not int")
    }else if(null == b2Int){
        println("param not int")
    }else{

        println(a2Int * b2Int)

    }





}