package builderpattern
package model

import scala.collection.mutable.ArrayBuffer

case class Cell(elem: String)

class Row:

  val cells =
    new ArrayBuffer[Cell]

  def add(cell: Cell): Unit =
    cells += cell

  override def toString(): String =
    cells.mkString("Row(", ", ", ")")

class Table:

  val rows =
    new ArrayBuffer[Row]

  def add(row: Row): Unit =
    rows += row

  override def toString(): String =
    rows.mkString("Table(", ", ", ")")
