package com.newmanuevers;
// demonstrates stack
// to run this program c>java StackApp
// --------------------------------------------------------------------
class StackApp{
  public static void main(String[] args){
    StackX theStack = new StackX(10);     // create new stack

    theStack.push(20);
    theStack.push(40);
    theStack.push(60);
    theStack.push(80);
    
    while(!theStack.isEmpty()){
      long value = theStack.pop();
      System.out.print(value);            // display it
      System.out.print(" ");
    } // end while

    System.out.println(" ");
  }
}