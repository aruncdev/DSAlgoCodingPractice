package searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
		int search = -1, start = 0, end = arr.length - 1;
		boolean found = false;
		
		while(start <= end) {
			int mid  = start + (end - start) / 2;
			
			if(arr[mid] == search) {
				System.out.println("Index: " + mid);
				found = true;
				break;
			}
			else if(arr[mid] > search) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		
		if(!found) {
			System.out.println("Given number " + search + " is not in array");
		}
	}

}
