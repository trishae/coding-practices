package finalcodingsample;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		String[] L = new String[] {"a.b@example.com", "x@example.com", "x@exa.mple.com", "ab+1@example.com", "y@example.com", "y@example.com", "y@example.com"};
		
		System.out.println(method(L));
	}
	
	public static int method(String[] L) {

        // create empty array of corrected emails
        String[] correctedEmails = new String[L.length];
        
        // for each element
        for (int i = 0; i < L.length; i++) {
            
            // split local name and domain name
            String[] names = L[i].split("@");
            
            // remove any . in local
            names[0] = names[0].replace(".", "");
            
            // check for + in local
            if (names[0].contains("+")) {
                String[] subStrings = names[0].split("\\+");
                names[0] = subStrings[0];
            }
            
            correctedEmails[i] = names[0] + "@" + names[1];
            System.out.println("original: "+L[i]+" / corrected: "+correctedEmails[i]);
        }
        
        // get unique members
        Set<String> uniqueEmails = new HashSet<String>(Arrays.asList(correctedEmails));
        
        System.out.println("Number of unique emails after correction: "+uniqueEmails.size());
        
        // count groups that have more than one member belonging to a unique email
        int groupsMoreThanOne = 0;
        
        int count = 0;
        System.out.println("\n");
       
        for (String emailToMatch : uniqueEmails)
        {
        	for (String email : correctedEmails) {
        		if (email.equals(emailToMatch)) {
        			count++;
        		}
        	}
        	
        	if (count > 1)
        		groupsMoreThanOne++;
        	
        	count = 0;
        }
        
        return groupsMoreThanOne;
	}
}
