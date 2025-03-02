package Assignment18.utils

import Assignment18.models.Person

given personOrdering: Ordering[Person] with {
  def compare(p1: Person, p2: Person): Int = p1.age.compareTo(p2.age)
}
