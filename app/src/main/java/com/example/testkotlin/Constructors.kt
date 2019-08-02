package com.example.testkotlin

/**
 * 创建时间: 2019/08/01
 * 作者: zhangchao042@ke.com
 * 描述:
 */
open class Constructors(i: Int){


  open var x = 1

  init {
    println("Init block")
  }

  open fun add(a: Int, b: Int): Int{
    return a + b
  }

//  constructor(i: Int, str: String){
//    println("Constructor")
//  }
//
//  constructor(i: Int, ch: Char){
//    println("Constructor")
//  }

}