// scala constructor : with Default parameters (primary constructor)
package learn.scala.day2

class demoClass2(val a: Int = 10, val b:Double = 10.5, val c:String="prasad"){
  val x = a
  val y = b
  val z = c

  def addNumbers2() ={
    x + y
  }
  println(s"x=$x and y=$y and z=$z")
}

object constructorDemo2 {
  def main(args: Array[String]): Unit = {

    val demo1 = new demoClass2
    val demo2 = new demoClass2(20, 20.5, "hello prasad")
    val demo3 = new demoClass2(25)
    val demo4 = new demoClass2(25,30.5,"")

    println("result is :" + demo1)
    println("result is :" + demo2)
    println("result is :" + demo3)
    println("result is :" + demo4)

  }

}
