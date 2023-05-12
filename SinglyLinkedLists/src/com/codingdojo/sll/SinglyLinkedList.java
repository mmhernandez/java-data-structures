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
		if(runner.next == null) {
			runner = null;
		} else {			
			while(runner.next != null) {
				runner = runner.next;
			}
			runner = null;
		}
	}
	
	public void printValues() {
		Node runner = this.head;
		while(runner != null) {
			System.out.println(runner.data);
			runner = runner.next;
		}
	}

}
