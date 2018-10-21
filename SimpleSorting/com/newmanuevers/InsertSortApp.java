package com.newmanuevers;

class InsertSortApp{
  public static void main(String[] args){
    int maxSize = 100;            // array Size
    InsertSort arr;                 // reference to array
    arr = new InsertSort(maxSize);  // create the array

    System.out.println("Demonstrating Insertion Sort");

    arr.insert(77);
    arr.insert(99);
    arr.insert(44);
    arr.insert(55);
    arr.insert(22);
    arr.insert(88);
    arr.insert(11);
    arr.insert(00);
    arr.insert(66);
    arr.insert(33);

    arr.display();                      // display items

    arr.insertionSort();

    arr.display();
  }
}