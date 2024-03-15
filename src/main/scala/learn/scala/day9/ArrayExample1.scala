package learn.scala.day9

object ArrayExample1 {
  def main(args: Array[String]): Unit = {

    var days = Array("Sunday", "Monday", "Tuesday",
      "Wednesday", "Thursday", "Friday",
      "Saturday")

    println("Array Elements are : ")
    for (d1 <- days)
    {
      println(d1)
    }

  }
}
