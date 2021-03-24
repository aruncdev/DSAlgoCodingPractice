package strings;

public class ReverseWordsInString {

	public static void main(String[] args) {
		//idea is to reverse letters in each word then reverse the whole string
		//Ex: In "I Love Coding" after reversing the each word we get "gnidoC evoL I" after reversing 
		//this string we get "Coding Love I".
		
		String str = "I Love Coding";
		int start = 0;
		char[] c = str.toCharArray();
		
		System.out.println("Intial String: " + str);
		
		for(int i = 0; i < str.length(); i++) {
			
			if(c[i] == ' ') {
				reverse(c, start, i - 1);
				start = i + 1;
			}
		}
		reverse(c, start, str.length() - 1);
		
		System.out.println("After reversing: " + new String(c));
		
		reverse(c, 0, str.length() - 1);
		
		System.out.println("Result: " + new String(c));

	}
	
	public static void reverse(char[] c, int start, int end) {
		while(start <= end) {
			char temp = c[start];
			c[start++] = c[end];
			c[end--] = temp;
		}
	}
}
