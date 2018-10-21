package com.newmanuevers.ListInsertionSort;

// LinkList.java
// demonstrates linked lists
// -------------------------------------------------------
class Link {
  public long dData;
  public Link next; // nex link in list
  // -----------------------------------------------------

  public Link(long dd) {
    dData = dd;
  }

  // -----------------------------------------------------
  public void displayLink() { // display oneself

    System.out.print("{" + dData + "} ");
  }
}