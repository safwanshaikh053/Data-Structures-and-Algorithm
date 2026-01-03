package Linked_List_Examples;

import java.util.Scanner;

public class EmployeeManagement {

	Enode root;
	
	//A. Create / Insert Employee (At End)//insert_right()
	void addEmployee(int id, String name, double salary)
	{
	    // Step 1: Create a new employee node
	    Enode n = new Enode(id, name, salary);

	    // Step 2: If list is empty → new node becomes head/root
	    if(root == null)
	        root = n;
	    else
	    {
	        // Step 3: Traverse to the last node
	        Enode t = root;   //Create a temporary Pointer t.
	        while(t.next != null)    //Move until last employee
	            t = t.next;				//Traverse forward

	        // Step 4: Attach new node at the end
	        t.next = n;				//Add new employee at the end
	    }

	    System.out.println("\nEmployee added successfully!");
	}

	//B. Display All Employees//print_list
	void displayEmployees() {
		        if(root == null)
		            System.out.print("\nList empty");
		        else 
		        {
		            Enode t = root;
		            System.out.print("\nLinked List: ");
		            
		            while (t != null)              // Traverse till end
		            {
		            	System.out.print("|ID:" + t.id + ", Name:" + t.name + ", Salary:" + t.salary + "|->");
		                t = t.next;
		            }
		            System.out.println("NULL");
		        }
		    
	}
	//C. Search Employee by ID//list_search
	boolean searchEmployee(int id) {
		if(root == null) {
			System.out.println("List is Empty");
		}
		else {
			Enode t = root;
			
			while(t != null) {
				if(t.id == id) {
					return true;
				}
				 t = t.next;                  // 🔹 Move to next node
			}
		}
		return false;
	}
	//D. Update Employee by ID//search and over-write
	void updateEmployee(int id, String newName, double newSalary) {
		
		    if(root == null) {
		        System.out.println("List is Empty");
		        return;
		    }

		    Enode t = root;

		    while(t != null) {                // Traverse full list
		        if(t.id == id) {              // Employee found
		            t.name = newName;         // Update name
		            t.salary = newSalary;     // Update salary
		            System.out.println("Employee Updated Successfully!");
		            return;
		        }
		        t = t.next;                   // Move to next node
		    }

		    System.out.println("Employee with ID " + id + " not found.");
	}

	
	//E. Delete Employee by ID//delete element
	void deleteEmployee(int id) {
	    if(root == null) {
	        System.out.println("List Empty..");
	        return;
	    }

	    // Case 1: delete first node
	    if(root.id == id) {
	        root = root.next;
	        System.out.println("Employee deleted successfully!");
	        return;
	    }

	    Enode t2 = root;        // trailing pointer
	    Enode t = root.next;    // current pointer

	    while(t != null) {
	        if(t.id == id) {    // match found
	            t2.next = t.next;   // bypass t node
	            System.out.println("Employee deleted successfully!");
	            return;
	        }
	        t2 = t;            // move trail to current
	        t = t.next;        // move current ahead
	    }

	    System.out.println("Employee with ID " + id + " not found.");
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    EmployeeManagement em = new EmployeeManagement();  // object of your class
	    int choice;

	    do {
	        System.out.println("\n===== Employee Management Menu =====");
	        System.out.println("1. Add Employee");
	        System.out.println("2. Display All Employees");
	        System.out.println("3. Search Employee by ID");
	        System.out.println("4. Update Employee by ID");
	        System.out.println("5. Delete Employee by ID");
	        System.out.println("0. Exit");
	        System.out.print("Enter your choice: ");
	        choice = sc.nextInt();

	        switch(choice) {
	            case 1:
	                System.out.print("Enter Employee ID: ");
	                int id = sc.nextInt();
	                sc.nextLine(); // consume leftover newline
	                System.out.print("Enter Employee Name: ");
	                String name = sc.nextLine();
	                System.out.print("Enter Employee Salary: ");
	                double sal = sc.nextDouble();
	                em.addEmployee(id, name, sal);
	                break;

	            case 2:
	                em.displayEmployees();
	                break;

	            case 3:
	                System.out.print("Enter Employee ID to search: ");
	                int sid = sc.nextInt();
	                if(em.searchEmployee(sid))
	                    System.out.println("Employee found.");
	                else
	                    System.out.println("Employee not found.");
	                break;

	            case 4:
	                System.out.print("Enter Employee ID to update: ");
	                int uid = sc.nextInt();
	                sc.nextLine(); // consume newline
	                System.out.print("Enter NEW Name: ");
	                String newName = sc.nextLine();
	                System.out.print("Enter NEW Salary: ");
	                double newSal = sc.nextDouble();
	                em.updateEmployee(uid, newName, newSal);
	                break;

	            case 5:
	                System.out.print("Enter Employee ID to delete: ");
	                int did = sc.nextInt();
	                em.deleteEmployee(did);
	                break;

	            case 0:
	                System.out.println("Exiting Employee Management System...");
	                break;

	            default:
	                System.out.println("Invalid choice, please try again.");
	        }

	    } while(choice != 0);

	    sc.close();
	}


}

