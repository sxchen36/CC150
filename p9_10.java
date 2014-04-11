package CC150;

import java.util.ArrayList;

public class p9_10 {
	
	
	/* Wrong logic!!! it could be add two smaller boxes end up with taller than
	 * putting on the tallest box!!!!*/
	
//	/*
//	 * Thinking:
//	 * If the result should be tallest with n boxes,
//	 * It should be built with n-1 tallest boxes plus one tallest in remainders
//	 * Thus given n-1 high stack, we try tallest one from the remainder
//	 * If it doesn't work, try second tallest one... until we find the answer
//	 * 
//	 * Base: if try all the remainders without find a solution, we get the answer
//	 * 
//	 */
//	
//	
//	/*
//	 * Optimize: sort the remainder in the beginning, from big to small. 
//	 * If bigger one doesn't fix this time, when recursion, cut it off, 
//	 * start from smaller one cuz there will be no way for the bigger one to 
//	 * fix in future
//	 * 
//	 * Base: no remainder left
//	 * */
//	class Box{
//		int height;
//		int width;
//		int length;
//	}
//	private ArrayList<Box> helper(ArrayList<Box> stacks, ArrayList<Box> remainders){
//		if (remainders.isEmpty()) return stacks;
//		
//		for (int i=0; i< remainders.size(); i++){
//			Box cur= remainders.get(i);
//			Box top = stacks.get(stacks.size()-1);
//			if(validBox(cur, top)) {
//				stacks.add(cur);
//				ArrayList<Box> newRemain = new ArrayList<Box>();
//				for (int j=i+1; j<remainders.size(); j++){
//					newRemain.add(remainders.get(j));
//				}
//				helper(stacks, newRemain);
//			}
//		}
//	}
	
	
	
}
