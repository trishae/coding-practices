package gasstation;

public class Solution {

	public static void main(String[] args) {
		
		int[] gas = new int[] {959, 329, 987, 951};
		int[] cost = new int[] {862, 783, 134, 441};
		
		System.out.println(canCompleteCircuit(gas, cost));
	}
	
	public static int canCompleteCircuit(int[] A, int[] B) {
		// A is gas
        // B is cost
        
        boolean isEmptyTank;
        int currentTank = 0;
        
        int start = 0, count = 0;
        int i;
        
        // try each index first to determine starting point
        while(start < A.length) {
            
            i = start;
            
            isEmptyTank = false;
            
            
            // try this route of gas stations
            while(!isEmptyTank && count <= A.length) {
                currentTank = currentTank + A[i];
                // if cost of gas is larger than amount, determine new starting point
                if (B[i] > currentTank) {
                    isEmptyTank = true;
                    start++;
                    currentTank = 0;
                    count = 0;
                } else {
                    currentTank = currentTank-B[i];
                    i++;
                    count++;
                    
                    if (i == A.length)
                        i = 0; // restart
                    
                    if (count == A.length)
                        return start;
                }
            }
        }
        
        return -1;
    }
}
