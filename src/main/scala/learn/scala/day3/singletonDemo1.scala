// scala singleton object example
package learn.scala.day3

object demoClassB{ // to define object use 'object' keyword
  val x = 5
  val y = 5.5

  def addNumber()={
    x + y
  }

  println(s"x=$x and y=$y")
}

object singletonDemo1 {

  def main(args: Array[String]): Unit = {
    //val demoB = new demoClassB // we caanot create object from object
    println(demoClassB.x, demoClassB.y) // access variable - objectName.variableName

    val result = demoClassB.addNumber() // access method - objectName.methodName
    println("result of method inside object is: " + result)

  }
}
