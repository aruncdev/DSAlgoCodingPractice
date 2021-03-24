package matrix;

import java.util.Arrays;

public class matrixMultiplication {

	public static void main(String[] args) {
		int[][] mat1 = new int[][] {{1, 2}, {3, 4}}, mat2 = new int[][] {{1, 2}, {3, 4}};

		int[][] result = new int[mat1.length][mat2[0].length];
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				int temp = 0;
				for(int k = 0; k < result[i].length ; k++) {
					temp += mat1[i][k] * mat2[k][j];
				}
				result[i][j] = temp;
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(Arrays.toString(result[i]));
		}
	}

}
