package learn.scala.day7

import java.io.IOException

object ExceptionExample3 {
  def main(args: Array[String]): Unit = {

    try {
      var N = 5 / 0
    } catch {
      case e: IOException => println("IOException occurred")
      case e: ArithmeticException => println("ArithmeticException Occurred")
    }

    val s = "  "

    def toInt(s: String): Option[Int] = {
      try {
        Some(Integer.parseInt(s.trim))
      } catch {
        case e: Exception => None
      }
    }
    println(toInt(s))

  }
}

