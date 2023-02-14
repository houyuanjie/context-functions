package postconditions
package main

import syntax.{ensuring, result}

@main
def run(): Unit =
  val sum =
    List(1, 2, 3).sum.ensuring(result == 6)

  println(sum)
