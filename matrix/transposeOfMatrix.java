package matrix;

import java.util.Arrays;

public class transposeOfMatrix {

	public static void main(String[] args) {
		//Here we are considering the square matrix to do inplace transfer. If a non square matrix need to use a additional space
		int[][] matrix = new int[3][3];
		int val = 1;
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = val++;
			}
		}
		
		System.out.println("Input: ");
		for(int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(i < j) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = temp;
				}
			}
		}
		
		System.out.println("Transpose Matrix: ");
		for(int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

}
