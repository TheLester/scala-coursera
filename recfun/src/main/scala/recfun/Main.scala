package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = if (c == 0 || c == r) 1
  else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
   * Exercise 2 
   * Maybe not the best solution) DANGER! Code smell :)
   */
  def balance(chars: List[Char]): Boolean = {
    def recur(count: Int, ch: List[Char]): Boolean = if (ch.isEmpty && count == 0) true
    else if (ch.isEmpty && count != 0) false
    else if (ch.head != '(' && ch.head != ')') recur(count, ch.tail)
    else if (ch.head == '(') recur(count + 1, ch.tail) else if (ch.head == ')' && count > 0) recur(count - 1, ch.tail) else false
    recur(0, chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
