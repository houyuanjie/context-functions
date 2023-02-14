package builderpattern
package dsl

import model.*

def cell(elem: String)(using row: Row): Unit =
  row.add(Cell(elem))

def row(receiver: Row ?=> Unit)(using table: Table): Unit =
  given row: Row = new Row()
  receiver
  table.add(row)

def table(receiver: Table ?=> Unit): Table =
  given table: Table = new Table()
  receiver
  table
