package com.newmanuevers;
// infix.java
// converts infix arithmetic expressions to postfix
// to run this program
// --------------------------------------------------------------------
class StackX{
  private int maxSize;
  private char[] stackArray;
  private int top;

  // ------------------------------------------------------------------
  public StackX(int s){                   // constructor
    maxSize = s;
    stackArray = new char[maxSize];
    top = -1;
  }
  // ------------------------------------------------------------------
  public void push(char j){               // put item on top of stack
    stackArray[++top] = j;
  }
  // ------------------------------------------------------------------
  public char pop(){
    return stackArray[top--];
  }
  // ------------------------------------------------------------------
  public char peek(){
    return stackArray[top];
  }
  // ------------------------------------------------------------------
  public boolean isEmpty(){               // true if stack is empty
    return ( top == -1);
  }
  // ------------------------------------------------------------------
  public int size(){                      // return size
    return top + 1;
  }
  // ------------------------------------------------------------------
  public char peekN(int n){               // return item at index n
    return stackArray[n];
  }
  // ------------------------------------------------------------------
  public void displayStack(String s){     // 
    System.out.print(s);
    System.out.print("Stack (bottom-->top): ");

    for(int j=0; j<size(); j++){
      System.out.print(peekN(j));
      System.out.print(' ');
    }

    System.out.println("");
  }
}  // end class StackX