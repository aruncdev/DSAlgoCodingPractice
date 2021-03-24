package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class spiralTraversal {

	public static void main(String[] args) {
		int[][] matrix = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {12, 14, 15, 16}};

		System.out.println("Input: ");
		for(int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		List<Integer> result = new ArrayList<Integer>();
        
        if(matrix.length == 0){
            //stop everything
        }
        
        int firstRow = 0, lastColumn = matrix[0].length - 1, lastRow = matrix.length - 1, firstColumn = 0;
        
        while(firstRow <= lastRow || firstColumn <= lastColumn){
            if(firstRow <= lastRow){
                for(int i = firstColumn; i <= lastColumn; i++){
                    result.add(matrix[firstRow][i]);
                }
                firstRow++;
            }
            if(lastColumn >= firstColumn){
                for(int i = firstRow; i <= lastRow; i++){
                    result.add(matrix[i][lastColumn]);
                }
                lastColumn--;
            }
            if(lastRow >= firstRow){
                for(int i = lastColumn; i >= firstColumn; i--){
                    result.add(matrix[lastRow][i]);
                }
                lastRow--;
            }
            if(firstColumn <= lastColumn){
                for(int i = lastRow; i >= firstRow; i--){
                    result.add(matrix[i][firstColumn]);
                }
                firstColumn++;
            }
        }
        System.out.println("Sprial traversal output: ");
        System.out.println(result);
	}

}
