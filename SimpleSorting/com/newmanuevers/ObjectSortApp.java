package com.newmanuevers;



class ObjectSortApp{
  public static void main(String[] args){

    int maxSize = 100;            // array Size
    ArrayInOb arr;                 // reference to array
    arr = new ArrayInOb(maxSize);  // create the array

    System.out.println("Demonstrating Insertion Sort");

    arr.insert("Evans", "Patty", 24);
    arr.insert("Smith", "Doc", 50);
    arr.insert("Smith", "Lorraine", 37);
    arr.insert("Smith", "Paul", 37);
    arr.insert("Yee", "Tom", 43);
    arr.insert("Hashimoto", "Sato", 21);
    arr.insert("Stimson", "Henry", 29);
    arr.insert("Velasquez", "Jose", 72);
    arr.insert("Vang", "Minh", 22);
    arr.insert("Creswell", "Lucinda", 18);

    System.err.println("Before Sorting: ");
    arr.displayPerson();                      // display items

    arr.insertionSort();                // insertion-sort then

    System.out.println("After Sorting:");
    arr.displayPerson();
  }
}