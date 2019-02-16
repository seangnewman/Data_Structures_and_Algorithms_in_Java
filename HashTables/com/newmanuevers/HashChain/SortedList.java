package com.newmanuevers.HashChain;

class SortedList{
  private Link first;                       // ref to first list item

  // ----------------------------------------------------------------------------------------------
  public void SortedList(){
      first = null;
  }
  // ----------------------------------------------------------------------------------------------
  public void insert(Link theLink){
      /// insert link in order
      int key = theLink.getKey();
      Link previous = null;
      Link current = first;

      while(current != null && key > current.getKey()){
        previous = current;
        current = current.next;
      } // end while

      if(previous == null){
          first = theLink;
      }else{
          previous.next = theLink;
      }

      theLink.next = current;
  }
  // ----------------------------------------------------------------------------------------------
  public void delete(int key){
      Link previous = null;
      Link current = first;

      while(current != null && key != current.getKey()){
        previous = current;
        current = current.next;
      }  // end while

      if(previous == null){
          first = first.next;
      }else{
          previous.next = current.next;
      }
  }
  // ----------------------------------------------------------------------------------------------
  public Link find(int key){
      Link current = first;
      
      while(current != null && current.getKey() <= key){
        if(current.getKey() == key){
            return current;
        }
        current = current.next;
      } // end whiile
      return null;
  }
  // ----------------------------------------------------------------------------------------------
  public void displayList(){
      System.out.print("List (first-->last): ");
      Link current = first;

      while(current != null){
        current.displayLink();
        current = current.next;
      } // end while
  }
  // ----------------------------------------------------------------------------------------------
  
} // end class SortedList