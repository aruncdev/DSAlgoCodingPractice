package WFM;

import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		String[] foreground = new String[] {"2|7", "3|14"};
		String[] background = new String[] {"2|10", "3|14"};
		int target = 16, index = 0;
		int[] foreArr = new int[foreground.length];
		int[] backArr = new int[background.length];

		HashMap<Integer, List<Integer>> foreMap = new HashMap<>();
		HashMap<Integer, List<Integer>> backMap = new HashMap<>();

		for(String temp: foreground) {
			String[] pair = temp.split("\\|");
			int key = Integer.parseInt(pair[1]);
			int values = Integer.parseInt(pair[0]);
			if(!foreMap.containsKey(key)) {
				foreMap.put(key, new ArrayList<>());
			}
			foreMap.get(key).add(values);
			foreArr[index++] = Integer.parseInt(pair[1]);
		}

		index = 0;

		for(String temp: background) {
			String[] pair = temp.split("\\|");
			int key = Integer.parseInt(pair[1]);
			int values = Integer.parseInt(pair[0]);
			if(!backMap.containsKey(key)) {
				backMap.put(key, new ArrayList<>());
			}
			backMap.get(key).add(values);
			backArr[index++] = Integer.parseInt(pair[1]);
		}

		Arrays.sort(foreArr);
		Arrays.sort(backArr);

		int foreStart = 0, backEnd = backArr.length - 1, curMax = -1;
		List<String> result = new ArrayList<>();

		while(foreStart < foreArr.length && backEnd >= 0) {
			int curr = foreArr[foreStart] + backArr[backEnd];
			if(curr <= target) {
				if(curr > curMax) {
					result = new ArrayList<>();
					curMax = curr;
					result.add(foreArr[foreStart] + "," + backArr[backEnd]);
				} else if(curr == curMax) {
					result.add(foreArr[foreStart] + "," + backArr[backEnd]);
				}
				foreStart++;
			} else {
				backEnd--;
			}
		}

		System.out.println(result);
	}
}
