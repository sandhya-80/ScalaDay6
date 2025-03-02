package Assignment18.utils

import Assignment18.models.Person

object PersonSorter {
  def sortPeopleUsing(people: List[Person])(using ord: Ordering[Person]): List[Person] = {
    people.sorted
  }
}
