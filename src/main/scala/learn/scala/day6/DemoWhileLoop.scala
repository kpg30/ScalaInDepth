package learn.scala.day6

object DemoWhileLoop {
  def main(args: Array[String]): Unit = {

    var x = 5

   /* while (x < 10) {                // x = 5 < 10 True, 6, 7, 8, 9. x = 10 < 10 False ---> exit
      println("x value is " + x)
      x = x + 1
    } */

    do {
      println(" value of X is " + x)
      x = x + 1
    }while(x < 10)                  // x = 5 < 10 True, 6, 7, 8, 9. x = 10 < 10 False ---> exit

    // 'while' will check the condition at start, where do-while will check condition at end.
    // do-while will execute the condition atleast once before it failing.
  }

}
