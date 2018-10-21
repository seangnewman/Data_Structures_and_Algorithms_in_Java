package com.newmanuevers.MergeSort;

// demonstrates merging of two arrays into third
// =======================================================
class MergeApp {
  public static void main(String[] args) {
    int[] arrayA = { 23, 47, 81, 95 };
    int[] arrayB = { 7, 14, 39, 55, 62, 74 };
    int[] arrayC = new int[10];

    merge(arrayA, 4, arrayB, 6, arrayC);
    display(arrayC, 10);
  }

  // =====================================================
  // Merge A and B into C
  public static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
    int aDex = 0;
    int bDex = 0;
    int cDex = 0;

    // While neither Array A or Array B is empty
    while (aDex < sizeA && bDex < sizeB) {
      if (arrayA[aDex] < arrayB[bDex]) {
        arrayC[cDex++] = arrayA[aDex++];
      } else {
        arrayC[cDex++] = arrayB[bDex++];
      }
    }

    // If ArrayB is empty but ArrayA is not
    while (aDex < sizeA) {
      arrayC[cDex++] = arrayA[aDex++];
    }

    // If ArrayA is empty but ArrayB is not
    while (bDex < sizeB) {
      arrayC[cDex++] = arrayB[bDex++];
    }

  }

  // =====================================================
  public static void display(int[] theArray, int size) {
    for (int j = 0; j < size; j++) {
      System.out.println(theArray[j] + " ");
    }
    System.out.println(" ");
  }
  // =====================================================
}