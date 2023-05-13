package com.codingdojo.sll;

public class SinglyLinkedList {
	
	public Node head;
	
	public SinglyLinkedList() {
		this.head = null;
	}
	
	public void add(int value) {
		Node newNode = new Node(value);
		Node runner = this.head;
		
		if(runner == null) {
			this.head = newNode;
		} else {
			while(runner.next != null) {
				runner = runner.next;	
			}
			runner.next = newNode;
		}
	}
	
	public void remove() {
		//removes node from the end of the list
		Node runner = this.head;
//		System.out.println(runner.data);
		if(runner.next == null) {
			this.head = null;
		} else {
			while(runner.next.next != null) {
				runner = runner.next;
			}
			runner.next = null;
		}
	}
	
	public void printValues() {
		Node runner = this.head;
		if(runner == null) {
			System.out.println("EMPTY LIST");
		}
		else {			
			while(runner != null) {
				System.out.println(runner.data);
				runner = runner.next;
			}
		}
	}
	
	public Node find(int data) {
		Node runner = this.head;
		while(runner != null) {
			if(runner.data == data) {
				return runner;
			}
			runner = runner.next;
		}
		return null;
	}
	
	public void removeAt(int indexPosition) {
		int counter = 0;
		Node runner = this.head;
		
		if(indexPosition == counter) {
			this.head = runner.next;
		}
		else {			
			while(counter < indexPosition-1) {
				runner = runner.next;
				counter++;
			}
			if(runner.next == null) {
				System.out.println("Index position too large for list size");
			} else {				
				runner.next = runner.next.next;
			}
		}
	}

}
