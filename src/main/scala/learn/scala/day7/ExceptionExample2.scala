package learn.scala.day7

import scala.io.Source

object ExceptionExample2 {
  def main(args: Array[String]): Unit = {
    val fileName = "input.txt"
    val filePath = s"D:\\scala\\ScalaInDepth\\src\\main\\scala\\learn\\scala\\day7\\$fileName"

    val displayContent = Source.fromFile(filePath).getLines().mkString("\n")
    // val displayContent1 = Source.fromFile(s"$filePath","utf-8").getLines().mkString("\n")
    println(displayContent)
  }

}
