package com.example.testkotlin

/**
 * 创建时间: 2019/07/31 11:04
 * 作者: zhangchao042@ke.com
 * 描述:
 */
class Student: Person{


  private var name: String = "d"
    get() = field
    set(value) {
      field = value + value
    }

  var kkk:String = "zhang"

  val age: Int = 0

  val isEmpty: Boolean
    get() = this.age == 0

  init {
    println("Student name is aaaa")
  }
  constructor(name: String) : super(name) {
    println("fdfdf")
  }
//  init {
//
//  }
}