// example: parameterized constructor (Primary Constructor)
package learn.scala.day2

class demoExample(val a:Int, val b:Double, val c:String){
  val x: Int = a
  val y: Double = b
  val z: String = c

  def addNumbers() = {
    x + y
  }
  println(s"x = ${x} and y = ${y} and z = ${z}")

}

object constructorDemo1 {
  def main(args: Array[String]): Unit = {
  println("scala constructors example2")

    val d2 = new demoExample(3, 7.5, "prasad")

    val result = d2.addNumbers()
    println(s"result of $result")
  }

}
