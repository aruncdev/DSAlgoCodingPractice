package hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		map.put(0, 0);
		map.put(1, 1);
		map.put(2, 2);
		
		for(Map.Entry<Integer, Integer> temp: map.entrySet()) {
			System.out.println("Key: " + temp.getKey() + " Value: " + temp.getValue());
		}
	}

}
