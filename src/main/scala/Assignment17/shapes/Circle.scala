package Assignment17.shapes

import Assignment17.traits.Drawable

class Circle(val radius: Double) extends Shape with Drawable {
  override def area: Double = Math.PI * radius * radius
  override def perimeter: Double = 2 * Math.PI * radius

  override def draw(): String = s"Circle with radius $radius"
}
