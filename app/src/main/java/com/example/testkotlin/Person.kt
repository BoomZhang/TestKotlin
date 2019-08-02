package com.example.testkotlin

/**
 * 创建时间: 2019/07/31 10:31
 * 作者: zhangchao042@ke.com
 * 描述:
 */
open class Person(name: String) {

  val customerKey = name.toUpperCase()

  init {
    println("First initializer block that prints ${name}")
  }

}