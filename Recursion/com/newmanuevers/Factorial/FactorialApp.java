package com.newmanuevers.Factorial;

// Factorial java
// Evaluate factorial numbers
// ================================================
import java.io.*;

class FactorialApp {
  static int theNumber;

  public static void main(String[] args) throws IOException {
    System.out.print("Enter a number: ");
    theNumber = getInt();
    int theAnswer = factorial(theNumber);
    System.out.println("Factorial = " + theAnswer);
  } // end main
  // ==============================================

  public static int factorial(int n) {

    System.out.println("Entering : n = " + n);
    if (n == 0) {
      System.out.println("Returning base case of 0");
      return 1;
    } else {
      int temp = n * factorial(n - 1);
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