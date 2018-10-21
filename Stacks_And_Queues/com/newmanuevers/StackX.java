package com.newmanuevers;

class StackX{
  private int maxSize;              // size of stack array
  //private long[] stackArray;
  private char[] stackArray;
  private int top;                  // top of stack
  // ------------------------------------------------------------------
  public StackX(int s){
    maxSize =s;                     // set array size
    //stackArray = new long[maxSize]; // create an array
    stackArray = new char[maxSize]; // create an array
    top = -1;                       // no items yet
  }
  // -----------------------------------------------------------------
  public void push(char j){         // put item on top of stack 
    stackArray[++top] = j;          //increment top , insert item
  }
  // -----------------------------------------------------------------
  public char pop(){
    return stackArray[top--];       // access item, decrement top
  }
  // -----------------------------------------------------------------
  public char peek(){
    return stackArray[top];
  }
  // -----------------------------------------------------------------
  public boolean isEmpty(){
    return  ( top == -1 );
  }
  // -----------------------------------------------------------------
  public boolean isFull(){
    return (top == maxSize-1);
  }
} // End class StackX