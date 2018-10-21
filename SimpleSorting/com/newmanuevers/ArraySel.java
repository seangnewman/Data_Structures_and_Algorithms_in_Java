package com.newmanuevers;
// SelectSort.java
// demonstrates selection sort
// to run this program C> java SelectSortApp
//////////////////////////////////////////////////////////////////
class ArraySel{
  private long[] a;                //ref to array a
  private int nElems;              // number of data items

  // -------------------------------------------------------------
  public ArraySel(int max)          // constructor
  {
    a = new long[max];            //create the array
    nElems = 0;                   // no items yet
  }
  // -------------------------------------------------------------

  public void insert(long value)      // put element into array
  {
    a[nElems] = value;                // insert it
    nElems++;                         // increment size
  }
  // -------------------------------------------------------------

  public void display()               // display array contents
  {
    for(int j=0; j<nElems;j++){
      System.out.print(a[j] + " ");
    }
    System.out.println(" ");
  }
  // -------------------------------------------------------------
  private void swap(int one, int two){
    long temp = a[one];
    a[one] = a[two];
    a[two] = temp;
  }
  // -------------------------------------------------------------
    // -----------------------------------------------------------
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

public void selectionSort(){
  int out, in, min;

  for(out=0; out<nElems; out++){
    min=out;
    for(in=out; out<nElems; out++){
      min=out;
      for(in=out+1; in<nElems;in++){
        if(a[in] < a[min]){
          min = in;
        }
        swap(out, min);
      }
    }
  }
}  //end selectionSort

  
}
