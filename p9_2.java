package CC150;

public class p9_2 {
	public int countWays(int x, int y){
		int[][] matrix = new int[x][y];
		// for () initialize matrix to -1
		return countHelper(x-1, y-1, matrix);
		
	}
	
	private int countHelper(int x, int y, int[][] matrix){
		if (x < 0 || y < 0) {
			return 0;// Out of bound
		}else if (x == 0 && y == 0){
			matrix[0][0] = 1;
			return matrix[0][0];// (0,0) return 1;
		} else if( matrix[x][y] > -1) { // already calculate 
			return matrix[x][y];
		}else {
			matrix[x][y] = countHelper(x-1, y, matrix) + countHelper(x, y-1, matrix);
			return matrix[x][y];
		}
	}
}
