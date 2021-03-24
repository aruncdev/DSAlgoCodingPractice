package strings;

public class CheckIfStringsAreRotated {

	public static void main(String[] args) {
		String str1 = "ABCD", str2 = "CDAB";
		
		str1 += str1;
		
		if(str1.equals(str2) && str1.indexOf(str2) >= 0) {
			System.out.println("Yes, strings are rotated.");
		}
		else {
			System.out.println("No, strings are not rotated.");
		}
	}
}