// scala constructors: Auxiliary Constructor
package learn.scala.day2

class demoClass3(val a: Int , val b:Double , val c:String){
  val x = a
  val y = b
  val z = c

  println(s"primary constructor values: x=$x and y=$y and z=$z")

  def addNumbers2() ={
    x + y
  }

}
object constructorDemo3 {
  def main(args: Array[String]): Unit = {
    val demo1 = new demoClass3(20, 20.5, "hello prasad")

    println("result is :" + demo1)


  }
}
