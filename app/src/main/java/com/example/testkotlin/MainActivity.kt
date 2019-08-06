package com.example.testkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.View.OnClickListener
import kotlinx.android.synthetic.main.activity_main.bbbb
import kotlinx.android.synthetic.main.activity_main.button

class MainActivity : AppCompatActivity(),OnClickListener {

  fun addss(a: Int, b: Int):Int{
    return a + b
  }

  val a = 1
  val b = 3

  fun toPerson(o: Any?):Boolean{
    val person = o as? Person ?: if(a > b){
      val d = C()
      true
    }else{
      false
    }
    return true
  }

  fun inn(str: String?){
    val len: Int = str!!.length
  }

  private val name: String? = "zhangchao"

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    button.setOnClickListener{bbbb.text = "zhangchaojhh"}
//    println(name?.toUpperCase())
//    val ss: String? = "zhangchao"
//    ss?.let { inn(it.toLowerCase()) }
  }

  override fun onClick(v: View?) {
    if(v?.id == button.id){
      bbbb.text = "zhangchaojhh"
    }

  }

}
