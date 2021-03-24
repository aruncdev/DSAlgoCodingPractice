package strings;

import java.util.HashMap;

public class LongestSubStrWithDisChar {

	public static void main(String[] args) {
		String str = "abcabcbb";
		
		int start = 0, max = 1;
		
		HashMap<Character, Integer> map = new HashMap<>();
		map.put(str.charAt(0), 0);
		
		for(int i = 1; i < str.length(); i++) {
			char key = str.charAt(i);
			if(map.containsKey(key)) {
				int prev = map.get(key);
				
				if(prev < start) {
					
				}
				else {
					start =  prev + 1;
				}
				map.put(key, i);
			}
			else {
				map.put(key, i);
			}
			
			max = Math.max(max, i - start + 1);
		}
		
		System.out.println(max);

	}

}
