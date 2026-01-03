package Linked_List_Examples;

import java.util.Scanner;

public class DoublyLinkedList {
	
	    // root (head) pointer that always points to the FIRST node of the Doubly Linked List
	    DNode root;    
	    
	    // Insert an element at the LEFT side (BEGINNING) of the list
	    void insert_left(int data)
	    {
	        DNode n = new DNode(data);          // Create a new node with user-given data
	        
	        if(root == null)                    // If list is EMPTY, new node becomes root
	            root = n;
	        else
	        {
	            n.right = root;                 // Link new node to current first node
	            root.left = n;                  // Link current first node back to new node
	            root = n;                       // Make new node the new root
	        }
	    }

	    // Delete an element from the LEFT side (BEGINNING) of the list
	    void delete_left()
	    {
	        if(root == null)                    // Underflow condition → list empty
	            System.out.print("\nList empty");
	        else
	        {
	            DNode t = root;                 // Temporary pointer to node being deleted
	            
	            if(root.right == null)          // If only ONE NODE exists
	            	root = null;                // After deletion, list becomes empty
	            else {
	            	root = root.right;          // Move root to next node
	            	root.left = null;           // Set new root’s left pointer to null
	            }
	            System.out.println(t.data + " Deleted");  // Display deleted data
	        }
	    }

	    // Insert element at the RIGHT side (END) of the list
	    void insert_right(int data)
	    {
	        DNode n = new DNode(data);          // Create a new node
	        
	        if(root == null)                    // If list empty, new node becomes root
	            root = n;
	        else
	        {
	           DNode t = root;                 // Start traversing from root
	           
	           while(t.right != null)          // Traverse till LAST node
	               t = t.right;
	           
	           t.right = n;                    // Link last node to new node
	           n.left = t;                     // Link new node back to last node
	        }
	    }

	    // Delete element from the RIGHT side (END) of the list
	    void delete_right()
	    {
	        if(root==null)                      // Underflow condition → no node to delete
	            System.out.print("\nList empty");
	        else
	        {
	            DNode t,t2;
	            t=root;                         // t moves till last node
	            
	            while(t.right!=null)            // Traverse to the LAST node
	                t=t.right;

	            if(t==root)                     // If only ONE node exists
	                root=null;                  // After deletion, list becomes empty
	            else
	            {
	                t2=t.left;                  // t2 becomes second last node
	                t2.right=null;              // Remove link to last node
	            }
	            System.out.println(t.data+" Deleted"); // Show deleted data
	        }
	    }

	    // Print entire Doubly Linked List from LEFT → RIGHT
	    void print_list()
	    {
	        if(root == null)                    // If no nodes exist
	            System.out.print("\nList empty");
	        else 
	        {
	            DNode t = root;                 // Start from root
	            System.out.print("\nLinked List: ");
	            
	            while (t != null)               // Traverse till end
	            {
	                System.out.print("|" + t.data + "|->");
	                t = t.right;                // Move to next node
	            }
	            System.out.println("NULL");
	        }
	    }
	    
	    // Print list in REVERSE order: RIGHT → LEFT
	    void print_list_rev()
	    {
	        if(root == null)                    // If list empty
	            System.out.print("\nList empty");
	        else 
	        {
	            DNode t = root;                 // Start pointer
	            System.out.print("\nLinked List: ");
	            
	            while (t.right != null)         // Move to LAST node
	            {
	                t = t.right;
	            }
	            while (t != null)               // Traverse backwards
	            {
	                System.out.print("|" + t.data + "|->");
	                t = t.left;                 // Move to previous node
	            }
	            System.out.println("NULL");
	        }
	    }

	    // Main: Menu Driven Program for Doubly Linked List operations
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        DoublyLinkedList list = new DoublyLinkedList(); // Create list object
	        int ch;

	        do
	        {
	            // Display operations menu
	            System.out.println("\n\n===== LINKED LIST OPS =====");
	            System.out.println("1. Insert Left");
	            System.out.println("2. Delete Left");
	            System.out.println("3. Insert Right");
	            System.out.println("4. Delete Right");
	            System.out.println("5. Print List");
	            System.out.println("6. Print Reversed List");
	            System.out.println("0. Exit");
	            System.out.print("Enter choice: ");
	            ch = sc.nextInt();               // Accept user choice

	            switch(ch)
	            {
	                case 1:
	                    System.out.print("Enter element: ");
	                    list.insert_left(sc.nextInt());   // Call insert_left
	                    break;

	                case 2:
	                    list.delete_left();               // Delete from beginning
	                    break;

	                case 3:
	                    System.out.print("Enter element: ");
	                    list.insert_right(sc.nextInt());  // Call insert_right
	                    break;

	                case 4:
	                    list.delete_right();              // Delete from end
	                    break;

	                case 5:
	                    list.print_list();                // Display list normally
	                    break;

	                case 6:
	                    list.print_list_rev();            // Display reversed list
	                    break;

	                case 0:
	                    System.out.println("Mission terminated. Exiting… ✨");
	                    break;

	                default:
	                    System.out.println("Invalid choice, boss."); // Wrong input
	            }
	        } while(ch != 0);  // Continue until user chooses 0
	    }
	}