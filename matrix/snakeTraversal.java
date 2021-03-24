package matrix;

public class snakeTraversal {

	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		
		int val = 1;
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = val++;
			}
		}

		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			i++;
			if(i < matrix.length) {
				for(int k = matrix[i].length - 1; k >= 0; k--) {
					System.out.print(matrix[i][k] + " ");
				}
			}
		}
	}

}
