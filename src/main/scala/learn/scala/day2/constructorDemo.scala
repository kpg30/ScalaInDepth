package learn.scala.day2

class additionOfNumbers{
  val x = 10
  val y = 20

  def addNumber() ={
    x + y
  }
  println(s"x = ${x} and y = ${y}")
  // println("x = " + x + " and y = " + y)

  val z = addNumber()
  println(s"z = ${z}")
  // println("z = " + z)
}
object constructorDemo {
  def main(args: Array[String]): Unit = {
    println("scala constructors example")

    val d1 = new additionOfNumbers

  }


}
