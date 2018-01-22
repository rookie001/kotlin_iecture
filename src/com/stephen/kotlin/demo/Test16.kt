package com.stephen.kotlin.demo

/**
 * 在Kotlin中，所有的类在默认的情况下都是无法被继承的
 * 换句话说，在Kotlin中，所有的默认情况下都是final的
 *
 * 至于Kotlin这样做的目的是因为在Java编码时，有的类是不需要被继承的，这可能
 * 就造成乱继成，基于Java这样的一种缺陷，那么Kotlin在源头上就禁止了这样的做法
 *
 * 问题：为什么继承Parent时需要指定父类的构造方法?
 *
 * 回答：这是因为在kotlin当中，构造方法是显示的声明的
 *
 */
open class Parent(username: String){

}


class Child(username: String) : Parent(username){

}



open class Parent2(username: String){


    constructor(username: String,age: Int):this(username)

}

open class Parent3{

}

class Child3:Parent3{
    constructor()
}


/**
 * 1.在Kotlin当中，如果一个类没有primary构造方法，那么这个类的每个secondary构造方法就
 * 需要通过super关键字来初始化父类类型，或是通过其他secondary构造方法来完成这个初始化
 * 父类的任务
 *
 * 不同的secondary构造方法可以调用父类型不同的构造方法
 *
 *
 *
 */
class Child2 : Parent2{


    constructor(username: String,age: Int) : super(username,age)
}