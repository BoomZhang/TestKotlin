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

fun add(a: Int, b: Int): Int {
  //println("sum of $a and $b is ${a + b}")
  return a + b
}

fun linkStr(s1: String,s2: String) = s1 + s2

fun parseInt(str: String): Int? {
  return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
  val x = parseInt(arg1)
  val y = parseInt(arg2)

  // 直接使用 `x * y` 会导致编译错误，因为他们可能为 null
  if (x != null && y != null) {
    // 在空检测后，x 与 y 会自动转换为非空值（non-nullable）
    println(x * y)
  }
  else {
    println("either '$arg1' or '$arg2' is not a number")
  }
}

fun describe(obj: Any): String =
  when (obj) {
    1          -> "One"
    "Hello"    -> "Greeting"
    is Long    -> "Long"
    !is String -> "Not a string"
    else       -> "Unknown"
  }

fun MutableList<Int>.swap(index1: Int, index2: Int) {
  val tmp = this[index1] // “this”对应该列表
  this[index1] = this[index2]
  this[index2] = tmp
}

fun read(b: Array<Byte>, off: Int = 0, len: String = "zhang"){
  println(b[0])
  println(off)
  println(len)
}

// 测试
fun main(args: Array<String>) {
//  val a: Int = 1  // 立即赋值
//  val b = 2   // 自动推断出 `Int` 类型
//  val c: Int  // 如果没有初始值类型不能省略
//  c = 3       // 明确赋值
//  println("a = $a, b = $b, c = $c")
//  var a = 1
//  // 模板中的简单名称：
//  val s1 = "a is $a"
//
//  a = 2
//  // 模板中的任意表达式：
//  val s2 = "${s1.replace("is", "was")}, but now is $a"
//  println(s2)
//  printProduct("6", "7")
//  printProduct("a", "7")
//  printProduct("a", "b")

//  val items = listOf("apple", "banana", "kiwifruit")

//  for (item in items) {
//    println(item)
//  }
//  for (index in items.indices) {
//    println("item at $index is ${items[index]}")
//  }

//  var index = 0
//  while (index < items.size) {
//    println("item at $index is ${items[index]}")
//    index++
//  }

//  println(describe(1))
//  println(describe("Hello"))
//  println(describe(1000L))
//  println(describe(2))
//  println(describe("other"))

//  val x = 99
//  val y = 9
//  if (x in 1..y+1) {
//    println("fits in range")
//  }else{
//    println("no")
//  }

//  val list = listOf("a", "b", "c")
//
//  if (-1 !in 0..list.lastIndex) {
//    println("-1 is out of range")
//  }
//  if (list.size !in list.indices) {
//    println("list size is out of valid list indices range, too")
//  }

//  for (x in 1..10 step 2) {
//    print(x)
//  }
//  println()
//  for (x in 9 downTo 0 step 3) {
//    print(x)
//  }

//  val items = setOf("apple", "banana", "kiwifruit","orange")
//  when {
//    "orange" in items -> println("juicy")
//    "apple" in items -> println("apple is fine too")
//  }

//  var x = 1
//  when (x) {
//    0, 1 -> print("x == 0 or x == 1")
//    else -> print("otherwise")
//  }

//  for (i in 1..100) { …… }  // 闭区间：包含 100
//  for (i in 1 until 100) { …… } // 半开区间：不包含 100
//  for (x in 2..10 step 2) { …… }
//  for (x in 10 downTo 1) { …… }
//  if (x in 1..10) { …… }

//  val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
//  fruits
//    .filter { it.startsWith("a") }
//    .filter { it.endsWith("o") }
//    .sortedBy { it }
//    .map { it.toUpperCase() }
//    .forEach { println(it) }
//
//  for (i in 100 downTo 10 step 10){
//    println(i)
//  }
//  var nul = 123.5e10
//  var nuk = 1_000_000
//
//
//  println(nuk)
//  val arr = arrayOf(1,2,3,4,5)
//  arr.forEach { println(it) }

//  val s = "abc" + 1
//  println(s + "def")

//  val text = """
//    for (c in "foo")
//        print(c)
//  """

//  val text = """
//    |Tell me and I forget.
//    |Teach me and I remember.
//    |Involve me and I learn.
//    |(Benjamin Franklin)
//    """.trimMargin()
//
//  println(text)

//  loop@ for (i in 1..9) {
//    for (j in 1..9) {
//      if (i == j){
//        return @loop
//      }
//      print(j)
//    }
//  }

//  var p = Person("zhangchao")
//  print(p.customerKey)

//  var a = Student("zhanbch")
//  println(a.name)
//  a.name = "z"
//  println(a.name)

//  val list = mutableListOf<Int>(1,2,3)
//  list.swap(0,1)
//  println(list.toString())

//  var vv = User()
//  println(vv.toString())
//
//  read(arrayOf(0x00),len = "ada")
//
//  val a: String? = null
//
//  val b: String = a ?: ""
//
//  val arr = arrayOf(1)
//  val arr2 = arrayOfNulls<Int?>(4)

//  val a = 10
//  val b = 20
//
//  val max = if (a > b) {
//    println("Choose a")
//    a
//  } else {
//    println("Choose b")
//    b
//  }
//  println(max)
//
//  for (i in 1..1000) {
//    println(i)
//    for (j in 1..i step 2){
//
//    }
//  }
//
//  val kk = User()
//  val a = C()
//  a.f()

  val sourceList = mutableListOf(1, 2, 3, 1)
  val copySet = sourceList.toSet()
  println(copySet)


//  val copyList = sourceList
//  println(copyList)
//  sourceList.add(4)
//  println(copyList)

  //val copyList = sourceList.toMutableList()
//  val readOnlyCopyList = sourceList.toList()
//  sourceList.add(4)
//  println("Copy size: ${copyList.size}")
//
//  //readOnlyCopyList.add(4)             // 编译异常
//  println("Read-only copy size: ${readOnlyCopyList.size}")

}

