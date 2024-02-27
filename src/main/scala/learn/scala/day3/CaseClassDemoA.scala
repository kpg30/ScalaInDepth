package learn.scala.day3

case class CarDemo(name:String, model:String){
  var carName =name
  var carModel= model

  def getDetails(country:String): Unit ={
    println(s"Car Name : $carName and Model : $carModel and Country : $country")
  }

}

object CaseClassDemoA {
  def main(args: Array[String]): Unit = {

    val myDemo1 = CarDemo("benZ","Mercedes W124 E-Class") // no need to write 'new', since apply method is auto generated in the 'case class'
    myDemo1.getDetails("india")

  }
}
