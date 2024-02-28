package learn.scala.day3

class Car(name:String, model:String){
  var carName =name
  var carModel= model

  def getDetails(country:String): Unit ={
    println(s"Car Name is $carName and Model is $carModel and Country is $country")
  }

}
object CarDetails {
  def main(args: Array[String]): Unit = {

    val myDemo1 = new Car("benZ","Mercedes W124 E-Class")
    myDemo1.getDetails("india")

  }
}