package com.knoldus.List

import scala.io.StdIn.readInt

object ListApi {
  def main(args: Array[String]): Unit = {


    //input part of the code
    println("Enter the number of element in list ")
    val numberOfInput = readInt()
    println("Enter all the " + numberOfInput + " numbers  ---- ")
    val listInput = List.fill(numberOfInput) {
      readInt()
    }


    println("\nFirst Part ---")
    val lastElement = new LastElement
    println("Last element of the list : " + lastElement.getLastElement(listInput))
    println("Index of last element  : " + (listInput.length - 1))


    val tableImpl = new TableImpl
    println("\nSecond Part ")
    tableImpl.printTable(listInput)


  }

}
