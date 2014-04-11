package CC150;

import java.util.ArrayList;
import java.util.HashSet;


public class p9_9 {
	
	/* Wrong answer!
	 * Learned:
	 * 1. No need to build a new class map. each row/col only has one queen
	 *    so if we check row by row, just store int[] col to indicate index of col
	 *    for each row
	 *    Conclusion: for map, each row/col has only one, use one-dimension array
	 * 2. No need to return anything. if reach the final row and get the answer
	 *    just put it into the result arraylist and recurse; if not, just recurse back without
	 *    change the element in int[] col
	 * 
	 * 3. Check diagnals: the distance between rows equals distance between cols 
	 */
	
//	ArrayList<Grid[][]> collection = new ArrayList<Grid[][]>();
//	
//	public void eightQueen(int[][] map){
//		Grid[][] newMap = new Grid[map.length][map[0].length];
//		for (int i = 0; i < map.length; i++){
//			for (int j = 0; j<map[0].length; j++){
//				newMap[i][j].available = true;
//				newMap[i][j].queen = 0;
//			}
//		}
//	}
//	
//	class Grid {
//		boolean available;
//		int queen;
//	}
//	
//	private boolean queenHelper(Grid[][] map, int col){
//		// Reach the last column
//		boolean hasResult = false;
//		if(col == map[0].length-1){
//			for(int i=0; i<map.length; i++){
//				if(map[i][col].available) {
//					map[i][col].queen = 1;
//					hasResult = true;
//					
//					/*!!! Use Object.clone() !!! it generates a new object with same 
//					 * type and value but different address in heap~~
//					 * By this way, no need to set or reset map*/
//					
//					collection.add(map); //  this intention seems right
//				}
//			}
//			return hasResult;
//		}
//		
//		for (int i=0; i<map.length; i++) {
//			if(map[i][col].available) {
//				map[i][col].queen = 1;
//				resetMap(map, i, col);
//				if(queenHelper(map,col+1)) {
//					hasResult = true;
//				}
//				updoReset(map,i,col);
//				// Does the map turn back when recursion finished??? I guess no
//
//			}
//		}
//		return hasResult;
//	}	
	
	public void eightQueen(){
		Integer[] col = new Integer[8];
		ArrayList<Integer[]> result = new ArrayList<Integer[]>();
		helper(0,col,result);
	}
	
	private void helper(int row, Integer[] col, ArrayList<Integer[]> result){
		if(row == 8) {
			result.add(col.clone());
		} else {
			for (int column = 0; column < 8; column++){
				if (validPosition(row, column, col)){
					col[row] = column;
					helper(row+1, col, result);
				}
			}
			// no reset here compared to Sudoku
			// because when we check valid, we only care rows before it
		}
		
	}
	
	Boolean validPosition(int row, int column, Integer[] col){
		for (int i=0; i<row; i++){
			// whether there is a queen on the same column
			if(col[i] == column) return false;
			// check diagnals
			if(Math.abs(col[i]-column) == row - i) return false;
		}
		return true;
		
	}
	
	
	/* Clear logic : http://www.heimetli.ch/ffh/simplifiedsudoku.html*/
	/* Sudoku attempt, similar logic I think */
	
	/*
	 * Wrong! You have to check the cell one by one, don't try line by line
	 * cuz it's difficult to reset it 
	 * 
	 * You can throw Exception to claim you find the solution in the deepest recursion
	 */
	
//	private static int GRID_SIZE = 9;
//	public int[][] sudokuSolution(int[][] map) {
//		int[][] result = null;
//		helper(0, map, result);
//		return result;
//	}

//	private void helper(int row, int[][] map, int[][] result){
//		if(row == GRID_SIZE) result = map;
//		
//		HashSet<Integer> existNum = new HashSet<Integer>();
//		for (int col = 0; col < GRID_SIZE; col++){
//			if(result[row][col] != 0) existNum.add(map[row][col]);
//		}
//		HashSet<Integer> lackNum = new HashSet<Integer>();
//		for (int i=1; i<10; i++){
//			if(!existNum.contains(i)) lackNum.add(i);
//		}
//		for (Integer curNum : lackNum){
//			for (int col = 0; col < GRID_SIZE; col++){
//				if (valid(row, col, map, curNum)) {
//					map[row][col] = curNum;
//					helper(row+1, map, result);
//				}
//			}
//		}
		// if not found suitable numbers, recurs back / backtracking
		// Don't forget to clean it up --  cuz even after this time it success, maybe it leads to wrong answer
		// When it reach this line, means no other solution available, must recurse to previous
		// Thus clean up
//	}
//	
//	private boolean valid(int row, int col, int[][] map, Integer curNum){
//		for(int i=0; i<GRID_SIZE; i++){
//			if(curNum == map[i][col]) return false; // check same column
//		}
//		int verPack = row/3;
//		int horPack = col/3;
//		for (int i=0; i<3; i++){
//			for (int j=0; j<3; j++){
//				if (map[verPack*3+i][horPack*3+i] == curNum) return false;
//			}
//		}
//		return true;
//	}

}
