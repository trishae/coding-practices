package chapter3;

public class Stack {
	Node top;
	int height;
	
	Stack() {
		this.height = 0;
	}
	
	Node pop() {
		if (top != null) {
			Node item = top;
			top = top.next;
			this.height--;
			return item;
		}
		return null;
	}
	
	void push(Node item) {
		//Node t = new Node(item);
		item.next = top;
		top = item;
		this.height++;
	}
	
	Node peek() {
		return top;
	}
	
	int getHeight() {
		return this.height;
	}
}
