package Queue_Examples;

import java.util.Scanner;

//import StackExamples.Stack;

public class LinearQueue {

	 int front, rear, MaxSize, queue[];    //tos --> Top of Stack
	    void create_queue(int size)
	    {
	        MaxSize=size;
	        front=0;//init as stack starts from 0th index(Array)
	        rear=-1;
	        queue=new int[MaxSize];
	    }
	    //Enque : Entry Queue
	    // in this rear + 1 and then new entry taken.
	    void enqueue(int data)
	    {
	        queue[++rear] = data;
	    }
	    //is_full:
	    // if rear == MaxSize - 1 then full
	    boolean is_full()
	    {
	        return(rear==MaxSize-1);
	    }
	    //dequeue
	    // Remove and returns element from front
	    // in this front + 1 on every dequeue.
	    int dequeue()
	    {
	        return(queue[front++]);
	    }

	    //is_empty
	    //front > rear then empty
	    boolean is_empty()
	    {
	        return (front > rear); 
	    }
	    //print queue
	    // print queue in FIFO manner means from front rear
	    void print_queue()
	    {
	        for(int i=front; i<=rear; i++) {
	        	System.out.println(queue[i] + ",");
	        }
	    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        LinearQueue obj=new LinearQueue();
		        Scanner in=new Scanner(System.in);
		        System.out.println("Enter size of stack:");
		        int size=in.nextInt();
		        int choice=0;
		        obj.create_queue(size);
		        do
		        {
		            System.out.print("\nQueue Menu");
		            System.out.print("\n----------");
		            System.out.print("\n1.Enqueue");
		            System.out.print("\n2.Dequeue");
		            System.out.print("\n3.Print");
		            System.out.print("\n0.Exit");
		            System.out.print("\n:");
		            choice=in.nextInt();
		            switch (choice) {
		                case 1:
		                    if (!obj.is_full())//not full
		                    {
		                        System.out.print("\nEnter Data:");
		                        int data=in.nextInt();
		                        obj.enqueue(data);
		                        System.out.print("\n"+data+" pushed");
		                    }
		                    else
		                        System.out.print("\nStack Full");
		                    break;
		                case 2:
		                    if (!obj.is_empty())//not empty
		                    {
		                        System.out.print("\n"+obj.dequeue()+" is poped..");
		                    }
		                    else
		                        System.out.print("\nStack Empty");
		                    break;
		                case 3:
		                    if (!obj.is_empty())//not empty
		                    {
		                        System.out.print("\nStack has:\n");
		                        obj.print_queue();
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