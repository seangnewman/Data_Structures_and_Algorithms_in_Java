package com.newmanuevers.Iterator;

class LinkList {
  private Link first; // ref to first link on list

  // -----------------------------------------------------
  public LinkList() { // constructor
    first = null; // no items on list yet
  }

  // -----------------------------------------------------
  public boolean isEmpty() { // true if list is empty
    return (first == null);
  }

  // -----------------------------------------------------
  public Link getFirst() {
    return first;
  }

  // ---------------------------------------------------
  public void setFirst(Link f) {
    first = f;
  }

  // --------------------------------------------------
  public ListIterator getIterator() {
    return new ListIterator(this);
  }


  // -----------------------------------------------------
  public void displayList() {
    System.out.print("list (first->last): ");
    Link current = first; // start at beginning of link

    while (current != null) {
      current.displayLink(); // print data
      current = current.next; // move to next link
    }
    System.out.println("");

  }
}