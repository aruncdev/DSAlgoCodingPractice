package Debugging;

import java.util.*;

public class LeetCode763 {

	public static void main(String[] args) {
		
		String S= "vhaagbqkaq";
		
		HashMap<Character, Integer> map = new HashMap<>();
        char[] c = S.toCharArray();
        
        for(int i = 0; i < c.length; i++){
            map.put(c[i], i);
        }
        
        
        
        int lastIndex = 0, sum = 0;
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < c.length; i++){
            int temp = map.get(c[i]);
            lastIndex = Math.max(lastIndex, temp);
            if(i == lastIndex) {
                System.out.println(c[i] + " " + temp + " " + lastIndex);
                result.add(lastIndex + 1 - sum);
                sum = lastIndex + 1;
                lastIndex++;
            } else {
                
            }
        }
        
        System.out.println( result);

	}

}
