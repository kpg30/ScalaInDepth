// Scala Learning : Conditional Statements
package learn.scala.day6

object ConditionalStamnts {
  def main(args: Array[String]): Unit = {

    val x = 2

    if (x > 5) {
      println(s"X value is greater than 5")
    }else if (x == 5){
      println("X values is equals to 5")
    }else if (x != 5) {
      println("X value is Not equals to 5")
    }else{
      println("none of the above")
    }
  }

}
