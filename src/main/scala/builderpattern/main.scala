package builderpattern
package main

import dsl.*

@main
def run(): Unit =
  println {
    table {
      row {
        cell("0, 0")
        cell("0, 1")
        cell("0, 2")
      }
      row {
        cell("1, 0")
        cell("1, 1")
        cell("1, 2")
      }
      row {
        cell("2, 0")
        cell("2, 1")
        cell("2, 2")
      }
    }
  }
