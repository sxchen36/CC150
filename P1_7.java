package CC150;

import java.util.HashSet;
import java.util.Set;

public class P1_7 {
	
	/* Using set to track whether a column should be set to 0 is too expensive O(n*N)*/
//	public void setZero(int[][] matrix, int m, int n) {
//		Set<Integer> set = new HashSet<Integer>();
//		for(int i=0; i<m; i++){
//			for(int j=0; j<n; j++){
//				if (matrix[i][j] == 0) {
//					set.add(j);
//					int line = 0;
//					int col = 0;
//					// set prev in the same column
//					while (line<i){
//						matrix[line][j] = 0;
//						line++;
//					}
//					// set the whole line
//					while (col<n) {
//						matrix[i][col] = 0;
//						col++;
//					}
//					// end of this line
//					j = n;
//				} else if (set.contains(j)) {
//					matrix[i][j] = 0;
//				}
//			}
//		}
//	}
	
	/* Use two arrays to track the row index and the col index need to be saved as 0*/
//	public void setZero(int[][] matrix, int m, int n) {
//		boolean[] row = new boolean[m];
//		boolean[] col = new boolean[n];
//		for (int i=0; i<m; i++){
//			for (int j=0; j<n; j++){
//				if(matrix[i][j] == 0){
//					row[i] = true;
//					col[j] = true;
//				}
//			}
//		}
//		// Set row to zero
//		for (int i=0; i<m; i++){
//			if(row[i]) {
//				for (int j=0; j<n; j++){
//					matrix[i][j]=0;
//				}
//			}
//		}
//		// Set col to zero
//		for (int j=0; j<n; j++){
//			if(col[j]) {
//				for (int i=0; i<m; i++){
//					matrix[i][j]=0;
//				}
//			}
//		}
//	}
	
	/* Use bit vector to track the row index and the col index need to be saved as 0*/
	/* Space complexity O(N)*/
//	public void setZero(int[][] matrix, int m, int n) {
//		int row = 0;
//		int col = 0;
//		for (int i=0; i<m; i++){
//			for (int j=0; j<n; j++){
//				if(matrix[i][j] == 0){
//					row |= 1<<i;
//					col |= 1<<j;
//				}
//			}
//		}
//		// Set row to zero
//		for (int i=0; i<m; i++){
//			if((row & (1<<i)) > 0) {
//				for (int j=0; j<n; j++){
//					matrix[i][j]=0;
//				}
//			}
//		}
//		// Set col to zero
//		for (int j=0; j<n; j++){
//			if(((col>>j) & 1) > 0) {
//				for (int i=0; i<m; i++){
//					matrix[i][j]=0;
//				}
//			}
//		}
//	}
	
	/* reduce space to O(1) by using first row and col*/
	public void setZero(int[][] matrix, int m, int n) {
		boolean null1st = false;
		if (matrix[0][0] == 0) null1st = true;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
	}
		// Set row to zero
		for (int i=1; i<m; i++){
			if(matrix[i][0] == 0) {
				for (int j=0; j<n; j++){
					matrix[i][j]=0;
				}
			}
		}
		// Set col to zero
		for (int j=1; j<n; j++){
			if(matrix[0][j] == 0) {
				for (int i=0; i<m; i++){
					matrix[i][j]=0;
				}
			}
		}
		
		if(null1st){
			for(int i=0; i<m; i++){
				matrix[i][0]=0;
			}
			for(int j=0; j<n; j++){
				matrix[0][j]=0;
			}
		}
	}
	
}
