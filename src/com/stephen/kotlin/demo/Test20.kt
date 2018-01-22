package com.stephen.kotlin.demo

/**
 * 抽象类
 *
 * 普通类中的方法，变成抽象类
 *
 */
open class BaseClass{

    open fun method(){

    }

}

abstract open class MyBaseClass : BaseClass(){

    override abstract fun method()

}

