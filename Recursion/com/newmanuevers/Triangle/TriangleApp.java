package com.newmanuevers.Triangle;

// triangle java
// Evaluate triangular numbers
// ================================================
import java.io.*;

class TriangleApp {
  static int theNumber;

  public static void main(String[] args) throws IOException {
    System.out.print("Enter a number: ");
    theNumber = getInt();
    int theAnswer = triangle(theNumber);
    System.out.println("Triangle = " + theAnswer);
  } // end main
  // ==============================================

  public static int triangle(int n) {

    System.out.println("Entering : n = " + n);
    if (n == 1) {
      System.out.println("Returning base case of 1");
      return 1;
    } else {
      int temp = n + triangle(n - 1);
      System.out.println("Returning " + temp);
      return temp;
    }
  }

  // ==============================================
  public static String getString() throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
  }

  // =============================================
  public static int getInt() throws IOException {
    String s = getString();
    return Integer.parseInt(s);
  }
  // =============================================
}