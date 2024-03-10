// Scala Program: Pattern Matching
package learn.scala.day5

object PatternMatchExample {
  def main(args: Array[String]): Unit = {

    // simple pattern matching
    def testMatch(x: Any) = x match {
      case 1 => "One"
      case 2 => "Two"
      case 3 => "Three"
      case _ => "None"
    }
    println(testMatch(2))

    // 'Any' data type
    def testMatch1(x:Any) = x match {
      case 1 => "One"
      case 2 => "Two"
      case "Three" => 3
      case _ => "None"
    }
    println(testMatch1("Three"))

  }

}
