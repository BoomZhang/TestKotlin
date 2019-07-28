package com.example.testkotlin

/**
 * 创建时间: 2019/07/25 18:05
 * 作者: zhangchao042@ke.com
 * 描述:
 */
fun vars(vararg v:Int){
  for(vt in v){
    println(vt)
  }
}

fun printSum(a: Int, b: Int): Unit {
  println("sum of $a and $b is ${a + b}")
}

// 测试
fun main(args: Array<String>) {
  var a = 4
  var b = 5
  //var sum = a + b;
  println("a - b = ${a - b}")
  println("Hello world")
  printSum(7, 8)
  vars(10)
}
