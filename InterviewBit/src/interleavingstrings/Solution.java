package interleavingstrings;

public class Solution {
	public static void main(String[] args) {
	
		String A = "eZCHXr0CgsB4O3TCDlitYI7kH38rEElI";
		String B = "UhSQsB6CWAHE6zzphz5BIAHqSWIY24D";
		String C = "eUZCHhXr0SQsCgsB4O3B6TCWCDlAitYIHE7k6H3z8zrphz5EEBlIIAHqSWIY24D";
		
		System.out.println("-------------------");
		System.out.println("RETURN: "+isInterleave(A, B, C));
	}
	
	public static int isInterleave(String A, String B, String C) {
        
        // Note: String C is string to check
        
        // define indices
        int A_i = 0;
        int B_i = 0;
        int C_i = 0;
        
        // set flag
        // boolean notInterleavable = false;
        boolean stringA_hasRemaining = true;
        boolean stringB_hasRemaining = true;
        
        // Check strings
        // while (!notInterleavable && C_i < C.length()) {
        while (C_i < C.length()) {
        	System.out.println("Loop entered...");
        	System.out.println("    C index: "+C_i+" / C char: "+C.charAt(C_i));

        	if (stringA_hasRemaining && C.charAt(C_i) == A.charAt(A_i)) {
        		System.out.println("    First condition met:");
                	
               	System.out.println("        A index: "+A_i+" / A char: "+A.charAt(A_i));
                	
               	C_i++;
               	A_i++;
               	
               	if (A_i == A.length())
               		stringA_hasRemaining = false;
                    
               	continue;
        	} else if (stringB_hasRemaining && C.charAt(C_i) == B.charAt(B_i)) {
        		System.out.println("    Second condition met:");
        		System.out.println("        B index: "+B_i+" / B char: "+B.charAt(B_i));
                	
        		C_i++;
        		B_i++;
                    
        		if (B_i == B.length())
               		stringB_hasRemaining = false;
        		
        		continue;
        	} else {
        		return 0;
        	}
        }
        
        return 1;
    }
}
