package postconditions
package syntax

opaque type WrappedResult[T] = T

def result[T](using wr: WrappedResult[T]): T =
  wr

extension [T](value: T)
  def ensuring(condition: WrappedResult[T] ?=> Boolean): T =
    assert(condition(using value))
    value
