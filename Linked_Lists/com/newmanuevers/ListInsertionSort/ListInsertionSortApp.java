package com.newmanuevers.ListInsertionSort;

class ListInsertionSortApp {
  public static void main(String[] args) {
    int size = 10;

    Link[] linkArray = new Link[size];

    for (int j = 0; j < size; j++) {
      int n = (int) (Math.random() * 99);
      Link newLink = new Link(n);
      linkArray[j] = newLink;
    }

    System.out.print("Usorted Array : ");
    for (int j = 0; j < size; j++) {
      System.out.println(linkArray[j].dData + " ");

    }
    System.out.println();

    SortedList theSortedList = new SortedList(linkArray);

    for (int j = 0; j < size; j++) {
      linkArray[j] = theSortedList.remove();
    }

    // display array contents
    System.out.println("Sorted Array: ");
    for (int j = 0; j < size; j++) {
      System.out.println(linkArray[j].dData + " ");
    }
    System.out.println();

  }
}