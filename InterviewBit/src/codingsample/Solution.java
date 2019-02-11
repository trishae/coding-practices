package codingsample;

public class Solution {
	public static void main(String[] args) {
		String S = "2-4A0r7-4k";
		int k = 10;
		System.out.println(regroup(S, k));
	}
	
	public static String regroup(String S, int K) {
		
		// To upper case
		S = S.toUpperCase();
		
		// remove dashes
		S = S.replaceAll("-", "");
		
		// new output
		String newKey = "";
		
		int i = S.length()-1;
		int count = 0;
		
		while (i >= 0) {
			newKey = S.charAt(i) + newKey;
			count++;
			i--;
			
			if (count%K==0 && i > 0)
				newKey = "-" + newKey;
		}
		
		return newKey;
	}
}
