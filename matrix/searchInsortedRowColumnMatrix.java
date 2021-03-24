package matrix;

import java.util.Arrays;

public class searchInsortedRowColumnMatrix {

	public static void main(String[] args) {
		int[][] matrix = new int[][] {{10, 20, 30}, {15, 25, 35}, {20, 30, 40}};
		int searchElement = 50, row = 0, column = matrix[0].length - 1;
		boolean found = false;
		System.out.println("Input: ");
		for(int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		while(row < matrix.length && column >= 0) {
			if(matrix[row][column] == searchElement) {
				System.out.println("Row: " + (row + 1) + " column: " +  (column + 1));
				found = true;
				break;
			}
			else if(matrix[row][column] < searchElement) {
				row++;
			}
			else if(matrix[row][column] > searchElement) {
				column--;
			}
		}
		
		if(!found) {
			System.out.println("Element not found");
		}
	}

}
