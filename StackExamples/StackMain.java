package StackExamples;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Stack obj=new Stack();
		        Scanner in=new Scanner(System.in);
		        System.out.println("Enter size of stack:");
		        int size=in.nextInt();
		        int choice=0;
		        obj.create_stack(size);
		        do
		        {
		            System.out.print("\nStack Menu");
		            System.out.print("\n----------");
		            System.out.print("\n1.Push");
		            System.out.print("\n2.Pop");
		            System.out.print("\n3.Peek");
		            System.out.print("\n4.Print");
		            System.out.print("\n0.Exit");
		            System.out.print("\n:");
		            choice=in.nextInt();
		            switch (choice) {
		                case 1:
		                    if (!obj.is_full())//not full
		                    {
		                        System.out.print("\nEnter Data:");
		                        int data=in.nextInt();
		                        obj.push(data);
		                        System.out.print("\n"+data+" pushed");
		                    }
		                    else
		                        System.out.print("\nStack Full");
		                    break;
		                case 2:
		                    if (!obj.is_empty())//not empty
		                    {
		                        System.out.print("\n"+obj.pop()+" is poped..");
		                    }
		                    else
		                        System.out.print("\nStack Empty");
		                    break;
		                case 3:
		                    if (!obj.is_empty())//not empty
		                    {
		                        System.out.print("\n"+obj.peek()+" is at peek");
		                    }
		                    else
		                        System.out.print("\nStack Empty");
		                    break;
		                case 4:
		                    if (!obj.is_empty())//not empty
		                    {
		                        System.out.print("\nStack has:\n");
		                        obj.print_stack();
		                    }
		                    else
		                        System.out.print("\nStack Empty");
		                    break;
		                case 0:
		                    System.out.print("\n Thanks for using the code..Safwannn");
		                    break;
		                default:
		                    System.out.print("\nWrong Choice given.");
		                    break;

		            }
		        }while(choice!=0);
		    }
	}


