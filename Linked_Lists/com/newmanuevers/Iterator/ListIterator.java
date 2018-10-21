package com.newmanuevers.Iterator;

class ListIterator {
  private Link current; // current link
  private Link previous; // previous link
  private LinkList ourList; // our linked list

  // ----------------------------------------------------
  public ListIterator(LinkList list) // constructor
  {
    ourList = list;
    reset();
  }

  // ----------------------------------------------------
  public void reset() { // move to top
    current = ourList.getFirst();
    previous = null;
  }

  // ----------------------------------------------------
  public boolean atEnd() // true if last link
  {
    return (current.next == null);
  }

  // -----------------------------------------------------
  public void nextLink() // go to next line
  {
    previous = current;
    current = current.next;
  }

  // ----------------------------------------------------
  public Link getCurrent() { // get current link
    return current;
  }

  // ----------------------------------------------
  public void insertBefore(long dd) {
    Link newLink = new Link(dd);

    if (previous == null) {
      newLink.next = ourList.getFirst();
      ourList.setFirst(newLink);
      reset();
    } else {
      newLink.next = previous.next;
      previous.next = newLink;
      current = newLink;
    }
  }

  // ----------------------------------------------------
  public void insertAfter(long dd) // insert after
  {
    Link newLink = new Link(dd);

    if (ourList.isEmpty()) // empty list
    {
      ourList.setFirst(newLink);
      current = newLink;
    } else {
      // not beginning
      newLink.next = current.next;
      current.next = newLink;
      current = newLink;
    }
  }

  // -----------------------------------------------------
  public long deleteCurrent() // delete item at current
  {
    long value = current.dData;

    if (previous == null) {
      ourList.setFirst(current.next);
      reset();
    } else {
      previous.next = current.next;
      if (atEnd()) {
        reset();
      } else {
        current = current.next;
      }
    }
    return value;
  }
  // ----------------------------------------------------
}