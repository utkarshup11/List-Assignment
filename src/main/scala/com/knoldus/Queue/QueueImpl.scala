package com.knoldus.Queue

class QueueImpl {


  def push(queue: List[Int], element : Int) : List[Int] =  element :: queue

  def pop(queue: List[Int]):List[Int] = {
    if (queue.isEmpty) {
      println("Queue is already empty , there is no element to perform delete operation --")
      List()

    } else
      queue.init
  }
}
