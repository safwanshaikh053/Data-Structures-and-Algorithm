package Linked_List_Examples;

import java.util.Scanner;

public class Linked_List_Linear
{
    // Root pointer that always points to the first node of the linked list
    Node root;    
    
    // Insert element at LEFT side (beginning of list)
    void insert_left(int data)
    {
        Node n = new Node(data);           // Create a new node with user data
        
        if(root == null)                   // List empty? this node becomes root
            root = n;
        else
        {
            n.next = root;                 // Link new node to existing first node
            root = n;                      // Move root to point to new node
        }
    }

    // Delete element from LEFT side (beginning of list)
    void delete_left()
    {
        if(root == null)                   // Underflow condition
            System.out.print("\nList empty");
        else
        {
            Node t = root;                 // Temporarily store node to delete
            root = root.next;              // Shift root to next node
            System.out.println(t.data + " Deleted");
        }
    }

    // Insert element at RIGHT side (end of list)
    void insert_right(int data)
    {
        Node n = new Node(data);           // Create new node
        
        if(root == null)                   // If first insertion
            root = n;
        else
        {
           Node t = root;                  // Start from the beginning
           
           while(t.next != null)           // Traverse until last node
               t = t.next;
           
           t.next = n;                     // Attach new node at the end
        }
    }

    // Delete element from RIGHT side (end of list)
    void delete_right()
    {
        if(root == null)                   // Underflow
            System.out.print("\nList empty");
        else
        {
            Node t, t2;
            t = t2 = root;                 // t2 trails t
            
            while(t.next != null)          // Move to last node
            {
                t2 = t;                    // Keep track of previous node
                t = t.next;
            }
            
            if(t == root)                  // Only one node present
                root = null;
            else
                t2.next = null;            // Remove last node link
            
            System.out.println(t.data + " Deleted");
        }
    }

    // Print entire linked list
    void print_list()
    {
        if(root == null)
            System.out.print("\nList empty");
        else 
        {
            Node t = root;
            System.out.print("\nLinked List: ");
            
            while (t != null)              // Traverse till end
            {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }
            System.out.println("NULL");
        }
    }

    // Search an element inside the list
    boolean search_list(int key)
    {
        if(root == null)
            System.out.print("\nList empty");
        else
        {
            Node t = root;

            while (t != null)              // Traverse and compare
            {
              if(t.data == key)            // Match found
                  return true;
              
              t = t.next;                  // Move ahead
            }
        }
        return false;                      // Not found
    }

    // Insert new element AFTER a given reference element
    void insert_after(int ref, int new_element)
    {
        if(root == null)
            System.out.print("\nList empty");
        else
        {
            Node t = root;

            while (t != null)
            {
                if(t.data == ref)          // Reference found
                {
                    System.out.print("\nReference Found..");
                    
                    Node n = new Node(new_element); // New node creation
                    n.next = t.next;        // Link new node to next of reference
                    t.next = n;             // Link reference node to new node
                    return;
                }
                t = t.next;                 // Continue search
            }
        }
    }

    // Delete a particular element from linked list
    void delete_element(int element)
    {
        if (root == null)
            System.out.print("\nList empty");
        else
        {
            Node t, t2;
            t = t2 = root;                 // t2 follows t

            while (t != null)
            {
                if (t.data == element)     // Match found
                {
                    System.out.print("\nFound");

                    if (t == root)         // Deleting first node
                        root = root.next;

                    else if (t.next == null) // Deleting last node
                        t2.next = null;

                    else                   // Deleting intermediate node
                        t2.next = t.next;

                    System.out.println(" -> " + t.data + " deleted");
                    return;
                }
                t2 = t;                    // Move both pointers
                t = t.next;
            }
            System.out.print("\nElement:" + element + " not found");
        }
    }

    // Main: Menu Driven Linked List Operations
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Linked_List_Linear list = new Linked_List_Linear();
        int ch;

        do
        {
            // Display menu
            System.out.println("\n\n===== LINKED LIST OPS =====");
            System.out.println("1. Insert Left");
            System.out.println("2. Delete Left");
            System.out.println("3. Insert Right");
            System.out.println("4. Delete Right");
            System.out.println("5. Print List");
            System.out.println("6. Search Element");
            System.out.println("7. Insert After");
            System.out.println("8. Delete Element");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.print("Enter element: ");
                    list.insert_left(sc.nextInt());
                    break;

                case 2:
                    list.delete_left();
                    break;

                case 3:
                    System.out.print("Enter element: ");
                    list.insert_right(sc.nextInt());
                    break;

                case 4:
                    list.delete_right();
                    break;

                case 5:
                    list.print_list();
                    break;

                case 6:
                    System.out.print("Enter key: ");
                    System.out.println(list.search_list(sc.nextInt()) ? "\nFound" : "\nNot Found");
                    break;

                case 7:
                    System.out.print("Enter reference element: ");
                    int ref = sc.nextInt();
                    System.out.print("Enter new element: ");
                    int newel = sc.nextInt();
                    list.insert_after(ref, newel);
                    break;

                case 8:
                    System.out.print("Enter element to delete: ");
                    list.delete_element(sc.nextInt());
                    break;

                case 0:
                    System.out.println("Mission terminated. Exiting… ✨");
                    break;

                default:
                    System.out.println("Invalid choice, boss.");
            }
        } while(ch != 0);
    }
}
