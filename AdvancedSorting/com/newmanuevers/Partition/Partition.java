package com.newmanuevers.Partition;

class ArrayPartition {
  private long theArray[];
  private int nElems;

  // =================================================
  public ArrayPartition(int max) {
    theArray = new long[max];
    nElems = 0;
  }

  // =================================================
  public void insert(long value) {
    theArray[nElems] = value;
    nElems++;
  }

  // ================================================
  public int size() {
    return nElems;
  }

  // ================================================
  public void display() {
    System.out.print("A=");

    for (int j = 0; j < nElems; j++) {
      System.out.print(theArray[j] + " ");
    }
    System.out.println("");
  }

  // ================================================
  public int partition(int left, int right, long pivot) {
    int leftPtr = left - 1;
    int rightPtr = right + 1;

    while (true) {
      while (leftPtr < right && theArray[++leftPtr] < pivot) {
        // take no action
      }
      while (rightPtr > left && theArray[--rightPtr] > pivot) {
        // take no action
      }

      if (leftPtr >= rightPtr) {
        break;
      } else {
        swap(leftPtr, rightPtr);
      }
    }
    return leftPtr;
  }

  // ===============================================
  public void swap(int dex1, int dex2) {
    long temp;
    temp = theArray[dex1];

    theArray[dex1] = theArray[dex2];
    theArray[dex2] = temp;
  }
  // ================================================
}