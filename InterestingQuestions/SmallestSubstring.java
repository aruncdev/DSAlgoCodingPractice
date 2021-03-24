package Debugging;

import java.util.*;

public class SmallestSubstring {

	public static void main(String[] args) {
		char[] arr = new char[] {'A'};
		String str = "A";
		
		System.out.println(getShortestUniqueSubstring(arr, str));
	}
	
	static String getShortestUniqueSubstring(char[] arr, String str) {
	    int slow = 0, fast = 0, min = Integer.MAX_VALUE;
	    String result = "";
	    HashSet<Character> all = new HashSet<>();
	    
	    for(char c: arr){
	      all.add(c);
	    }
	    
	    HashMap<Character, Integer> map = new HashMap<>();
	    
	    while( slow <= fast && fast < str.length()) {
	      if(all.size() == map.size()) {
	        min = Math.min(min, fast - slow + 1);
	        if(result.length() == 0 || fast - slow + 1 < result.length()){
	          System.out.println(slow + " "  + fast);
	          result = str.substring(slow, fast);
	        }
	        char temp = str.charAt(slow);
	        map.put(temp, map.getOrDefault(temp, 0) - 1);
	        if(map.get(temp) == 0) {
	          map.remove(temp);
	        }
	        slow++;
	      } else {
	        char temp = str.charAt(fast);
	        if(fast + 1 < str.length()) {
	          fast++;
	        } else {
	          slow++;
	        }
	        if(all.contains(temp)){
	          map.put(temp, map.getOrDefault(temp, 0) + 1);
	        }
	      }
	    }
	    
	    return result;
	    
	  }

}
