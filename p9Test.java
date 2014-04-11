package CC150;

import static org.junit.Assert.*;

import org.junit.Test;

public class p9Test {

	@Test
	public void test7() {
		p9_7 p = new p9_7();
		int[][] paint = {{0,0,3,1,2,2,3,3},
						 {3,3,1,2,2,3,4,4},
						 {1,1,2,2,2,3,3,0},
						 {0,0,2,2,3,3,3,2}};
		p.paintfill(paint, 3, 2, 1);
		
//		for(int i=0; i<paint.length; i++){
//			for(int j=0; j<paint[0].length; j++){
//				System.out.print(paint[i][j]);
//			}
//			System.out.println();
//		}
	}
	
	@Test
	public void test8(){
		p9_8 p = new p9_8();
		assertEquals(1,p.countWays(1));
		assertEquals(2,p.countWays(5));
		assertEquals(4,p.countWays(12));
	}
}
