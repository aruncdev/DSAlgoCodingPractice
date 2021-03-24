package practice;

public class DiverseTeams {

	public static void main(String[] args) {
		int f = 2, b = 2;
		
		if(f == 0 || b == 0) {
			System.out.println("0 teams are possible");
		}
		else {
			System.out.println(f * b * (b + f - 2) / 2);
		}
	}
	
}
