package wordbreak;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
//		String nonSpaceString = "aababaaabaaababbbabbbaabababaaabbaabaabbabbaabbbbbbbabbbbabaaabaabaabbaaaaabbabaababbbabbbbbbaaaabbbaaaaaabaaaaaabbbbbbbabbbbbbbbaaabaaababbbaaaabaaaabaaaabbabbbabaabbabbabaaaabbabaaabbabbabbbabbabbaabbbabaabaabbbbbbbaabababbbbbbababbbaabaabbbabababbbbbaaaababbbabaaabaabbaababbbabbbbbaabbaaaaabbbbbaaaaaaaaaaaabbabbbabbaaabaaaaaabaabababaabaaaabaaabbbbbaaabbaabbababbabbbbaabaabaabaaaabbbaababbaabbbbbabaaababbabbbabbbbbabaababbbbbaabbbbabaabbabbababaaaabbbbabbbaaaabaabbbbaaaaababaaabaabbabaababbabbbababaaababbaabbbaaabaabbbaabbbbbbaaabaabbbbbabaaababaaabbbbbbaaaabababaaabbbbbbaabbaaabbbabaabbabababbabaabbaaabbaaabbaabbbbbababbaabbabbb";
//		String[] dictionary = new String[] {"baaaaaabba", "babbaababb", "abb", "bababaabab", "baaa", "ab", "ab", "bb", "abbaaaa", "bbababa", "bbbbbbab", "abbaaabba", "aaaabbab", "abaaab", "babab", "aabaaab", "aabaabbabb", "aa", "bb", "ab", "a", "a", "bbaaab", "aba", "ba", "bbabbaabab", "aaabbbbbb", "abbaaaabbb", "aabaabbaa", "bbba", "abbabbba", "abbbbabb", "bbaaba", "abbbbaab", "bba", "bbbbaabba", "ababbabaab", "baabba", "ababbaabb", "bbaab", "a", "bbba", "aaaa", "aaabbbabba", "bab", "baaaabaa", "ab", "aaabbaab", "bab", "aa", "ababababab", "aabbaaaba", "abbaaba", "bbaabaa"};
		
//		String nonSpaceString = "a";
//		String[] dictionary = new String[] {"aaa"};
		
//		String nonSpaceString = "myinterviewinterviewtrainer";
//		String[] dictionary = new String[] {"interview", "my", "trainer"};
		
//		String nonSpaceString = "abababababaaaabaabbbabbbabbababbb";
//		String[] dictionary = new String[] {"abbbabaa", "baabaaaab", "babaaaaaba", "b", "b", "bbaaaab", "aaabbb", "aabbbbbab", "abbb", "abaa", "aaababaab", "aabbabaa", "bab", "bbbbaabbb"};
		
		String nonSpaceString = "ababbba";
		String[] dictionary = new String[] {"bbba", "b", "aba"};
		

//		String nonSpaceString = "ababbba";
//		String[] dictionary = new String[] {"bbba", "b", "aba"};

		List<Integer> dup = new ArrayList<Integer>();
		
		System.out.println("FINAL RESULT: "+wordBreak(nonSpaceString, dictionary));
	}
	
	public static int wordBreak(String A, String[] B) {
		if(A==null||B==null) return 0;
        
        boolean[] dp=new boolean[A.length()+1];
        dp[0]=true;
        
        System.out.println("A: "+A);
        System.out.println("dp[0]: "+dp[0]);
        
        for(int i=1; i<A.length()+1; i++){
        	System.out.println("{ // outer ");
        	System.out.println("    i: "+i);
        	
            for(int j=0; j<i; j++){
            	System.out.println("    { // outer ");
            	System.out.println("        j: "+j);
            	System.out.println("        substring: "+A.substring(j,i));
                if(dp[j] && Arrays.asList(B).contains(A.substring(j,i))) { // Arrays.asList() takes long
                	System.out.println("        condition met...substring: "+A.substring(j,i));
                    dp[i]=true;
                    System.out.println("            ...continue");
                    continue;
                }
                System.out.println("    }  ");
            }
            System.out.println("dp["+i+"]: "+dp[i]);
            System.out.println("} \n");
        }
        
        if (dp[A.length()])
            return 1;
        else
             return 0;
	}

}
