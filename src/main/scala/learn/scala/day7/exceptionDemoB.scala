//// Scala Learning : Try-Catch with Finally
package learn.scala.day7

import java.io.{FileNotFoundException, FileReader}
import java.io._

object exceptionDemoB {
  def main(args: Array[String]): Unit = {

    try{
      val read = new FileReader("D:\\scala\\ScalaInDepth\\src\\main\\scala\\learn\\scala\\day7\\input.txt")
      val a = 10/0
      println(a)
    } catch {
      case e : FileNotFoundException => println("ERROR: File is Not Found")
      case e : ArithmeticException => println("ERROR: Given number is not divide by Zero")
    } finally {
      println("it will execute irrespective of Exception")
    }

  }

}