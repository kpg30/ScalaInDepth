package learn.scala.day7

import java.io.{FileNotFoundException, IOException}
import scala.io.Source

object ExceptionExample1 {

  def openAndReadAFile(filename: String): String = {
    val filename = "D:\\scala\\ScalaInDepth\\src\\main\\scala\\learn\\scala\\day7\\input.txt"
    val fileContent = Source.fromFile(s"$filename", "utf-8").getLines().mkString("\n")
    fileContent
  }

  def main(args: Array[String]): Unit = {

    var text = ""
    val filename = "xxx.txt"
    try {
      text = openAndReadAFile(filename)
    } catch {
      case e: FileNotFoundException => println("Couldn't find that file.")
      case e: IOException => println("Had an IOException trying to read that file")
      case _ : Exception => println("openAndReadAFile failed")
    }
  }

}
