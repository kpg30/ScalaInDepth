package com.test.learn.scala

object AdditionNumbers {
  def addTwoNumbers(a: Int, b: Int): Int = {
    var c = a + b
    return c
  }
  def main(args: Array[String]): Unit = {
      println("welcome to scala Functions, Happy Learning!")
      println()
      var result = addTwoNumbers(10,5)
      println("Addition of two numbers is :" + result)
  }
}
