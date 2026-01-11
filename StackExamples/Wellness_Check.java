package StackExamples;
//wellness
import java.util.Scanner;
import java.util.Stack;

public class Wellness_Check
{
  static boolean Check_Wellness(String Pattern)
  {
	  Stack<Character> obj = new Stack<>();

      // read char by char
      for(char ch : Pattern.toCharArray())
      {
          if(ch == '{')          // if opening brace, push
              obj.push(ch);
          else if(ch == '}')     // if closing brace
          {
              if(obj.empty()) 
                  return false;
              else
                  obj.pop();  
          }
      }
      
      // end: return true if stack is empty 
      return obj.empty();
  }
  public static void main(String[] args) {
      Stack<Character> obj = new Stack<>();
      Scanner in = new Scanner(System.in);
      System.out.println("Enter Pattern:");
      String Pattern = in.next();
      boolean result=Check_Wellness(Pattern);
      System.out.print("\nPattern:"+Pattern+" is:"+result);
  }
}