package com.knoldus.Queue

object QueueApi
{
  def main(args: Array[String]): Unit = {

    val queueImpl = new QueueImpl
    val queue = List()  //creating a queue using list


    //inserting elements to queue
    val newQueue1 = queueImpl.push(queue,10)
    val newQueue2 = queueImpl.push(newQueue1,20)
    val newQueue3 = queueImpl.push(newQueue2,30)
    val newQueue4 = queueImpl.push(newQueue3,40)
    println("After inserting elements 10 ,20 ,30 40  to queue  -- " +newQueue4)


    //deleting the top element from the queue
    queueImpl.pop(queue)
    val newQueue5 = queueImpl.pop(newQueue4)
    println("After deleting element from the top (First in first Out --- "+newQueue5)





  }

}
