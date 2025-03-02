package Assignment19

extension [T](lst: List[T])
  def second: Option[T] = if (lst.length > 1) Some(lst(1)) else None
