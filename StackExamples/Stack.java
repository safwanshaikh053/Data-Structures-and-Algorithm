package StackExamples;

public class Stack {

	 int tos,MaxSize,stack[];    //tos --> Top of Stack
	    public void create_stack(int size)
	    {
	        MaxSize=size;
	        tos=-1;//init as stack starts from 0th index(Array)
	        stack=new int[MaxSize];
	    }
	    //push:Inserts one element on top of the stack.
	    //tos+1 and then accept the element
	    void push(int data)
	    {
	        tos++;
	        stack[tos]=data;
	        //stack[++tos]=data;
	    }
	    //is_full:
	    // if tos is at last location return true(full)e else false
	    boolean is_full()
	    {
	        if(tos==MaxSize-1)
	            return true;
	        else
	            return false;
	        //return(tos==MaxSize-1);
	    }
	    //pop:
	    // Remove and returns the topmost element from the stack by reducing tos-1.
	    int pop()
	    {
	       int temp=stack[tos];
	       tos--;//reduced
	        return(temp);
	        //return(stack[tos--]);
	    }

	    //is_empty
	    //Sources at -1, that means stack is empty, so returns true.
	    boolean is_empty()
	    {
	        if(tos==-1)
	            return true;
	        else
	            return false;
	        //return(tos==-1);
	    }
	    //peek
	    // only returns the topmost element from the stack.
	    int peek()
	    {
	        return(stack[tos]);
	    }
	void print_stack()//print stack in LIFO manner means from top to bottom
	    {
	        for(int i=tos;i>=0; i--)
	            System.out.println(stack[i]);
	    }
}