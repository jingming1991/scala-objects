import Design.Design

/**
  * Implement the Factory Method in Scala with apply
  *
  * 1.create trait and define method : Animal.speak
  * 2.create companion object : object AnimalFactory
  * 3.this classes extend base trait : father and son Dog|Cat
  * 4.a suitable apply method
  *
  * a class and its companion object can access each other's
  * private method and private field
  */
trait Animal {
  def speak
}

object AnimalFactory {
  def apply(d: Design): Animal = {
    d match {
      case Design.TOP | Design.BOTTOM => new Dog
      case Design.LEFT | Design.RIGHT => new Cat
    }
  }

  private class Dog extends Animal {
    override def speak: Unit = println("woof")
  }

  private class Cat extends Animal {
    override def speak: Unit = println("meow")
  }

}

