import Assignment17.shapes.{Circle, Rectangle}

import Assignment18.models.Person
import Assignment18.utils.{PersonSorter, GenericSorter}
import Assignment18.utils.given

import Assignment19.*
//import Assignment19.ListExtensions.second

@main def run(): Unit = {
  val circle = new Circle(5)
  val rectangle = new Rectangle(4, 6)
  println("Assignment 17:")
  println(s"Circle -> Area: ${circle.area}, Perimeter: ${circle.perimeter}")
  println(s"Rectangle -> Area: ${rectangle.area}, Perimeter: ${rectangle.perimeter}")
  println(circle.draw())
  println(rectangle.draw())

  val people = List(
    Person("Sandhya", 25),
    Person("Ayu", 24),
    Person("Piyu", 18)
  )
  println("Assignment 18:")
  println("Sorted by age using `using` context parameter:")
  println(PersonSorter.sortPeopleUsing(people))

  println("Sorted by age using context bound:")
  println(GenericSorter.sort(people))


  println("Assignment 19:")
  val word = "madam"
  println(s"Is '$word' a palindrome? ${word.isPalindrome}")

  val numbers = List(1, 2, 3, 4, 5)
  println(s"Second element of $numbers: ${numbers.second}")
  
}