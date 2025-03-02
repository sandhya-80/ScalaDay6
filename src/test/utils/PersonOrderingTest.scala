package Assignment18.utils

import org.scalatest.funsuite.AnyFunSuite
import Assignment18.models.Person

class PersonOrderingTest extends AnyFunSuite {
  test("Person should be sorted by age") {
    val people = List(Person("Sandhya", 25), Person("Ayu", 24), Person("Piyu", 18))
    val sortedPeople = GenericSorter.sort(people)

    assert(sortedPeople == List(Person("Sandhya", 25), Person("Ayu", 24), Person("Piyu", 18)))
  }
}
