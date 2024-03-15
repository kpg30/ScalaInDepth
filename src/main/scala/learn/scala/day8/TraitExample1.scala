package learn.scala.day8

trait Car{
  def price(): Unit ={
    print("price is 10000")
  }

  def engine(): Unit ={
    println("engine is 1000 cc")
  }
}

class check extends Car{
  def model(): Unit ={
    print("model is Audi Q7")
  }
}

object TraitExample1 {
  def main(args: Array[String]): Unit = {

    val d1 = new check
    print(d1.model)


  }

}
