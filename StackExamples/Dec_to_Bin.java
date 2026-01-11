package StackExamples;
//dec to binary
import java.util.Scanner;
import java.util.Stack;

public class Dec_to_Bin
{
  public static void main(String[] args) {
      Stack<Integer> obj = new Stack<>();
      Scanner in = new Scanner(System.in);
      System.out.println("Enter number:");
      int number = in.nextInt();
      //till number is not zero %2-->push stack /2-->update number continues
    
      while(number != 0) {
          obj.push(number % 2);  
          number = number / 2;   
      }
      
      //till stack not empty pop and print
      while(!obj.empty())
      {
    	  System.out.print(obj.pop());
      }

  }
}
