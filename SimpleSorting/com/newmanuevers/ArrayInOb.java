package com.newmanuevers;

import com.newmanuevers.Person;

class ArrayInOb{
  private Person[] a;                 // ref to array a
  private int nElems;                 // number of data items

  // -------------------------------------------------------------
  public ArrayInOb(int max){
    a = new Person[max];              // create the array
    nElems = 0;                       // no items yet
  }
  // -------------------------------------------------------------
  public void insert(String last, String first, int age){
    a[nElems] = new Person(last, first, age);
    nElems++;                         // increment size
  }
  // -------------------------------------------------------------
  public void display()               // display array contents
  {
    for(int j=0; j < nElems; j++){
      a[j].displayPerson();
    }
    System.out.println(" ");
  }
  // -------------------------------------------------------------
  public void insertionSort(){
    int in, out;

    for(out=1; out < nElems; out++){
      Person temp = a[out];           // remove marked Person
      in = out;                       // start shifting at out

      while(in>0 && a[in-1].getLast().compareTo(temp.getLast()) > 0){
        a[in] = a[in-1];
        --in;
      }
      a[in] = temp;                   // insert marked item
    }
  }
  // -------------------------------------------------------------
}