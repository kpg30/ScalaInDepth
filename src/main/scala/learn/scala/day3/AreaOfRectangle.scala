// Scala Program : To find Area of the Rectangle
package learn.scala.day3

class rectangleArea{
  var length = 4
  var height = 8

  def area(): Unit ={
    var areaOfRectangleIs = length * height

    println("Length of the Rectangle is : " + length)
    println("Height of the Rectangle is : " + height)
    println("Formula to find Area of Rectangle = length * height ")
    println("Area of the Rectangle is : " + areaOfRectangleIs)
  }
}

object AreaOfRectangle {

  def main(args: Array[String]): Unit = {
    val obj = new rectangleArea
    obj.area()

  }

}
