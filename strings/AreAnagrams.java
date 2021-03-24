package strings;

public class AreAnagrams {

	public static void main(String[] args) {
		String str1 = "geeks", str2 = "seekg", str3 = "geeksforgeeks", str4 = "keees";
		
		if(checkAnagram(str1, str2)) {
			System.out.println(str1 + " " + str2 + " are anagrams");
		}
		else {
			System.out.println(str1 + " " + str2 + " are not anagrams");
		}
		
		if(checkAnagram(str1, str3)) {
			System.out.println(str1 + " " + str3 + " are anagrams");
		}
		else {
			System.out.println(str1 + " " + str3 + " are not anagrams");
		}

		if(checkAnagram(str1, str4)) {
			System.out.println(str1 + " " + str4 + " are anagrams");
		}
		else {
			System.out.println(str1 + " " + str4 + " are not anagrams");
		}
	}
	
	public static boolean checkAnagram(String str1, String str2) {
		//check for the frequency of characters. For character from str1 increase the frequency and for
		//characters for str2 decrease the frequency. If atlast everything is 0 then they are 
		//anagrams else they are not anagrams. Additionally check for length
		if(str1.length() != str2.length()) {
			return false;
		}
		
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		int[] check = new int[26];
		
		for(int i = 0; i < str1.length(); i++) {
			check[c1[i] - 'a']++;
			check[c2[i] - 'a']--;
		}
		
		for(int i = 0; i < 26; i ++) {
			if(check[i] != 0) {
				return false;
			}
		}
		
		return true;
	}

}
