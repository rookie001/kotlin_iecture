package com.stephen.kotlin.demo


/**
 * 继承 方法的继承  方法final
 */
open class Fruit{


    open fun name(){

        println("Fruit")

    }

    fun expirationDate(){


        println("1 mouth")

    }


}

class Apple : Fruit(){

    override fun name() {
        println("Apple")
    }
}


open class Orange: Fruit(){

    final override fun name(){
        println("Orange")
    }

}

fun main(args: Array<String>) {

    val apple = Fruit()

    apple.name()

    apple.expirationDate()
}
