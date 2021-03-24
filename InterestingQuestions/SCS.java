package Debugging;

public class SCS {
// Shortest Common Supersequence
	public static void main(String[] args) {
		String a = "aggtab", b = "gxtxayb";
		int n = a.length(), m = b.length();
		
		int[][] dp = new int[n + 1][m + 1];
		
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < m + 1; j++) {
				if(a.charAt(i - 1) == b.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		System.out.print("length of shortest subsequence is: " + (n + m - dp[n][m]) + " and the string is: ");
		
		int i = n, j = m;
		String result = "";
		
		while(i != 0 && j != 0) {
			if(a.charAt(i - 1) == b.charAt(j - 1)) {
				result = a.charAt(i - 1) + result;
				i--;
				j--;
			} else {
				if(dp[i][j - 1] > dp[i - 1][j]) {
					result = b.charAt(j - 1) + result;
					j--;
				} else {
					result = a.charAt(i - 1) + result;
					i--;
				}
			}
		}
		
		while(i != 0) {
			result = a.charAt(i - 1) + result;
			i--;
		}
		
		while(j != 0) {
			result = b.charAt(j - 1) + result;
			j--;
		}
		System.out.print(result);
	}

}
