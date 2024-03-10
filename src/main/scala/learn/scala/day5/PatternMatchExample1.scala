// Scala Program: Pattern Matching with Case Class
package learn.scala.day5

import java.util.jar.Attributes.Name


case class Car(Name:String, Price:Int)

object PatternMatchExample1 {
  def main(args: Array[String]): Unit = {

    val myObject= Car("Tata",200000)
    val myObject1 = Car("Mahindra",100000)
    val myObject2 = Car("BMW",5000000)
    val myObject3 = Car("BenZ",5000000)

    for (car <- List(myObject,myObject1,myObject2,myObject3) ){
      car match {
        case Car("Tata",20000) => println("Hello! welcome to TATA, Congratulations on purchasing a new Car!!!!")
        case Car("Mahindra",100000) => println("Hello! welcome to Mahindra, Congratulations on buying a new Car!!!!")
        case Car("BMW",5000000) =>  println("Hello! welcome to BMW ,Congrats on buying a new Car!!!!")
        case Car(cName,cPrice) => println("hey " + cName + " and " + cPrice +" happy")
      }
    }
  }

}
