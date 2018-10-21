package com.newmanuevers.MergeSort;

// Demonstrates the recursive merge sort
// =======================================================
class DArray {
  private long[] theArray; // ref to array
  private int nElems; // number of items
  // =====================================================

  public DArray(int max) {
    theArray = new long[max];
    nElems = 0;
  }

  // =====================================================
  public void insert(long value) {
    theArray[nElems] = value; // insert it
    nElems++; // increment size
  }

  // =====================================================
  public void display() {
    for (int j = 0; j < nElems; j++) {
      System.out.print(theArray[j] + " ");
    }
    System.out.println(" ");
  }

  // ====================================================
  public void mergeSort() {
    long[] workSpace = new long[nElems];
    recMergeSort(workSpace, 0, nElems - 1);
  }

  // ====================================================
  private void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {
    if (lowerBound == upperBound) {
      return;
    } else {
      int mid = (lowerBound + upperBound) / 2;

      // sort the lower half
      recMergeSort(workSpace, lowerBound, mid);
      // sort the upper half
      recMergeSort(workSpace, mid + 1, upperBound);
      // Merge the two halves
      merge(workSpace, lowerBound, mid + 1, upperBound);
    }
  }

  // ====================================================
  private void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound) {
    int j = 0;
    int lowerBound = lowPtr;
    int mid = highPtr - 1;
    // find the number of items in array
    int n = upperBound - lowerBound + 1;

    while (lowPtr <= mid && highPtr <= upperBound) {
      if (theArray[lowPtr] < theArray[highPtr]) {
        workSpace[j++] = theArray[lowPtr++];
      } else {
        workSpace[j++] = theArray[highPtr++];
      }
    }

    while (lowPtr <= mid) {
      workSpace[j++] = theArray[lowPtr++];
    }

    while (highPtr <= upperBound) {
      workSpace[j++] = theArray[highPtr++];
    }

    for (j = 0; j < n; j++) {
      theArray[lowerBound + j] = workSpace[j];
    }
  }
}