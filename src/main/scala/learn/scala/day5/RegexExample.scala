// Scala Program: Regular Expressions (Regex)
package learn.scala.day5

import scala.util.matching.Regex

object RegexExample {

  def main(args: Array[String]): Unit = {

    val pattern = new Regex("Hello")
    val patternA = "Hello".r

    val input = "Hello how are you? Bye for now. hello again"

    val result = (pattern findAllIn(input)).mkString(", ")
    println(result)
    val result1 = (patternA findAllIn(input)).mkString(", ")
    println(result1)

    val input1 = "hey how are you 1 3 10 20 in find all the numbers using regex 20 30"

    //val patternB = new Regex("[0-9]+")
    val patternB = "[0-9]+".r
    val result3 = (patternB findAllIn input1).mkString(", ")
    //val result4 = (patternB findAllIn input1).toArray
    println(result3)

    val patternC = "[H|h]ello".r
    val result5 = (patternC findAllIn input).mkString(", ")
    println(result5)

    val patternD = "Hello".r
    val result6 = patternD findAllIn input foreach(d => println(d))
    //println(result6)

    val input2 = "Hello im doing it, find this Able , able, able0, able00"
    val patternE = "abl[ae]\\d*".r
    val result7 = patternE findAllIn input2 foreach(d => println(d))


  }

}
