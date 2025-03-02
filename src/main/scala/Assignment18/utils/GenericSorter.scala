package Assignment18.utils

object GenericSorter {
  def sort[T: Ordering](list: List[T]): List[T] = list.sorted
}
