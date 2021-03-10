package com.knoldus.List

class TableImpl {
  //method to print table of each elements of list
  def printTable(list: List[Int]): Any = {
    for (i <- 0 to list.length - 1) {
      println("\nTable of " + list(i) + " ----")
      for (j <- 1 to 10) {
        print(list(i) * j + " ")
      }
    }
  }

}
