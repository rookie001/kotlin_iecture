package com.stephen.kotlin.demo


/**
 * kotlin传统的构造方法写法对字段进行赋值
 *
 * 底层Note:
 *
 * 如果一个非抽象类，没有任何构造方法(primary constructor or secondary constructor)
 * 那么系统会自动为其生成一个构造方法
 *
 *
 */
class Person constructor(username: String){//primary constructor

    private var username: String;

    private var age: Int;

    private var address: String;



    init {

        println("primary constructor")

        this.username = username
        this.age = 20
        this.address = "beijing"

    }


    //secondary constructor 是比较特殊的构造方法，因为它没有名字
    //secondary constructor 必须直接或者间接的调用构造方法

    constructor(username: String,age: Int) : this(username){

       // println(username + ","+age)
        println("secondary 带两个参数的")

        this.username = username
        this.age = age
        this.address = "beijing"

    }


    constructor(username: String,age: Int,address: String) : this(username,age) {
        println("secondary 带三个参数的")
        this.address = address

    }


    fun printInfo(){
        println("username : ${this.username},age : ${this.age},address : ${this.address}")
    }






}

fun main(args: Array<String>) {


    //val person: Person = Person("zhangsan")
    //val person1: Person = Person("lisi",30)
    val person2: Person = Person("wangwu",40,"shanghai")

    //person.printInfo()
    //person1.printInfo()
    person2.printInfo()




}