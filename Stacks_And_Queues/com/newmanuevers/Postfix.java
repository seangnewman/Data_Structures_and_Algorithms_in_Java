package com.newmanuevers;
// postfix.java
// parses postfix arithmetic expressions
// to run this program
// -------------------------------------------------------
class StackX{
  private int maxSize;
  private int[] stackArray;
  private int top;
  // -----------------------------------------------------
  public StackX(int size){            // constructor
    maxSize = size;
    stackArray = new int[maxSize];
    top = -1;
  }
  // -----------------------------------------------------
  public void push(int j){    // put item on top of stack 
    stackArray[++top] = j;
  }
  // -----------------------------------------------------
  public int pop(){    // put item on top of stack 
    return stackArray[top--];
  }
  // -----------------------------------------------------
  public int peek(){    // peek at top of stack
    return stackArray[top];
  }
  // -----------------------------------------------------
  public boolean isEmpty(){  // true if stack is empty
    return (top == -1);
  }
  // -----------------------------------------------------
  public int size(){        // return size
    return top + 1;
  }
  // -----------------------------------------------------
  public int peekN(int n){   // peek at index n
    return stackArray[n];
  }
  // -----------------------------------------------------
  public void displayStack(String s){
    System.err.print(s);
    System.err.print("Stack (bottom->top): ");
    for(int j=0; j < size(); j++){
      System.err.print(peekN(j));
      System.err.print(' ');
    }
    System.err.println("");
  }
} //end class StackX
