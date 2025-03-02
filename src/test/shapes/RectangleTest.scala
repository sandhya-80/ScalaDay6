package Assignment17.shapes

import org.scalatest.funsuite.AnyFunSuite

class RectangleTest extends AnyFunSuite {
  test("Rectangle area") {
    val rectangle = new Rectangle(4, 6)
    assert(rectangle.area === 24)
  }

  test("Rectangle perimeter") {
    val rectangle = new Rectangle(4, 6)
    assert(rectangle.perimeter === 20)
  }

  test("Rectangle draw method") {
    val rectangle = new Rectangle(4, 6)
    assert(rectangle.draw() === "Rectangle with width 4.0 and height 6.0")
  }
}
