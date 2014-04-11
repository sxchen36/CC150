package CC150;

public class p11_6 {
	
	/* Below solution is for find element in an ordered Matrix
	 * But the quesiton is ordered row & column. Not necassary to be
	 * an ordered Matrix*/
//	public int[] findInMatric(int[][] matrix, int M, int N, int element){
//		int row = findRow(matrix, 0, M, element);
//		int col = findEle(matrix[row], 0, N, element);
//		int[] re = {row, col};
//		return re;
//	}
//	
//	public int findRow(int[][] matrix, int top, int bottom, int element){
//		if (top >= bottom) return -1;
//		if (top + 1 == bottom) return top;
//		
//		int mid = (top + bottom)/2;
//		if (element < matrix[mid][0]) {
//			return findRow(matrix, top, mid-1, element);
//		} else {
//			return findRow(matrix, mid, bottom, element);
//		}
//		
//	}
//	
//	public int findEle(int[] row, int left, int right, int element){
//		int mid = (left+right)/2;
//		if (row[mid] == element) return mid;
//		
//		if (row[mid] < element){
//			return findEle(row, mid+1, right, element);
//		} else {
//			return findEle(row, left, mid-1, element);
//		}
//	}
	
	
// Leetcode has same quesitons. can keep until do it on Leetcode
	
}
