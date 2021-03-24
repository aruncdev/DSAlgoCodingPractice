package Debugging;

public class LCSubString {
//Longest Common SubString
	public static void main(String[] args) {
		String X = "abcdefgih", Y = "abcefph";
		int n = X.length(), m = Y.length(), result = 0;
		
		int[][] dp = new int[n + 1][m + 1];

		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < m + 1; j++) {
				if(X.charAt(i- 1) == Y.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = 0;
				}
				result = Math.max(result, dp[i][j]);
			}
		}
		
		System.out.println("Length of longest Common Substring: " + result);
	}
}
