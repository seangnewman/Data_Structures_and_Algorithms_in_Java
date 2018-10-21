package com.newmanuevers;
import com.newmanuevers.StackX;

// -------------------------------------------------------------------
class Reverser{
  private String input;             // input string
  private String output;            // output string

  // -----------------------------------------------------------------
  public Reverser(String in){
    input = in;
  }
  // -----------------------------------------------------------------
  public String doRev(){            // reverse the string
    int stackSize = input.length(); // get max stack size
    StackX theStack = new StackX(stackSize);

    for(int j=0; j < input.length();j++){
      char ch = input.charAt(j);
      theStack.push((ch));
    }
    output = "";
    while(!theStack.isEmpty()){
      char ch = theStack.pop();
      output = output + ch;
    }
    return output;
  }
}