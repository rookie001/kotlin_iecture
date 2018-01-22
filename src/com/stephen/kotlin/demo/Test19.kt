package com.stephen.kotlin.demo


/**
 * 接口的特性:
 * 1.跟Java 8以前的版本一样，不能直接实例化的
 * 2.在Kotlin当中，跟JDK 8以前不一样的是，它是可以拥有实例方法的
 * 3.在Kotlin当中，如果一个类继承了很多的实现（相同的签名），即，一个类（C）继承了B
 * 又实现了一个类（A），那么类（C）既拥有的了A接口中的method方法又拥有了
 * 类B中的一个method的方法，那么在Kotlin中我们的类（C）必须要重写该方法(如果你不重写，
 * 那么Kotlin编译器是不会知道它该去调用那个类(类A还是类B)方法）
 *
 */
interface A{

    fun method(){
        println("A")
    }

}

open class B{

    open fun method(){
        println("B")
    }

}


class C : A,B() {

    override fun method() {
        //现在大家可以看到，C类实现A与继承B，同时，A、B有拥有相同的方法签名，那现在我
        //想调用接口A于类B来指定我们到底需要调用那个方法，那么在Kotlin中，也给我提供了
        //一个语法，那么这个语法就是super<A>.method() ，那么<>里面的类型就表示是调用的
        //是那个类的或者是接口的方法
        super<A>.method()
        super<B>.method()

    }

}


fun main(args: Array<String>) {


    //var c : C = C()
    val c = C()
    c.method()

}