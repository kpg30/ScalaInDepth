package learn.scala.day6

object DemoForLoop {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 10){
      println(" value of i is " + i)
    }

    /*
    // it excludes last number '10' / from 1 to 9
    for (i <- 1 until 10) {
      println(" value of i is " + i)
    } */

    println("=========== nested for loop =================")
/*    for (i <- 1 to 10){
      for (j <- 1 to 10){
        println("value of i is " + i + " value of j is " + j)
      }
    }
*/
    for (i <- 1 to 10 ; j <- 1 to 10){
      println("value of i is " + i + " value of j is " + j)
    }

    println("=========== for Loop For Collections =================")
    // List - collection of numbers . its similar to Arrays
    // its immutable
    val numbersList = List(1,2,3,4,5,6,7,8,9)

    for (i <- numbersList){
      println("Display number from List is " + i)
    }

    println("=========== for Loop For Collections with filter =================")
    for (i <- numbersList if(i % 2 == 0)) {
      println("Display number from List is " + i)
    }


  }
}
