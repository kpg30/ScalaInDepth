package learn.scala.day8


  // Scala program to illustrate how a class inherits multiple traits

  // Trait 1
  trait MyTrait1 {

    // Abstract method
    def greeting

  }

  //Trait 2
  trait MyTrait2 {

    // Non-abstract method
    def tutorial {
      println("Welcome to Scala Programming" + " of Traits")
    }
  }

  // MyClass inherits multiple traits - extends and with
  class MyClass1 extends MyTrait1 with MyTrait2 {

    // Implementation of abstract method
    def greeting() {
      println("Welcome to Scala World ! Happy Learning !!!")
    }
  }

  object TraitExample5 {

    // Main method
    def main(args: Array[String]) {
      val obj1 = new MyClass1();
      obj1.greeting
      obj1.tutorial
    }
  }


