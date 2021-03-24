package Debugging;

public class LCS {
//Longest Common SubSequence
	public static void main(String[] args) {
		String X = "abcdgh", Y = "abedfghr";
		int n = X.length(), m = Y.length();
		
		int[][] dp = new int[n + 1][m + 1];
		
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < m + 1; j++) {
				if(X.charAt(i - 1) == Y.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		
		System.out.print("length of longest common subsequence: " + dp[n][m] + " and the string is: ");
		
		//printing the LCS:
		
		String result = "";
		int i = n, j = m;
		
		while(i != 0 && j != 0) {
			if(X.charAt(i - 1) == Y.charAt(j - 1)) {
				result = X.charAt(i - 1) + result;
				i--;
				j--;
			} else {
				if(dp[i - 1][j] > dp[i][j - 1]) {
					i--;
				} else {
					j--;
				}
			}
		}
		
		System.out.println(result);
	}

	
}