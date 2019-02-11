package chapter3;

public class Node {
	
	// members
	Node next = null;
	String disk;
	int length;
	
	// constructor
	public Node(String disk) {
		this.disk = disk;
		this.length = getLength(disk);
	}
	
	// methods
	public void appendToTail(String data) {
		Node end = new Node(data);
		Node n = this;
		
		// navigate to the final node
		while (n.next != null) {
			n = n.next;
		}
		
		// append new node to tail
		n.next = end;
	}
	
	public Node deleteNode(Node head, String data) {
		Node n = head;
		
		if (n.disk.equals(data)) {
			return head.next;
		}
		
		while (n.next != null) {
			if (n.next.disk.equals(data)) {
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
	
	public void printList(Node head) {
		while (head.next != null) {
			System.out.println(head.next.disk);
			head = head.next;
		}
	}
	
	private int getLength(String disk) {
		disk = disk.replace(" ", "");
		return disk.length();
	}
}
