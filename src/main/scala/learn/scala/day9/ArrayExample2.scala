package learn.scala.day9

// Array Example

object ArrayExample2 {

  def main(args: Array[String]): Unit = {

    val marks = Array(50,67,45,62,56,98)

    val len = marks.length

    println(" length of a given Array is : " + len)

    var totalMarks = 0
    //var averageMark = 0

    // option 1 : using for loop
    for (mark <- marks){
      totalMarks = totalMarks + mark
    }
    println(" Total Marks : " + totalMarks)

    // option 2 : using foreach
    marks.foreach(mark=> totalMarks+=mark)

    var averageMark = (totalMarks / len)

    println(" Average Marks : " + averageMark)

    // foreach, you can get multiple outputs, example : marks.foreach(println) will give you multiple output

    // foreach, you can also get one final output, example:  marks.foreach(mark=>totalMarks=totalMarks+mark)
    // will give you totalMarks

    // map ====> You will always get multiple output
    //var newMarks = marks.map(mark=>mark + 10 )
    println("========= map example ==========")
    var newMarks = marks.map(_ + 10) // shorthand notation
    newMarks.foreach(println)


    // If you want to do same operation on each element of an Array ---> Use Map
    // (Note: You can also do with foreach/for loop but it will be slow)

    // If you want to take Sum/get single output (eg: total marks), use foreach

    // Note: If you want for loop to return you an array, you can use yield with it.
    println("========= map with yield example ==========")
    val result = for (mark <- marks) yield {
      mark + 10
    }
    result.foreach(println)

  }

}
