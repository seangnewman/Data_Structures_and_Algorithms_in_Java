package com.newmanuevers.HashChain;
class Link{
  private int iData;                            // data item
  public Link next;                             // next link in list
  // ---------------------------------------------------------------
  public Link(int it){
      iData = it;
  }
  // ---------------------------------------------------------------
  public int getKey(){
      return iData;
  }
  // ---------------------------------------------------------------
  public void displayLink(){
      // Display this link
      System.out.print(iData + " ");
  }

}// end class Link