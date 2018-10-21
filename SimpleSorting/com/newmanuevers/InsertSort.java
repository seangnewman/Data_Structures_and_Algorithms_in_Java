package com.newmanuevers;

// InsertSort.java
// Demonstrates insertion sort
// to run this program c> java InsertSortApp
//////////////////////////////////////////////////////////////////
class InsertSort{
  private long[] a;                 // ref to array a
  private int nElems;               // number of array items

  // -------------------------------------------------------------
  public InsertSort(int max){
    a = new long[max];              // create the array
    nElems = 0;                     // no items yet
  }

  // -------------------------------------------------------------
  public void insert(long value)    // put element into array
  {
    a[nElems] = value;              // insert it
    nElems++;                       // increment size
  }
  // -------------------------------------------------------------

  public void display(){
    for(int j=0; j<nElems; j++){
      System.out.print(a[j] + " ");
    }
    System.out.println(" ");
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
public void insertionSort(){
  int in, out;

  for(out=1; out < nElems; out++)         // out is dividing line
  {
    long temp = a[out];                   // remove marked item
    in = out;                             // start shifts at out

    while( in>0 && a[in-1] >= temp){
      a[in] = a[in-1];
      --in;
    }
    a[in] = temp;
  }
 }


}