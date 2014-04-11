package CC150;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class p11Test {

	@Test
	public void test2() {
		p11_2 p2 = new p11_2();
		String[] strs = {"asd","wer","dsa","rwe","qcd"};
		String[] result = p2.gatherAnagrams(strs);
		String re ="";
		for (int i=0; i<result.length; i++){
			re += result[i] + " ";
		}
		//assertEquals("asd dsa wer rwe qcd ", re); // for hashtable1
		assertEquals("wer rwe asd dsa qcd ", re); // for hashtable1
//		assertEquals("asd dsa qcd wer rwe ", re); // for comparator
	}

	@Test
	public void test3(){
		p11_3 p3 = new p11_3();
		int[] array = {6,8,9,11,56,2,4,5};
		assertEquals(2,p3.find(array, 9));
		assertEquals(5,p3.find(array, 2));
		assertEquals(0,p3.find(array, 6));
		assertEquals(7,p3.find(array, 5));
		assertEquals(4,p3.find(array, 56));
	}
	
	@Test
	public void test7(){
		p11_7 p7 = new p11_7();
		Person p1 = new Person(65,100);
		Person p2 = new Person(70,150);
		Person p3 = new Person(56,90);
		Person p4 = new Person(75,190);
		Person p5 = new Person(60,95);
		Person p6 = new Person(68,110);
		Person[] pool = {p1, p2, p3, p4, p5, p6};
		ArrayList<Person> re = p7.largestTower(pool);
		for (int i=0; i<re.size(); i++){
			System.out.print(re.get(i).toString());
		}
	}
}
