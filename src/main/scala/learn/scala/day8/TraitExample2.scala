package learn.scala.day8

trait car {                 // define trait using 'trait' keyword
  def breaks(): Unit ={
    println("disk breaks") //implemented method
  }

  def camera()    // unimplemented method - body is not present, it should be implemented in class extends this trait.
  def fuel()      // unimplemented method - body is not present, it should be implemented in class extends this trait.
}

class benz extends car{
  def camera(): Unit ={
    println("front camera")   // unimplemented method , implemented here in class
  }

  def fuel(): Unit ={
    println("petrol")     // unimplemented method , implemented here in class
  }
}

object TraitExample2 {
  def main(args: Array[String]): Unit = {

    val d2 = new benz         // create an object for class 'benz'
    d2.breaks()               // call methods from trait
    d2.camera()               // call methods from class
    d2.fuel()                 // call methods from class

  }

}
