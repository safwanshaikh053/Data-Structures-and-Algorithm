package Linked_List_Examples;

public class Snode {

	int rollNo;
	String name;
	
	String gender;
	int age;
	
	Snode next;

	public Snode(int rollNo, String name, String gender, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.next = next;
	}
	
	void print_Snode() {
		System.out.print("\nRoll no : " + rollNo + "\tName:"+name+"\tGender:"+gender+"\tAge:"+age);
	}
}
