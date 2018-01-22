package com.stephen.kotlin.demo


/**
 *
 *  属性重写
 *
 *  总结：
 *  在kotlin当中，对于方法的重写还是对其属性的重写
 *  对于关键字的添加都是一样
 *
 */
open class MyParent{

    open val name: String = "parent"



}

class MyChild: MyParent(){

    override val name: String = "child"


}

/**
 *对于属性的重写，以上写法有点太过冗余，可以简化成以下形式
 *
 */

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
 *
 *  表象上看：val and var 所表示的范围不一样
 *
 *  其实本质上，val相当于get方法；var相当于get于set方法
 *
 *  即：val相当于读，var相当于读、写，那么为什么val不能重写var呢？
 *  这是因为在Kotlin当中，一个属性是不允许让其从var(可读、可写)再变成
 *  可读状态的
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



