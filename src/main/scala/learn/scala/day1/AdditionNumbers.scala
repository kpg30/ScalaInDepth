package learn.scala.day1

object AdditionNumbers {
  def addTwoNumbers(a: Int, b: Int): Int = { //* not mandatory to specify the return type. type infer
    val c = a + b
    return c

    //** not mandatory to specify the 'return' keyword
    //*** if you specify the 'return' keyword. always you need to specify 'return type'.
    //*** if you specify the return_type. no need to mention return keyword
  }
  def main(args: Array[String]): Unit = {
      println("welcome to scala Functions, Happy Learning!")
      println()
      val result = addTwoNumbers(10,5)
      println("Addition of two numbers is :" + result)
  }
}
