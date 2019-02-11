package chapter2;

public class Node {
	
	// members
	Node next = null;
	int data;
	
	// constructor
	public Node(int data) {
		this.data = data;
	}
	
	// methods
	public void appendToTail(int data) {
		Node end = new Node(data);
		Node n = this;
		
		// navigate to the final node
		while (n.next != null) {
			n = n.next;
		}
		
		// append new node to tail
		n.next = end;
	}
	
	public Node deleteNode(Node head, int data) {
		Node n = head;
		
		if (n.data == data) {
			return head.next;
		}
		
		while (n.next != null) {
			if (n.next.data == data) {
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
	
	public void printList(Node head) {
		while (head.next != null) {
			System.out.println(Integer.toString(head.next.data));
			head = head.next;
		}
	}
}
