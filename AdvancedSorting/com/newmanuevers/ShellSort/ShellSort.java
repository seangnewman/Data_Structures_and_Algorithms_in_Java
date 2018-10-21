
package com.newmanuevers.ShellSort;

class shellSort {
  private long[] theArray;
  private int nElems;

  // ==========================================
  public shellSort(int max) {
    theArray = new long[max];
    nElems = 0;
  }

  // ==========================================
  public void insert(long value) {
    theArray[nElems] = value;
    nElems++;
  }

  // =========================================
  public void display() {
    System.out.print("A=");
    for (int j = 0; j < nElems; j++) {
      System.out.print(theArray[j] + " ");
    }
    System.out.println("");
  }

  // ==========================================
  public void ShellSort() {
    int inner, outer;
    long temp;

    int h = 1;
    while (h <= nElems / 3) {
      h = h * 3 + 1;
    }

    while (h > 0) {
      for (outer = h; outer < nElems; outer++) {
        temp = theArray[outer];
        inner = outer;

        while (inner > h - 1 && theArray[inner - h] >= temp) {
          theArray[inner] = theArray[inner - h];
          inner -= h;
        }
        theArray[inner] = temp;

      }
      h = (h - 1) / 3;
    }
  }
  // =========================================
}