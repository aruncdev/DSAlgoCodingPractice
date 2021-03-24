package Debugging;

public class walmart {

	public static void main(String[] args) {
		int x = 1, y = 2;
		
		if(function(x, y)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
	
	public static boolean function(int x, int y) {
		return ((x & (1 << y)) != 0);
	}

}
