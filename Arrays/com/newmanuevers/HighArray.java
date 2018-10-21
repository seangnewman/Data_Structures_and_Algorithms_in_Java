package com.newmanuevers;

//HighArray.java
// Demonstrates array class with high-level interface
// to run this program :

class HighArray{
  private long[] a;         // ref to array a
  private int nElems;       // number of data items

  public HighArray(int max){
    a = new long[max];
    nElems = 0;
  }

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

  public void insert(long value){
    a[nElems] = value;      // insert at end of array
    nElems++;               // Increment size of array
  }

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

  public void display(){
    for(int j=0; j<nElems; j++){
      System.out.print(a[j] + " ");

    }
    System.out.println(" ");
  }

}