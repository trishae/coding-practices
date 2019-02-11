package chapter3;

/**
 * Tower of Hanoi - 3 towers
 * @author trishaechual
 *
 */
public class Q3_4 {
	public static void main(String[] args) {
		
		// initialize data in first stack		
		Node a = new Node("===========");
		Node b = new Node(" ========= ");
		Node c = new Node("  =======  ");
		Node d = new Node("   =====   ");
		Node e = new Node("    ===    ");
		Node f = new Node("     =     ");
		
		// create first tower
		Tower tower1 = new Tower();
		tower1.push(f);
		tower1.push(e);
		tower1.push(d);
		tower1.push(c);
		tower1.push(b);
		tower1.push(a);
		
		// check
		System.out.println(tower1.peek().disk);
		System.out.println(tower1.getHeight());
		
		
		// create other two towers
		Stack tower2 = new Stack();
		Stack tower3 = new Stack(); // destination
		
		// solve
		//solve(tower1, tower2, tower3);
	}
	
	public static void solve(Stack tower1, Stack tower2, Stack tower3) {
		
	}
}
