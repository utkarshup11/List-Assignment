package com.knoldus.Stack

class StackImpl {

  def push(stack: List[Int], element: Int): List[Int] = element :: stack

  def pop(stack : List[Int]) : List[Int] = {
    if(stack.isEmpty) {
      println("Stack is already empty , there is no element to perform delete operation --")
      List()

    } else
      stack.tail
  }

  def peek(stack : List[Int]) : Int = {
    if(stack.isEmpty) {
      println("Stack is empty , there is no element to perform peek operation --")
      0
    }
      else
      stack.head
  }


}
