package com.newmanuevers.Partition;

import java.lang.*;

class PartitionApp {
  public static void main(String[] args) {
    int maxSize = 16;
    ArrayPartition arr;
    arr = new ArrayPartition(maxSize);

    for (int j = 0; j < maxSize; j++) {
      long n = (int) (Math.random() * 199);
      arr.insert(n);
    }

    arr.display();

    long pivot = 99;
    System.out.print("Pivot is " + pivot);
    int size = arr.size();

    int partDex = arr.partition(0, size - 1, pivot);
    System.out.println(", Partition is at index " + partDex);
    arr.display();

  }
}