package com.newmanuevers;

class FirstLastList{
  private Link first;           // ref to first link
  private Link last;            // ref to last link

  // -----------------------------------------------------
  public FirstLastList(){
    first = null;               // no links on list yet
    last = null;                // 
  }
  // -----------------------------------------------------
  public boolean isEmpty(){
    return first == null;
  }
  // -----------------------------------------------------
  public void insertFirst(long dd){
    Link newLink = new Link(dd);

    if(isEmpty()){                    // if empty list
      last = newLink;                 // newLink <-- last
    }
    newLink.next = first;             // newLink --> old first
    first = newLink;                  // first --> newLink
  }

  // --------------------------------------------------------------------------
  public void insertLast(long dd){
    Link newLink = new Link(dd);      // make new link

    if(isEmpty()){                    // if empty list
      first = newLink;                // first --> newLink
    }else{
      last.next = newLink;             // old last --> newLink
    }

    last = newLink;                     // newLink <-- last
  }
  // --------------------------------------------------------------------------
  public long deleteFirst(){
    long temp = first.dData;

    if(first.next == null){                     // if only one item
      last = null;
    }

    first = first.next;                         // first --> old next
    return temp;
  }

  // -------------------------------------------------------------------------
  public void displayList(){
    System.out.print("List (first->last): ");

    Link current = first;

    while(current != null){
      current.displayLink();
      current = current.next;
    }

    System.out.println("");
  }
  
}