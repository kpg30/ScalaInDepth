package com.test.learn.scala

class Mobile1 {
  var model = "14-promax"
  var mobilePrice = "$1100"
  private var cCost = 11000

  def cost(company: String) = {
    company + " model is " + model + " and price is " + mobilePrice
  }

  def checkCost() = {
    cCost = 100
    cCost
  }
}
object demoClassObject1 {
  def main(args: Array[String]): Unit = {
    println("start debugging your code !!!")

    var newMobile= new Mobile1
    var result = newMobile.cost("iphone")

    println("mobile information : " + result)
    println(newMobile.checkCost())
  }
}
