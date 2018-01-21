package com.stephen.kotlin.demo

/**
 *
 * Test14例子的简化写法
 *
 *
 * 在primary constructor 对传入的参数使用private val/var 进行修饰，就相当于在类中定义了
 * 字段，并且给相应的字段进行赋值
 *
 *
 * 在实际开发中，这种简化的写法是很广的
 *
 */
class Student (private val username: String,private val age: Int,private var address: String){




    fun printInfo(){


        println("username : $username,age : $age,address : $address")

    }


}


/**
 * 如果一个primary构造方法拥有注解或者是可见性修饰符
 * 那么constructor关键字是不能省略的，并且该关键字位于修饰符以及注解后面
 */
class Student2 private constructor(username: String){

}


/**
 *
 * question ： 给primary构造方法赋初始值？
 *
 * 结论 ： 在Kotlin当中，在JVM上编程的话，如果类的primary 构造方法的所有参数都拥有默认值，
 * 那么kotlin编译器就会为这个类生成一个不带参数的构造方法，而这个不带参数的构造方法会使用这些参数的默认值，
 * 这样做的目在于可以跟Spring等框架更好地集成
 */
class Student3 (private val username: String = "zhangsan"){

}



fun main(args: Array<String>) {

    val student = Student("zhangsan",12,"guangzhou")

    student.printInfo()


}