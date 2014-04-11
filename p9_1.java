package CC150;

public class p9_1 {
	
	/* Recursion version */
//	public int count(int steps){
//		return countWays(steps);
//	}
//	
//	public int countWays(int steps){
//		if(steps == 1) {
//			return 1;
//		} else if (steps == 2 || steps == 3){
//			return 2;
//		} else {
//			// devide into subquestions
//			return countWays(steps-1) + countWays(steps - 2) + countWays(steps - 3);
//		}
//		
//	}
	
	/* DP version */
	public int count (int n){
		int[] map = new int[n];// only n elements is enought
		for(int i=0; i<n; i++){
			map[i] = -1;
		}
		return helper(n, map);
	}
	private int helper(int n, int[] map){
		if(n == 1) {
			map[n] = 1;
			return map[n];
		}else if (n == 2 || n==3){
			map[n] = 2;
			return map[n];
		}else if (map[n] > -1){
			return map[n];
		}else {
			map[n] = helper(n-1, map) +
					helper(n-2,map) +
					helper(n-3, map);
			return map[n];
		}
	}
}
