package com.newmanuevers;

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
  // public void insertFirst(int id, double dd){
  public void insertFirst(long dd) {
    // Link newLink = new Link(id, dd);
    Link newLink = new Link(dd);
    newLink.next = first; // set next -> old first
    first = newLink; // set first = newLink
  }

  // -----------------------------------------------------
  public Link find(int key) {
    Link current = first;
    while (current.iData != key) {
      if (current.next == null) {
        return null;
      } else {
        current = current.next;
      }

    }
    return current; // return found link
  }

  // -----------------------------------------------------
  public Link delete(int key) {
    Link current = first;
    Link previous = first;

    while (current.iData != key) {
      if (current.next == null) {
        return null;
      } else {
        previous = current;
        current = current.next;
      }
    }
    if (current == first) {
      first = first.next;
    } else {
      previous.next = current.next;
    }
    return current;
  }

  // -----------------------------------------------------
  // public Link deleteFirst() {
  // Link temp = first; // save current reference
  // first = first.next; // delete it: first -> old next
  // return temp;
  // }
  public long deleteFirst() {
    Link temp = first; // save current reference
    first = first.next; // delete it: first -> old next
    return temp.dData;
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