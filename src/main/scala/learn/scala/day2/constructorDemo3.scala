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
  def this(){
    this(2,2.5,"hey prasad")
    println("auxiliary constructor take 0 parameters")
  }
  def this(a:Int) {
    this(a, 2.5, "hey prasad")
    println("auxiliary constructor take 1 parameters")
  }
  def this(a:Int, c:String) {
    this(a, 2.5, c)
    println("auxiliary constructor take 2 parameters")
  }

}
object constructorDemo3 {
  def main(args: Array[String]): Unit = {
    val demo1 = new demoClass3(20, 20.5, "hello prasad")
    val demo2 = new demoClass3()
    val demo3 = new demoClass3(10)
    val demo4 = new demoClass3(20,"bye")

  }
}
