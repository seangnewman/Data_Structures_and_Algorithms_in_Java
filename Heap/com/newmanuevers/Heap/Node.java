package com.newmanuevers.Heap;

class Node {
  private int iData;              // key value
  // ---------------------------------------------------------------------------------
  public Node( int key ){
    iData = key;
  } // End constructor
  // ---------------------------------------------------------------------------------

  public int getKey() {
    return iData;
  }

  // ---------------------------------------------------------------------------------
  public void setKey(int id) {
    iData = id;
  }
}// End of class Node