package CC150;

public class p9_7 {
	public void paintfill(int[][] paint, int row, int col, int color){
		int color0 = paint[row][col];
		helper(paint, row, col, color, color0);
	}
	
	private void helper(int[][] paint, int row, int col, int color, int color0){
		if (paint[row][col] == color) {
			return;
		} else if (paint[row][col] == color0){
			paint[row][col] = color;
			if( 0 <= row+1 && row+1 < paint.length) helper(paint, row+1, col, color, color0);
			if( 0 <= row-1 && row-1 < paint.length) helper(paint, row-1, col, color, color0);
			if( 0 <=col+1 && col+1 < paint[0].length) helper(paint, row, col+1, color, color0);
			if( 0 <= col-1 && col-1 < paint[0].length) helper(paint, row, col-1, color, color0);
		}
	}
}
