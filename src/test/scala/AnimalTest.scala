import org.scalatest.FunSuite
import Design._

class AnimalTest extends FunSuite {

  /**
    * import Design._ instead of Design.*
    */
  test("test Factory") {
    Design
    AnimalFactory(LEFT).speak
    AnimalFactory(BOTTOM).speak


    PersonFactory("t").speak
    PersonFactory("a").speak
  }
}
