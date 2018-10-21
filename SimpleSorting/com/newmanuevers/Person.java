package com.newmanuevers;

//classDataArray.java
// data items as class objects
// to run this program c>java ClassDataApp

 public class Person{

  private String lastName;
  private String firstName;
  private int age;
  
 
// -------------------------------------------------------------
  public Person(String last, String first, int a){
    lastName = last;
    firstName = first;
    age = a;
  }
// -------------------------------------------------------------
  public void displayPerson(){
    System.out.print(" Last name: " + lastName);
    System.out.print("  \tFirst name:" + firstName);
    System.out.print("  \tAge: " + age);
    System.out.println();
  }
// -------------------------------------------------------------
  public String getLast(){
    return lastName;
  }
// -------------------------------------------------------------
}
 