package Linked_List_Examples;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentManagement {
	
	 public static void main(String[] args)
	    {
	        LinkedList<Snode> StudentList=new LinkedList<>();
	        Scanner in = new Scanner(System.in);
	        //adding record

	        Snode s=new Snode(1,"abcde","male",26);
	        StudentList.add(s);
	        Snode s1=new Snode(2,"appu","male",16);
	        StudentList.add(s1);
	        Snode s2=new Snode(3,"appi","female",6);
	        StudentList.add(s2);
	        Snode s3=new Snode(4,"appa","male",56);
	        StudentList.add(s3);
	        
	        //print all
	        
	        for(Snode item : StudentList) {
	        	item.print_Snode();
	        }
	        
	        
	        //Searching
	        
	        System.out.print("\nEnter roll number to search:");
	        int rollNo=in.nextInt();
	        boolean flag=false;
	        for (Snode item:StudentList)
	        {
	            if(item.rollNo==rollNo)
	            {
	                System.out.print("\nFound");
	                item.print_Snode();
	                flag=true;
	            }
	        }
	        if(flag==false)//not found
	            System.out.print("\n"+rollNo+" not found");
	    }
	 
 }

	
