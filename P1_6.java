package CC150;

public class P1_6 {
	public void rotate(int[][] matrix, int n){
		for (int layer=0; layer< n/2; layer++){
			int first = layer;
			int last = n-1-layer;
			
			for (int i=first; i<last; i++){
				//index from the first to current i
				int offset = i - first;
				int temp = matrix[first][i];
				
				//left -> top
				matrix[first][i] = matrix[last - offset][first];
				
				//bottom -> left
				matrix[last - offset][first] = matrix[last][last - offset];
				
				//right -> bottom
				matrix[last][last - offset] = matrix[first + offset][last];
				
				//top -> right
				matrix[first + offset][last] = temp;  // or matrix[i][last] = temp same
			}
		}
	}
}
