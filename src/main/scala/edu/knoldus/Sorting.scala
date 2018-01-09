package edu.knoldus

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {
    for(i<-1 until array.length )
    {
    var value = array(i)
    var j = i-1
    while(j >= 0 && array(j) > value)
    {
      array(j+1) = array(j)
      j = j-1;
    }
    array(j+1) = value
  }
    array
  }

  def selectionSort(array: Array[Int]): Array[Int] = {
  for (i <- 0 until array.length - 1) {
     var  small = i
  for (j <- i + 1 until array.length) {
    if (array(j) < array(small)){
      small = j
  }
}
  val temp = array(small)
  array(small) = array(i)
  array(i) = temp
}
    array
  }

  def bubbleSort(array: Array[Int]): Array[Int] = {
  for(i<-0 until array.length-1)
    {for(j<-0 until array.length-i-1)
      {if(array(j) > array(j+1)) {
        var temp = array(j)
        array(j) = array(j+1)
        array(j + 1) = temp
      }
     }
    }
   array
  }

}
