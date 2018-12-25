package com.newmanuevers.Tree234;

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import com.newmanuevers.*;

class Tree234App {
  public static void main(String[] args) throws IOException {
    long value;
    Tree234 theTree = new Tree234();

    theTree.insert(50);
    theTree.insert(40);
    theTree.insert(60);
    theTree.insert(30);
    theTree.insert(70);

    while (true) {
      System.out.println("Enter first letter of ");
      System.out.println("show, insert or find:");

      char choice = getChar();

      switch (choice) {
      case 's':
        theTree.displayTree();
        break;
      case 'i':
        System.out.print("Enter value to insert: ");
        value = getInt();
        theTree.insert(value);
        break;
      case 'f':
        System.out.print("Enter value to find: ");
        value = getInt();
        int found = theTree.find(value);
        if (found != -1) {
          System.out.println("Found " + value);
        } else {
          System.out.println("Could not find " + value);
        }
      default:
        System.out.println("Invalid entry\n");
      }// end switch
    } // end while
  }

  // -----------------------------------------------------
  public static String getString() throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
  }

  // -----------------------------------------------------
  public static char getChar() throws IOException {
    String s = getString();
    return s.charAt(0);
  }

  // -----------------------------------------------------
  public static int getInt() throws IOException {
    String s = getString();
    return Integer.parseInt(s);
  }
}