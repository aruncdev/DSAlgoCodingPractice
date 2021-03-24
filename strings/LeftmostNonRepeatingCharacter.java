package strings;

import java.util.Arrays;

public class LeftmostNonRepeatingCharacter {

	public static void main(String[] args) {
		//if -1 not visited even once. If -2 visited multiple times. Anything else index of distinct char. 
		String str = "adccbdab";
		int[] status = new int[26];
		
		Arrays.fill(status, -1);
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(status[c - 'a'] == -1) {
				status[c- 'a'] = i;
			}
			else if(status[c - 'a'] >= 0) {
				status[c - 'a'] = -2;
			}
		}
		boolean found = false;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(status[c - 'a'] >= 0) {
				found = true;
				System.out.println("Leftmost repeating character: " + c);
				break;
			}
		}
		
		if(!found) {
			System.out.println("All are repeating characters");
		}
	}

}
