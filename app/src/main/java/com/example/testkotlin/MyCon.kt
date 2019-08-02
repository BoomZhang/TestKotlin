package com.example.testkotlin

/**
 * 创建时间: 2019/08/01
 * 作者: zhangchao042@ke.com
 * 描述:
 */
class MyCon : Constructors{

  override var x = 2

  constructor(i: Int, str: String):super(i)

  override fun add(a: Int, b: Int): Int {
    return a * b
  }

}