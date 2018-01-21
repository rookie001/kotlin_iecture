package com.stephen.kotlin.demo


/**
 * 属性重写
 */
open class MyParent{

    open val name: String = "parent"



}

class MyChild: MyParent(){

    override val name: String = "child"


}

//以上写法有点太过冗余，可以简化成以下形式

open class MyParent2{

    open val name: String = "myParent2"


}

//通过primary构造方法中传入参数的时候，重写属性
class MyChild2(override val name: String = "myChild2"): MyParent2(){


}


/**
 * 以下演示了var and val 的区别
 *
 * 1.val 可以override val
 *
 * 2.var 可以override val
 *
 * 3.val 无法 override var
 *
 * 本质上，val相当于get方法；var相当于get于set方法
 *
 *
 *  表象上看：val and var 所表示的范围不一样
 *
 *
 */
open class MyParent3{

    open val name: String = "myParent3"

    open fun method(){
        println("myParent3")
    }

}

class MyChild3: MyParent3(){

    override var name: String = "myChild3"

    override fun method() {
        super.method()
    }


}




fun main(args: Array<String>) {

    var myChild = MyChild()

    var myChild2 = MyChild2()

    var myChild3 = MyChild3()



    println(myChild.name)

    println(myChild2.name)

    println(myChild3.name)

}



