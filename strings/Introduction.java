package strings;

public class Introduction {

	public static void main(String[] args) {
		// All basic concepts for string
		
		String str1 = "geeksforgeeks", str2 = "geeks", str3 = "geeky";
		
		System.out.println("str1 length: " + str1.length());
		
		System.out.println("Char at index 3: " + str1.charAt(3));
		
		System.out.println("Substring from 5: " + str1.substring(5));
		
		System.out.println("Substring from 5 and end at 7: " + str1.substring(5, 8));
		
		System.out.println("Does str1 contains str2: " + str1.contains(str2));
		
		System.out.println("Index of str2 in str1: " + str1.indexOf(str2));
		
		System.out.println("Index of str2 in str1 after index 0: " + str1.indexOf(str2, 1));

		System.out.println("Last Index of str2 in str1: " + str1.lastIndexOf(str2));
		
		System.out.println("Index of str2 in str3: " + str1.indexOf(str3));
		
		System.out.println("Compare str1 with str2: " + str1.compareTo(str2));
		
		System.out.println("Compare str1 with str3: " + str1.compareTo(str3));
		
		System.out.println("Compare str1 with geekz: " + str1.equals("geekz"));
		
		char[] c = str1.toCharArray();
		
		String s = new String(c);
		
		System.out.println("char array to string: " + s);
	}

}
