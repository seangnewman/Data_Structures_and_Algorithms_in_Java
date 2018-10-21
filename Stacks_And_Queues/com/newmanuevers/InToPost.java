package com.newmanuevers;



class InToPost{                       // infix to postfix conversion
  private StackX theStack;
  private String input;
  private String output = "";
  // ------------------------------------------------------------------

  public InToPost(String in){         // constructor
    input = in;
    int stackSize = input.length();
    theStack = new StackX(stackSize);
  }
  // ------------------------------------------------------------------
  public String doTrans(){            // do translationin postfix
    for(int j=0; j<input.length();j++){
      char ch = input.charAt(j);
      theStack.displayStack("For " + ch + " "); //*diagnostic*

      switch(ch){
        case '+':               
        case '-':
          gotOper(ch, 1);
          break;
        case '*':
        case '/':
          gotOper(ch, 2);
          break;
        case '(':
          theStack.push(ch);
          break;
        case ')':
          gotParen(ch);
          break;
        default:
          output = output + ch;
          break;
      } // end switch
    } // end for
  while(!theStack.isEmpty()){
    theStack.displayStack("While ");    // * diagnostic *
    output = output + theStack.pop();
  }
  theStack.displayStack("End ");
  return output;
  }

  // ------------------------------------------------------------------
  public void gotOper(char opThis, int prec1){ // get operator from input
    while(!theStack.isEmpty()){
      char opTop = theStack.pop();

      if(opTop == '('){
        theStack.push(opTop);
        break;
      }else{
        int prec2;

        if(opTop == '+' || opTop == '-'){
          prec2 = 1;
        }else{
          prec2 = 2;
        }

        if(prec2 < prec1 ){
          theStack.push(opTop);
          break;
        }else{
          output = output + opTop;
        } // end else
      } // end while
      
    }
    theStack.push(opThis);
  }
  // ------------------------------------------------------------------
  public void gotParen(char ch){
    while(!theStack.isEmpty()){
      char chx = theStack.pop();

      if( chx == '('){                      // if popped '('
        break;                              // done
      }else{                                // if popped operator
        output = output + chx;              // output it
      }
    } // end while
  } // end popOps()

}