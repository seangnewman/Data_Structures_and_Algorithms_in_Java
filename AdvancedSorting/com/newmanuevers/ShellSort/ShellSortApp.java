package com.newmanuevers.ShellSort;

import java.lang.*;

class ShellSortApp {
  public static void main(String[] args) {
    int maxSize = 10000;
    shellSort arr;
    arr = new shellSort(maxSize);

    for (int j = 0; j < maxSize; j++) {
      long n = (int) (Math.random() * 9999999);
      arr.insert(n);
    }
    arr.display();
    arr.ShellSort();
    arr.display();
  }
}