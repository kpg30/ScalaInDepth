package com.test.learn.scala.day2

class Car {
  var cost= 10
  var roadTax=100

  def cost(basic:Int):Int={
    basic + cost + roadTax
  }
}

object demoClassObject {
  def main(args: Array[String]): Unit = {

    println("Scala [class, object] Happy Learning !!")
    println("---------------------------------")

    var newCar = new Car
    println(newCar.cost)
    newCar.cost= 1000
    println(newCar.cost)

    var a = new Car
    println(a.cost)
  }

}
