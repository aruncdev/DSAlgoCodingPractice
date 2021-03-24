package strings;

public class RankOfString {
	
	static int[] factorial;

	public static void main(String[] args) {
		//this works only if the string has all distinct characters 
		String str = "zyx";
		
		factorial = new int[str.length() + 1];
		
		factorialTillN();
		
		int mul = factorial[factorial.length - 1];
		
		int[] count = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			count[c - 'a']++;
		}
		
		for(int i = 1; i < 26; i++) {
			count[i] += count[i - 1];
		}
		
//		System.out.println("count: " + Arrays.toString(count));
		int rank = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			mul = mul / (str.length() - i);
			if(c != 'a') {
				rank = rank + (count[c - 'a' - 1] * mul);
				for(int j = c - 'a'; j < 26; j++) {
					count[j]--;
				}
			}
			else {
				for(int j = c - 'a'; j < 26; j++) {
					count[j]--;
				}
			}
		}
		
		System.out.println("Rank of string " + str + " is: " + (rank + 1));
		
	}
	
	public static void factorialTillN() {
		factorial[0] = 1;
		factorial[1] = 1;
		
		for(int i = 2; i < factorial.length; i++) {
			factorial[i] = factorial[i - 1] * i;
		}
		
//		System.out.println(Arrays.toString(factorial));
	}
}