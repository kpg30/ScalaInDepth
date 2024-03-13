// Scala Learning : Exception Handling
package learn.scala.day7

object exceptionDemo {
  def main(args: Array[String]): Unit = {

    case class NotDivideByZero() extends Exception

    def divide(dividend: Int, divisor: Int): Int = {
      if (divisor == 0) {
        throw new NotDivideByZero
      }

      dividend / divisor
    }

    print(divide(10,1))

    /** Exception handling by try/catch/finally
     */
    def divideByZero(a: Int): Any = {
      try {
        divide(a, 0)
      } catch {
        case _: NotDivideByZero => null
      } finally {
        println("Finished")
      }
    }

    println(divideByZero(1))

  }

}
