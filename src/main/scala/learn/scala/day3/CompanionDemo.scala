// Scala Program: Companion Object/ Class example
package learn.scala.day3
class CompanionDemo{
  var x = 50
  def getVale() {
    print(s"value of x=${x} is and value of y=${CompanionDemo.y} is ")
  }
}

object CompanionDemo {
  var y = 30

  def main(args: Array[String]): Unit = {
  val myDemo= new CompanionDemo()

  println(s"value of x is ${myDemo.x}")
  println(s"value of y is ${y}")

  myDemo.getVale()

  }

}
