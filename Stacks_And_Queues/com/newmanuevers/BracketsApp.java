package com.newmanuevers;
import java.io.*;
//------------------------------------------------------------------
// Stack used to check for matching brackets
// to run program c> java BracketsApp

class BracketsApp{
  public static void main(String[] args) throws IOException{
    String input;

    while(true){
      System.out.print("Enter string containing delimiters: ");
      System.out.flush();
      input = getString();        
      if(input.equals("")){
        break;
      }
      BracketChecker theChecker = new BracketChecker(input);
      theChecker.check();
    }
  }

  public static String getString() throws IOException{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
  }
}

