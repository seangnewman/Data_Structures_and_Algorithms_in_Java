package com.newmanuevers.BinarySearch;

// ===============================================
class OrdArray {
  private long[] a;
  private int numElems; // Number of data items
  // =============================================

  public OrdArray(int max) {
    a = new long[max];
    numElems = 0;
  }

  // =============================================
  public int size() {
    return numElems;
  }

  // =============================================
  public int find(long searchKey) {
    return recFind(searchKey, 0, numElems - 1);
  }

  // =============================================
  private int recFind(long searchKey, int lowerBound, int upperBound) {
    int curIn;

    curIn = (lowerBound + upperBound) / 2;

    if (a[curIn] == searchKey) {
      return curIn;
    } else if (lowerBound > upperBound) {
      return numElems;
    } else {
      if (a[curIn] < searchKey) {
        return recFind(searchKey, curIn + 1, upperBound);
      } else {
        return recFind(searchKey, lowerBound, curIn - 1);
      }
    }
  }

  // =============================================
  public void insert(long value) {

    int j;
    for (j = 0; j < numElems; j++) {
      if (a[j] > value) {
        break;
      }
    }

    for (int k = numElems; k > j; k--) {
      a[k] = a[k - 1];
    }

    a[j] = value;
    numElems++;
  }

  // =============================================
  public void display() {
    for (int j = 0; j < numElems; j++) {
      System.out.print(a[j] + " ");
    }
    System.out.println(" ");
  }
  // ============================================
}
