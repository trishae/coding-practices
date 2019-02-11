package chapter1;

public class Q1_5 {
	public static void main(String[] args) {
		String S = "aaaabbbbbbbbeejjseessss";
		System.out.println(findCount(S));
	}
	
	public static String findCount(String originalString) {
		String newString = "";
		int count = 1;
		
		// iterate through length of string
		for (int i = 0; i < originalString.length()-1; i++) {
			// print character if first letter
			if (count == 1)
				newString = newString + originalString.charAt(i);
			
			// if character is repeated, start counting; else print number of repetitions and restart
			if (originalString.charAt(i) == originalString.charAt(i+1)) {
				count++;
			} else if (originalString.charAt(i) != originalString.charAt(i+1)) {
				newString = newString + Integer.toString(count);
				count = 1;
			}
			
			// check if final character
			if (i == originalString.length()-2)
				newString = newString + Integer.toString(count);
		}
		
		return newString;
	}
}
