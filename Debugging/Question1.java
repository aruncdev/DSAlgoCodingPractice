package WFM;

import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		int[] songs = new int[] {10, 100, 30, 20};
		int target = 50;
		int[] result = new int[] {-1, -1};

		HashMap<Integer, int[]> map = new HashMap<>();

		for(int i = 0; i < songs.length; i++) {
			int song = songs[i];
			int required = target - song;

			if(!map.containsKey(song)) {
				map.put(song, new int[] {i, -1});
			}

			if(map.containsKey(song) && map.get(song)[1] == -1 && i != map.get(song)[0]) {
				map.put(song, new int[] {map.get(song)[0], i});
			}

			if(map.containsKey(required) && map.get(required)[0] != i) {
				if(Math.max(song, required) > Math.max(result[0], result[1])) {
					result[0] = song;
					result[1] = required;
				}
			}
		}

		if(result[0] == result[1]){
			System.out.println(map.get(result[0])[0] + " " + map.get(result[1])[1]);
		} else {
			System.out.println(map.get(result[0])[0] + " " + map.get(result[1])[0]);
		}
	}
}
