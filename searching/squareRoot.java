package searching;

public class squareRoot {

	public static void main(String[] args) {
		int n = 17;
		
		System.out.println(squareRootVal(n));

	}

	public static long squareRootVal(int n) {
		if(n < 2) {
			return n;
		}
		int start = 1, end = n, mid = 0;
		
		while(start <= end) {
			mid = start + (end - start) / 2;
			long square = mid * mid;
			
			if(square == n) {
				return mid;
			}
			else if(square > n) {
				end = mid - 1;
				square = (mid - 1) * (mid - 1);
				if(square < n) {
					return mid - 1;
				}
			}
			else {
				start = mid;
				square = (mid + 1) * (mid + 1);
				if(square > n) {
					return mid ;
				}
			}
		}
		
		return mid;
	}
}
