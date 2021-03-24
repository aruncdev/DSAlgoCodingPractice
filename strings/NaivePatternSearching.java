package strings;

public class NaivePatternSearching {

	public static void main(String[] args) {
		//naiveApproach1 - Brute force works even if the pattern have all distinct or same characters - O(N^2)
		//naiveApproach2 - works only when the pattern have all distinct characters - O(N)
		String str = "ABBABABCD", pattern = "BA";
		
//		naiveApproach1(str, pattern);
		naiveApproach2(str, pattern);
	}
	
	public static void naiveApproach1(String str, String pattern) {
		int i = 0, j = 0;
		for(i = 0; i < str.length(); i++) {
			for(j = 0; j < pattern.length(); j++) {
				if(str.charAt(i + j) != pattern.charAt(j)) {
					break;
				}
			}
			if(j == pattern.length()) {
				System.out.print(i + " ");
			}
		}
	}

	public static void naiveApproach2(String str, String pattern) {
		int i, j;
		
		for(i = 0; i < str.length();) {
			for(j = 0; j < pattern.length(); j++) {
				if(str.charAt(i + j) != pattern.charAt(j))
					break;
			}
			if(j == 0)
				i++;
			else if(j == pattern.length()) {
				System.out.print(i+" ");
				i += j;
			}
			else
				i += j;
		}
	}
}
