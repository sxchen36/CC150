package CC150;

public class p9_8 {
	
	/* Wrong answer cuz there are so many duplicate solutions
	 * such as {1,1,5,5} and {5,1,1,5} and {5,5,1,1}*/
//	public int countWays(int sum){
//		Set<> 
//		return countHelper(sum, set);
//	}
//	
//	// return the number of ways
//	private int countHelper(int temSum){
//		if(temSum < 0) {
//			return 0;
//		}
//		if (temSum == 0){
//			return 1;
//		}
//		int count1 = countHelper(temSum-1);
//		int count5 = countHelper(temSum-5); // should make them as pre-condition
//		int count10 = countHelper(temSum-10); // fix from big to small to eliminate duplication
//		int count25 = countHelper(temSum-25);
//		
//		return count1+count5+count10+count25;
//	}
	
	public int countWays(int sum){
		int[] money = {25,10,5,1};
		return helper(money, 0, sum);
	}
	
	public int helper(int[] money, int index, int remainAmount){
		int ways = 0;
		
		
		/* Wrong in the first place. remainAmount=5, i=0, count 4*/
//		if(remainAmount <= 0) return 0;
//		if(remainAmount < 5) return 1; // Wrong! It can duplicate so many time!
		
		/* Everytime we need to check penny, means we run out of 
		 * solutions using other bigger unit. thus there only has 
		 * one way*/

//		if(index >= money.length-1) return 1; // IMPORTANT!!!! 
		if(index < money.length){
			int unit = money[index];

			for (int i=0; i*unit <= remainAmount; i++){
				ways += helper(money,index+1, remainAmount - i*unit);
			}
		}
		return ways;

	}
}
