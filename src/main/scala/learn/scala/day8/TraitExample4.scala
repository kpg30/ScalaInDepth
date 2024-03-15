package learn.scala.day8

  // Scala program to illustrate the concept of abstract and non-abstract method in Traits

  // Trait with abstract and non-abstract methods
  trait MyTrait {
    // Abstract method
    def greeting

    // Non-abstract method
    def tutorial {
      println("Welcome to Scala Programming" + " of Traits")
    }
  }

  // MyClass inherits trait
  class MyClass extends MyTrait {

    // Implementation of abstract method
    // No need to implement a non-abstract method- "tutorial", because it already implemented
    def greeting() {
      println("Welcome to Scala World ! Happy Learning !!!")
    }
  }

  object TraitExample4 {

    // Main method
    def main(args: Array[String]) {
      val obj = new MyClass();
      obj.greeting
      obj.tutorial
    }


}
