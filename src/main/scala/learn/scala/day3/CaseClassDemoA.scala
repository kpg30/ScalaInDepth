// scala program : Case Class example
package learn.scala.day3

case class CarDemo( name:String, model:String){
  var carName =name
  var carModel= model

  def getDetails(country:String): Unit ={
    println(s"Car Name : $carName or $name and Model : $carModel and Country : $country")
  }

}
object CaseClassDemoA {
  def main(args: Array[String]): Unit = {

    val myDemo1 = CarDemo("benZ","Mercedes W124 E-Class") // 1.no need to write 'new', since apply method is auto generated in the 'case class'
    myDemo1.getDetails("india")

    myDemo1.carName= "SKODA"
    //myDemo1.name= "SKODA" //2. constructor parameter 'val' by default. therefore mutator method is not generated and hence you cannot change the 'name'

    println(myDemo1.getDetails("USA"))

    myDemo1 match {
      case CarDemo(a,b) => println(a) //3. there is unapply method, used for pattern matching.
    }

    //4. auto generate copy method.
    val mercedes = myDemo1.copy(name="BMW")
    mercedes.getDetails("UK")

    //5. equals and hashcode method
    println(myDemo1 == mercedes)

    //6. toString method is auto implemented.
    println(mercedes)

  }
}
