package strings;

public class LeftmostRepeatingCharacter {

	public static void main(String[] args) {
		//traverse through right side and take a boolean array to check if character is already visited or not.
		//if it is visited change to visited and if it is already visited then update the res. If res is -1
		// then there is no repeating character.
		String str = "abcd";
		boolean[] visited = new boolean[26];
		int res = -1;
		
		for(int i = str.length() - 1; i >= 0; i--) {
			char temp = str.charAt(i);
			if(visited[temp - 'a']) {
				res = i;
			}
			else {
				visited[temp - 'a'] = true;
			}
		}
		
		if(res != -1) {
			System.out.println("Leftmost repeating character is: " + str.charAt(res));
		}
		else {
			System.out.println("All are distinct characters");
		}
	}

}
