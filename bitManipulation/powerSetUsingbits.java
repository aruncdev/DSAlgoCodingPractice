package bitManipulation;

import java.util.ArrayList;
import java.util.List;

public class powerSetUsingbits {

	public static void main(String[] args) {
		char[] c = new char[] {'a', 'b', 'c'};
		int len = c.length;
		double possible = Math.pow(2, len);
		int counter = 0;
		
		List<String> result = new ArrayList<>();
		
		for(counter = 0; counter < possible; counter++) {
			String temp = "";
			for(int j = 0; j < len; j++) {
				if((counter & (1 << j)) > 0) {
					temp += c[j];
				}
			}
			result.add(temp);
		}

		System.out.print(result);
	}

}
