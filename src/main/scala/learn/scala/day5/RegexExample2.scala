package learn.scala.day5

import scala.util.matching.Regex

object RegexExample2 {
  def main(args: Array[String]): Unit = {
    val numberPattern: Regex = "[0-9]".r

    numberPattern.findFirstMatchIn("awesomepassword") match {
      case Some(_) => println("Password OK")
      case None => println("Password must contain a number")
    }
  }

}
