package matrix;

import java.util.Arrays;

public class rotateAMatrix {

	public static void main(String[] args) {
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
		
		//transpose
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(i < j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        //swap columns
        for(int i = 0; i < matrix.length; i ++){
            for(int j = 0; j < matrix.length / 2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
        
		System.out.println("Rotate clockwise: ");
		for(int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

}
