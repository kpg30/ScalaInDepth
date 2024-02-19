package learn.scala.day3

class demoClassA{
  val x = 5
  val y = 5.5

  def addNumber()={
    x + y
  }

  println(s"x=$x and y=$y")
}

object singletonDemo {

  def main(args: Array[String]): Unit = {

    val demoA = new demoClassA
    val result = demoA.addNumber()
    println("result of method inside class is: " + result)

  }
}
