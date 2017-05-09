package iterator

import java.util.Iterator

class ShapeIterator(private var shapes: Array[Shape]) extends Iterator[Shape] {

  var currentIndex:Int = -1

  override def hasNext(): Boolean = {
    currentIndex < shapes.length-1
  }

  override def next(): Shape = {
    currentIndex+=1
    shapes(currentIndex)
  }

  override def remove(): Unit = shapes.drop(currentIndex)
}