// Scala Program: Strings
package learn.scala.day4

import java.util.Objects.isNull

object StringDemoA {
  def main(args: Array[String]): Unit = {

    var greetings = "Hello World!" // data type 'String' not defined. auto interpreted
    println(greetings)
    var greetingsNew: String = "Hello All!" // data type 'String' is defined
    println(greetingsNew)

    // Method to get length of String (Accessor Method ) -used to get information of the object
    var lengthOfString = greetingsNew.length
    println("Length Of String is :" + lengthOfString)

    //concat method
    var a1 = "Virat "
    var a2 = "Kohli"
    println(a1 + a2)
    println(a1.concat(a2))

    // get char at given index - index start from 0
    var b1 = "Virat Kohli"
    println(b1.charAt(1))

    // Equals method
    val c1 = "abc"
    val c2 = ""
    println(c1.equals(c2)) // gives True, if both strings have same content
    println(c1 == c2) // gives True , but first check both the strings are not null

    //println(isNull(c1))

    // String Formatting
    var name = "Audi"
    var cost = "300000"
    var model = "Q7"

    //printf()
    printf("name of CAR is %s cost is %s model is %s",name, cost, model)

    // Multi Line Strings
    // use """ String """ to write multi line String, also use '|' and Strip Margin
    var multiLineStringA =
    """
      |hello
      |All
      |Prasad
      |Here
      |Bye
      |for
      |now
      |""".stripMargin
    println(multiLineStringA)

    var multiLineStringB =
    """
      hello
      All
      Prasad
      Here
      """.stripMargin
      println(multiLineStringB)

    var multiLineStringC =
    """
      #hello
      #All
      """.stripMargin('#')
      println(multiLineStringC)

    // String Interpolation
      //1. 's' String Interpolator
      var Name = "india"
      println("hello " + Name + " welcome")
      println(s"hello $Name welcome") // 's' Interpolator

      //2. 'f' String Interpolator
      var salary = 20000.22
      println(f"Name is $Name and salary is $salary")

      //3. raw Interpolator - same as 's' interpolator but doesn't perform escaping (\n,\t)
      println(s"Name is $Name and \n Name is $Name")
      println(raw"Name is $Name and \n Name is $Name")


  }
}
