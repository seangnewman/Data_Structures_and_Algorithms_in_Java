package com.newmanuevers;
// queue.java
// demonstrates queue
// --------------------------------------------------------------------
class Queue{
  private int maxSize;
  private long[] queArray;
  private int front;
  private int rear;
  //private int nItems;

  // ------------------------------------------------------------------
  public Queue(int s){         // constructor
    //maxSize = s;
    maxSize = s + 1;            // array is 1 cell larger
    queArray = new long[maxSize];
    front = 0;
    rear = -1;
    //nItems = 0;
  }
  // ------------------------------------------------------------------
  public void insert(long j){       // put itm at rear of queue
    if(rear == maxSize - 1){         // deal with wraparound 
      rear = -1;
    }
    queArray[++rear] = j;            // increment rear and insert
    //nItems++;                        // increment item count    
  }
  // ------------------------------------------------------------------
  public long remove(){               // take item from front of queue
    long temp = queArray[front++];    // get value and increment front
    if(front == maxSize){
      front = 0;
    }
    //nItems--;
    return temp;

  }
  // ------------------------------------------------------------------
  public long peekFront(){               // peek at front of queue
    return queArray[front];
  }
  // ------------------------------------------------------------------
  public long peek(){                     // peek at front of queue
    return queArray[front];

  }
  // ------------------------------------------------------------------
  public boolean isEmpty(){              // true if queue is empty
    //return (nItems == 0);
    return ( rear+1 == front || (front+maxSize-1 == rear) );
  }
  // ------------------------------------------------------------------
  public boolean isFull(){              // true if queue is full
    //return (nItems == maxSize);
    return (rear+2 == front || (front+maxSize-2 == rear));
  }
  // ------------------------------------------------------------------
  public int size(){                    // number of items in queueu
    //return nItems;

    if(rear >= front){
      return rear-front + 1;
    }else{
      return (maxSize - front ) + (rear + 1);
    }
  }

} // End Class