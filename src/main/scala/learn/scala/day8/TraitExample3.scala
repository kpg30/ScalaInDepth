package learn.scala.day8

trait Car2{
  def breaks(): Unit = {
    println("disk breaks") //implemented method
  }
}

trait Car3{
  def breaks(): Unit = {
    println("--------disk breaks") //implemented method
  }
}

class Benz extends Car3 with Car2{    // extends and with
  def modify(){
    println("------ end ---------")
  }

  override def breaks(): Unit = super.breaks() // define breaks() method as override,because we have defined in multiple traits.

}


object TraitExample3 {
  def main(args: Array[String]): Unit = {

    val b1 = new Benz
    b1.breaks()   // get the breaks() from last trait that we defined after extends 'with' ,so here it will get from 'Car2'
    b1.modify()

  }

}
