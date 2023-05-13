package com.codingdojo.sll;

public class ListTester {
	public static void main(String[] args) { 
	        SinglyLinkedList sll = new SinglyLinkedList();
	        
	        sll.add(3);
	        sll.add(4);
	        sll.add(10);
	        sll.add(5);
	        sll.add(15);
	        sll.add(2);
	        
//	        sll.printValues();
	        
//	        sll.remove();
//	        sll.remove();
//	        sll.remove();
//	        sll.remove();
//	        sll.remove();
//	        sll.remove();
	        
	        sll.printValues();
	        
	        System.out.println("Find node 3: " + sll.find(3));
	        System.out.println("Find node 10: " + sll.find(10));
	        System.out.println("Find node 7: " + sll.find(7));
	        
	        sll.removeAt(6);
	        sll.printValues();
	}
}
