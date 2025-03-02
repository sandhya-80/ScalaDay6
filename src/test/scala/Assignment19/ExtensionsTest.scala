package Assignment19

import Assignment19.ListExtensions.*
import Assignment19.StringExtensions.*
import org.scalatest.funsuite.AnyFunSuite

class ExtensionsTest extends AnyFunSuite {

  test("isPalindrome should return true for palindromes") {
    assert("madam".isPalindrome)
  }

  test("isPalindrome should return false for non-palindromes") {
    assert(!"hello".isPalindrome)
    assert(!"world".isPalindrome)
  }

  test("second should return the second element if present") {
    assert(List(10, 20, 30).second.contains(20))
    assert(List("a", "b", "c").second.contains("b"))
  }

  test("second should return None for lists with less than 2 elements") {
    assert(List(42).second.isEmpty)
    assert(List().second.isEmpty)
  }
}
