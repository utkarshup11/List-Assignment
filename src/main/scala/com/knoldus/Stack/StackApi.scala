package com.knoldus.Stack

object StackApi {
  def main(args: Array[String]): Unit = {


    val stackImpl = new StackImpl
    val stack = List()


    //inserting elements to stack
    val newStack1 = stackImpl.push(stack,10)
    val newStack2 = stackImpl.push(newStack1,20)
    val newStack3 = stackImpl.push(newStack2,30)
    val newStack4 = stackImpl.push(newStack3,40)
    println("After inserting elements to stack -- " +newStack4)


    //deleting the top element from the stack

    stackImpl.pop(stack)
    val newStack6 = stackImpl.pop(newStack4)
    println("After deleting element from the top--- "+newStack6)


    //peek ( to it will return the top element of the stack ) 
    println("Top element of stack ---"+stackImpl.peek(newStack6))




  }

}
