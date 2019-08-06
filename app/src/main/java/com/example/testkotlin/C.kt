package com.example.testkotlin

/**
 * 创建时间: 2019/08/02
 * 作者: zhangchao042@ke.com
 * 描述:
 */
class C :A(){

  private lateinit var a: Child

  var ll = arrayOf(1,2,3)

  var str: String
    get() = this.toString()
    set(value){

    }

  override var age: Int
    get() = 123
    set(value) {
      value + 100
    }

  val size: Int get() = this.ll.size

//  var stringRepresentation: String
//    get() = this.toString()
//    set(value) {
//      setDataFromString(value) // 解析字符串并赋值给其他属性
//    }


  override fun f() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

}