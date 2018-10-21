package com.newmanuevers.ListInsertionSort;

// =======================================================
class SortedList {
  private Link first;

  // -----------------------------------------------------
  // public SortedList() {
  // first = null;
  // }

  // -----------------------------------------------------
  public boolean isEmpty() {
    return (first == null);
  }

  // ------------------------------------------------------
  public void insert(Link key) {
    // Link newLink = new Link(key);
    Link previous = null;
    Link current = first;

    while (current != null && key.dData > current.dData) {
      previous = current;
      current = current.next;
    }

    // check if this is the first node
    if (previous == null) {
      first = key;
    } else {
      // traverse to next node
      previous.next = key;
    }

    key.next = current;
  }

  // =====================================================
  public Link remove() {
    Link temp = first;
    // Queue implementation, FIFO
    first = first.next;
    return temp;
  }

  // =====================================================
  public void displayList() {
    System.out.println("List (first --> last): ");
    Link current = first;

    while (current != null) {
      current.displayLink();
      current = current.next;
    }

    System.out.println("");
  }

  // =====================================================
  public SortedList() {
    first = null;
  }

  // =====================================================
  public SortedList(Link[] linkArr) {
    first = null;
    for (int j = 0; j < linkArr.length; j++) {
      insert(linkArr[j]);
    }
  }
}