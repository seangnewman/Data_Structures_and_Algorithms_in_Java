package com.newmanuevers;
//orderedArray.java
//demonstrates ordered array class
//to run this program C>java orderedApp
///////////////////////////////////////
class orderedArray{
  private long[] a;             //ref to array a
  private int nElems;           // number of data items
  // ----------------------------------
  public orderedArray(int max){   //constructor
    a = new long[max];
    nElems = 0;
  }  
  // -----------------------------------
  public int size(){
    return nElems;
  }
  // ------------------------------------
  public int find(long searchKey){
    int lowerBound = 0;
    int upperBound = nElems - 1;
    int curIn;

    while(true){
        curIn = (lowerBound + upperBound) / 2;

        if(a[curIn] == searchKey){
          return curIn;                 // Value found
        }else if( lowerBound > upperBound){
          return nElems;          
        }else{
          if(a[curIn] < searchKey){
            lowerBound = curIn  + 1;    //Value is in the upper half
          }else{
            upperBound = curIn - 1;   // Value in lower halpf
          } // end else
        } // end while
      }// end find()
    }// ---------------------------------------------------------------
      public void insert(long value){   //place element into array

        int j;

        for(j=0; j < nElems; j++){
          if(a[j] > value)
          break;
        }
         
        for(int k = nElems; k > j; k--){
          a[k] = a[k-1];
        }
            
        a[j] = value;
        nElems++;
          // End insert
      } // ------------------------------------------------------------

      public boolean delete(long value){
        int j = find(value);
        if(j == nElems){                  // can't find it
          return false;               
        }else{                            // found it
          for(int k=j; k < nElems; k++){  // Move larger items down
            a[k] = a[k+1];
          }
          nElems--;                       //decrement size
          return true;
        }
      } // end delete

      // -------------------------------------------------------------
      public void display(){              // displays array contents
         
        for(int j=0; j < nElems; j++){    // for each element
          System.out.print(a[j] + " ");   // display
        }
        System.out.println();
      }  
    }  // End class orderedArray
  
 
 