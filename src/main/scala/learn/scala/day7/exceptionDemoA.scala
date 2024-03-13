// Scala Learning : Read a file and Display content in it
package learn.scala.day7

import scala.io.Source
import scala.io.Source.fromFile

object exceptionDemoA {
  def main(args: Array[String]): Unit = {
    val fileName = "input.txt"
    val filePath = s"D:\\scala\\ScalaInDepth\\src\\main\\scala\\learn\\scala\\day7\\$fileName"

    val displayContent = Source.fromFile(filePath).getLines().mkString("\n")
    // val displayContent1 = Source.fromFile(s"$filePath","utf-8").getLines().mkString("\n")
    println(displayContent)
  }

}
