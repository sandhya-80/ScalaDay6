package Assignment17.shapes

import org.scalatest.funsuite.AnyFunSuite

class CircleTest extends AnyFunSuite {
  test("Circle area ") {
    val circle = new Circle(5)
    assert(circle.area === Math.PI * 25)
  }

  test("Circle perimeter") {
    val circle = new Circle(5)
    assert(circle.perimeter === 2 * Math.PI * 5)
  }

  test("Circle draw method") {
    val circle = new Circle(5)
    assert(circle.draw() === "Circle with radius 5.0")
  }
}
