package learn.scala.day9

object ArrayExample3 {
  def main(args: Array[String]): Unit = {

    val animals = Array("Dog", "Tiger", "Lion", "Monkey")
    animals.foreach(println)

    println()
    println("========= using map =========")
    val m = animals.map( name=>name + "__a")
    //val m = animals.map( _ + "__a")
    println(m.mkString("\n"))

    // reduceLeft
    println("========= using reduceLeft =========")
    var Marks = Array(56,67,53,17,86,28)

//    var avg = Marks.reduceLeft((x,y) => (x+y)/2)
//    println(avg)

    var avg2 = Marks.reduceLeft((x,y) => {
      println("x value is :" + x + " y value is : " + y + " Average is : " + (x+y)/2)

      (x+y)/2
    }
    )
    println("Final Average is : " + avg2)

    var totalMarks = Marks.reduceLeft(_+_)
    println("Total Marks is : " + totalMarks)

    var maximumMarks = Marks.reduceLeft(_ max _)
    println("Maximum Marks is :" + maximumMarks)

    var minimumMarks = Marks.reduceLeft(_ min _)
    println("Minimum Marks is :" + minimumMarks)

  }
}
