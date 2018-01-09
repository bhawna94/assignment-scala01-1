package edu.knoldus

class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
   
   val f_index=0
   val l_index=array.length-1  
  val value=bsearch(array,elem,f_index,l_index)
   if(value == -1)
   {return false}
    true
   }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    for (e <- array) {
      if (e != elem)
        return false
      } 
    true
   }

def bsearch(x : Array[Int],y :Int, f_index : Int, l_index : Int ): Int =
{
  if(f_index < l_index)
    {
      val mid : Int= (f_index + l_index)/2
      if(x(mid) == y)
        return mid
      if (x(mid) > y)
        return bsearch(x,y,f_index,mid-1)
         return bsearch(x,y,mid+1,l_index)
    }
  return -1
}
}
