package com.newmanuevers.StackTriangle;

class StackX {
  private int maxSize; // size of StackX
  private Params[] stackArray;
  private int top; // Top of stack
  // ===========================================

  public StackX(int s) {
    maxSize = s;
    stackArray = new Params[maxSize];
    top = -1; // No items yet
  }

  // ===========================================
  public void push(Params p) {
    stackArray[++top] = p;
  }

  // ===========================================
  public Params pop() {
    return stackArray[top--];
  }

  // ===========================================
  public Params peek() {
    return stackArray[top];
  }
  // ===========================================
}