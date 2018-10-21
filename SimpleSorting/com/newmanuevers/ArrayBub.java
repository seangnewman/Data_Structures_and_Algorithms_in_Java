 
package com.newmanuevers;
// bubbleSort.java
// demonstrate bubble bubbleSort
// to run this program c> java BubbleSortApp
//////////////////////////////////////////////////////////////////

class ArrayBub{
  private long[] a;           // ref to array a
  private int nElems;         // number of data items

//////////////////////////////////////////////////////////////////

  public ArrayBub(int max)        //Constructor
  {
    a = new long[max];            // create the array
    nElems = 0;                   // no items in array
  }
  // -------------------------------------------------------------

  public void insert(long value)  //put element in array
  {
    a[nElems] = value;            // insert it
    nElems++;                     // increment size
  }
  // -------------------------------------------------------------

  public void display()           // display array contents
  {
    for(int j=0; j < nElems; j++){
      System.out.print(a[j] + " ");
    
    }
    System.out.println();
  }
  // -------------------------------------------------------------
  public boolean find(long searchKey){
    int j;

    for(j=0; j < nElems; j++){
      if(a[j] == searchKey){
        break;
      }
    }
    if(j == nElems){
      return false;
    }else{
      return true;
    }
  }
  // -------------------------------------------------------------
  public boolean delete(long value){
    int j;

    for(j=0; j < nElems; j++){
      if (value == a[j]){
        break;
      }
    }

    if(j == nElems){
      return false;
    }else{
      System.out.println("Removing " + a[j]);
      for( int k=j; k < nElems; k++){
        a[k] = a[k+1];
        
      }
      nElems--;
      return true;
    }

  }
// -------------------------------------------------------------
  public void bubbleSort(){
    int out;
    int in;

    for(out=nElems-1; out > 1; out--) // Outer loop decrements
    {
      for(in=0; in < out; in++)       // Inner loop increments
      {
        if(a[in] > a[in+1]){          // left > right?
          swap(in, in+1);             // swap
        }         
      }    
    }

  }
  // -------------------------------------------------------------
  private void swap(int one, int two){
    long temp = a[one];
    a[one] = a[two];
    a[two] = temp;
  }
  // -------------------------------------------------------------

} // End class ArrayBub