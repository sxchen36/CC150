package CC150;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class p1_1Test {
	p1_1 t;
	
	String str1;
	String str2;
	String str3;
	char[] str4;
	
	@Before
	public void init(){
		t = new p1_1();
		str1 = "SSSSSSS";
		str2 = "Sixiang";
		str3 = "xanigSi";	
		str4 = "I am      ".toCharArray();
	}
	@Test
	public void test1() {
		assertTrue(t.unique("string"));
		assertFalse(t.unique("ssss"));
	}
	@Test
	public void test3(){
		P1_3 t3 = new P1_3();
		assertTrue(t3.permutation(str3, str2));
		assertFalse(t3.permutation(str1, str2));
	}
	@Test
	public void test4(){
		P1_4 t4 = new P1_4();
		//assertEquals("I%20am",t4.replace(str4.toCharArray(), 3));
		t4.replace(str4, 4);
		//System.out.println(str4);
	}
	
	@Test
	public void test5() {
		P1_5 t5 = new P1_5();
		String res = t5.compression("aaaabbbccccccccccccccc");
//		System.out.println(res);
	}

	@Test
	public void test7() {
		P1_7 t7 = new P1_7();
		int[][] matrix = {{2,2,3,3},{3,0,4,4},{5,6,5,8}};
		t7.setZero(matrix, 3, 4);
//		for(int i=0; i<3; i++){
//			for (int j=0; j<4; j++){
//				System.out.print(matrix[i][j]);
//			}
//			System.out.println("");
//		}
	}
}
