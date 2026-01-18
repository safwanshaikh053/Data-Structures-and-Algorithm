package Tree_Examples;

import Linked_List_Examples.DNode;

public class Node {

	int data;
	Node left, right;
	
	Node(int data){
		this.data = data;
		this.right = this.left = null;
	}
}
