package Assignment17.shapes

import Assignment17.traits.Drawable

class Rectangle(val width: Double, val height: Double) extends Shape with Drawable {
  override def area: Double = width * height
  override def perimeter: Double = 2 * (width + height)

  override def draw(): String = s"Rectangle with width $width and height $height"
}
