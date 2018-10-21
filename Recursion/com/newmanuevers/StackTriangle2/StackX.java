package com.newmanuevers.StackTriangle2;

class StackX {
  private int maxSize; // size of StackX
  private int[] stackArray;
  private int top; // Top of stack
  // ===========================================

  public StackX(int s) {
    maxSize = s;
    stackArray = new int[maxSize];
    top = -1; // No items yet
  }

  // ===========================================
  public void push(int p) {
    stackArray[++top] = p;
  }

  // ===========================================
  public int pop() {
    return stackArray[top--];
  }

  // ===========================================
  public int peek() {
    return stackArray[top];
  }

  // ===========================================
  public boolean isEmpty() {
    return (top == -1);
  }
}