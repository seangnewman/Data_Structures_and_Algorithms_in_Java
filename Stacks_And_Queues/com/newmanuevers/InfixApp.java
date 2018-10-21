package com.newmanuevers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InfixApp{
  public static void main(String[] args) throws IOException{
    String input, output;
    while(true){
      System.out.print("Enter infix: ");
      System.out.flush();
      input = getString();                // read a string from file
      if(input.equals(" ")){
        break;
      }

      InToPost theTrans = new InToPost(input);
      output = theTrans.doTrans();              // do the translation
      System.err.println("Postfix is " + output + "\n");

    } // end while
  } // end main

  public static String getString() throws IOException{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
  }
}