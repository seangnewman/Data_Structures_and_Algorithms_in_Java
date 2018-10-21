package com.newmanuevers;

//LowArrayApp.java
// Container class with low-level interface
// Wraps the low level details of the array from public  

class LowArray{
  private long[] a;       // Ref to array a

  public LowArray(int size){
    a = new long[size];
  }

  public void setElem(int index, long value){
    a[index] = value;
  }

  public long getElem(int index){
    return a[index];
  }



} //end class Low Array