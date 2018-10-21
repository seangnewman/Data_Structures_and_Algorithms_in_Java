package com.newmanuevers;

//array.java
//demonstrates basic array 
//to run program c> java arrayApp

class ArrayApp{
  public static void main(String[] args){
    long[] arr;             // Reference to array
    arr = new long[100];    // make array
    int nElems = 0;         // number of items
    int j;                  // loop counter
    long searchKey;         // key of item to search for

    System.out.println("Demonstrationg Selection Sort");

    arr[0] = 77;          //Insert 10 items
    arr[1] = 99;
    arr[2] = 44;
    arr[3] = 55;
    arr[4] = 22;
    arr[5] = 88;
    arr[6] = 11;
    arr[7] = 00;
    arr[8] = 66;
    arr[9] = 33;
    nElems = 10;          // Initially 10 items in array

    for(j = 0; j < nElems; j++){
      System.out.print(arr[j] + " ");     //Display items
    }
    System.out.println(" ");

    searchKey = 66;       //Find elements with value of 66
    for(j=0; j < nElems; j++){
      if(arr[j] == searchKey){
        break;
      }
      
    }
    if(j == nElems){
      System.out.println("Cannot locate search key " + j);
    }else{
      System.out.println("Found " + arr[j]);
    }

    searchKey = 55;       //Delete elements with value of 66
    for(j=0; j < nElems; j++){
      if(arr[j] == searchKey){
        break;
      }
      
    }
    for( int k = j; k < nElems; k++){
      arr[k] = arr[k+1];  // Overwrite previous value and move 
                          // remaining elements up
    }
    nElems--;               // Decrement array size

    for(j=0; j<nElems; j++){
      System.out.print(arr[j] + " ");

    }
    System.out.println(" ");
  }
}
