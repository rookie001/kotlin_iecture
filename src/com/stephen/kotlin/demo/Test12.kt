package com.stephen.kotlin.demo

//需求：kotlin中的类、构造方法、init代码初始化块  区分kotlin中类于Java当中类的异同点


/**
 * notepad:
 *
 * 在Kotlin中类的声明不需要于文件名字相同，这是于java不同之一，另外再Kotlin中
 * 对象也是不需要使用关键new来进行创建
 *
 * 在Kotlin中，一个类可以有一个primary构造方法以及一个或多个secondary构造方法
 *
 * 一般来说primary 我们称之为主构造方法 secondary称为重构造方法
 *
 * primary 构造方法是类头(class header)的一部分，它位于类名后面，可以拥有若干个参数
 *
 * primary构造方法 书写形式 :
 *
 * class Demo constructor(参数...)
 *
 *
 * 在Java中，构造方法是要定义在类中的，但是在Kotlin中构造方法是定义在类的后面的
 *
 * 什么时候可以省略"constructor"关键字
 * 注意：如果primary构造方法没有任何注解(例如 "@newAPI")或是可见性关键字修饰(private 、public...)，那么constructor关键字可以省略
 * 并且它位于注解或可见性关键字修饰符后面
 *
 *
 * 在Kotlin中类或对象中的字段或是属性，是通过init{} 代码块来初始化值  init{....} 这个就是primary构造方法的body
 *
 *
 *
 * secondary 构造方法
 *
 * 对于一个secondary构造方法，必须要直接或间接调用primary构造方法
 *
 *
 *
 *
 *
 */

class MyClass constructor(username: String) {

    //kotlin如何定义成员变量呢？如下:
    private val username: String = username.toUpperCase()



    init {//init{}  主要作用是给类或者对象的成员变量赋初始值,当然也可以直接给成员变量赋值
        println(username)
    }




}


fun main(args: Array<String>) {


    var myClass: MyClass = MyClass("lisi")




}









