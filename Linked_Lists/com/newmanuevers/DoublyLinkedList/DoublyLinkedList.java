package com.newmanuevers.DoublyLinkedList;

// ==================================================
class DoublyLinkedList {
  private Link first; // ref to first item
  private Link last; // ref to last item

  // ------------------------------------------------
  public DoublyLinkedList() // constructor
  {
    first = null; // no items in the list
    last = null;
  }

  // ------------------------------------------------
  public boolean isEmpty() // true if no links
  {
    return first == null;
  }

  // ------------------------------------------------
  public void insertFirst(long dd) // insert at front of list
  {
    Link newLink = new Link(dd); // create a new link

    if (isEmpty()) { // if empty list
      last = newLink; // newLink <-- last
    } else {
      first.previous = newLink; // newLink <-- old.first
    }

    newLink.next = first;
    first = newLink;
  }

  // -------------------------------------------------------------------------
  public void insertLast(long dd) {
    Link newLink = new Link(dd); // create a new link

    if (isEmpty()) { // if empty list
      first = newLink; // newLink <-- last
    } else {
      last.next = newLink; // newLink <-- old.first
      newLink.previous = last;
    }

    last = newLink;

  }

  // --------------------------------------------------------------------------
  public Link deleteFirst() { // remove first link
    Link temp = first;

    if (first.next == null) {
      last = null;
    } else {
      first.next.previous = null;

    }
    first = first.next;
    return temp;
  }

  // -------------------------------------------------------------------------
  public Link deleteLast() {
    Link temp = last;

    if (first.next == null) {
      first = null;
    } else {
      last.previous.next = null;
    }
    last = last.previous;
    return temp;
  }

  // -------------------------------------------------------------------------
  public boolean insertAfter(long key, long dd) {
    Link current = first;

    while (current.dData != key) {
      current = current.next;
      if (current == null) {
        return false;
      }
    }

    Link newLink = new Link(dd);

    if (current == last) {
      newLink.next = null;
      last = newLink;
    } else {
      newLink.next = current.next;
      current.next.previous = newLink;
    }

    newLink.previous = current;
    current.next = newLink;
    return true;
  }

  // --------------------------------------------------------------------------
  public Link deleteKey(long key) {
    Link current = first;

    while (current.dData != key) {
      current = current.next;
      if (current == null) {
        return null;
      }

      if (current == first) {
        first = current.next;
      } else {
        current.previous.next = current.next;
      }

      if (current == last) {
        last = current.previous;
      } else {
        current.next.previous = current.previous;
      }

    }
    return current;

  }

  // --------------------------------------------------------------------------
  public void displayForward() {
    System.out.println("List (first->last) :");

    Link current = first;

    while (current != null) {
      current.displayLink();
      current = current.next;
    }

    System.out.println();
  }

  // ---------------------------------------------------------------------
  public void displayBackward() {
    System.out.println("List (last->last) :");

    Link current = last;

    while (current != null) {
      current.displayLink();
      current = current.previous;
    }

    System.out.println();
  }

}