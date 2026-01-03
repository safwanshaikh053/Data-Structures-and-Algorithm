package Linked_List_Examples;

import java.util.LinkedList;
import java.util.Stack;

public class ReversedLinkedList {

		public static void main(String[] arg) {
			 LinkedList<Integer>list=new LinkedList<>();
			 list.add(10);
			 list.add(20);
			 list.add(30);
			 list.add(40);
			 System.out.println("LIST HAS "+ list);
			 Stack<Integer> stack=new Stack<>();
			 while(!list.isEmpty()) {
				 stack.push(list.remove());
			 }
			 while(!stack.empty()) {
				 list.add(stack.pop());
			 }
			 System.out.println("=================");
			 System.out.println(list);
		}

	}

