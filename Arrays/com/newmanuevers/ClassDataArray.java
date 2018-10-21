package com.newmanuevers;

import com.newmanuevers.Person;

class ClassDataArray{
  private Person[] a;         // Reference to person array
  private int nElems;         // number of data items

  public ClassDataArray(int max){
    //Constructor
    a = new Person[max];      // Create an array of max items
    nElems = 0;
  }
// -------------------------------------------------------------------
public Person find(String searchName){
  //find specified value
  int j;
  for(j=0; j < nElems; j++){
    if(a[j].getLast().equals(searchName)) // found item?
    {
      break;
    }
  }
  if( j == nElems){
      return null;
  }else{
      return a[j];
    }

  
}
// -------------------------------------------------------------------
// put person into array
public void insert(String last, String first, int age){
  a[nElems] = new Person(last, first, age);
  nElems++;
}
// -------------------------------------------------------------------
public boolean delete(String searchName){
  // delete person from array
  int j;
  for( j = 0; j < nElems; j++){
    if( a[j].getLast().equals(searchName)){
      break;
    }
  }
    if( j == nElems){
      return false;
    }else{
      for( int k=j; k < nElems; k++){
        a[k] = a[k + 1];
      }
      
    
    nElems--;
    return true;
    } 
  }// End Delete
  // -------------------------------------------------------------------
  public void displayA(){
    for(int j=0; j < nElems; j++){
      a[j].displayPerson();
      System.out.println();
    }
  }
  // -------------------------------------------------------------------
}