package com.stephen.kotlin.demo


/**
 * 继承 方法的继承  方法final
 *
 * 小结：
 * 1.在Kotlin当中，关于重写的特点，如果一个子类重写了父类当中的某一个方法，那么
 * 在Kotlin当中，对于子类的重写的这个方法，必须加上override关键字
 *
 * 2.在kotlin当中，如果一个父类的方法需要被子类的重写，那么被子类重写的这个父类的方法
 * 必须加上open关键字
 *
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

    final override fun name(){//final 修饰 表示的是终态，即，这个方法不能被它的子类所改写
        println("Orange")
    }

}

fun main(args: Array<String>) {

    val apple = Fruit()

    apple.name()

    apple.expirationDate()
}
