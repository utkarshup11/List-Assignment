package com.knoldus.List

class LastElement {
  //to find last element recursively
  def getLastElement[Int](l: List[Int]): Int = l match {
    case oneElement :: Nil => oneElement
    case _ :: lastElement => getLastElement(lastElement)
    case _ => throw new NoSuchElementException
  }


}
