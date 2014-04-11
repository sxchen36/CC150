package CC150;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class p2Test {
	Node n1;
	Node n2;

	@Before
	public void init() {
		// n1 = 1 2 3 3 1 4
		n1 = new Node(1);
		n1.appendTail(2);
		n1.appendTail(3);
		n1.appendTail(3);
		n1.appendTail(1);
		n1.appendTail(4);
		n2 = new Node(2);
		n2.appendTail(2);
		n2.appendTail(2);
		n2.appendTail(2);
		n2.appendTail(2);
	}

	@Test
	public void testDelete() {
		p2_DeleteList p = new p2_DeleteList();
		p.deleteNode(n1, 4);
		// printList(n1);
	}

	@Test
	public void test1() {
		p2_1 p1 = new p2_1();
		p1.removeDup(n1);
		assertEquals(" 1 2 3 4", printList(n1));
		p1.removeDup(n2);
		assertEquals(" 2", printList(n2));
		}

	private String printList(Node n1) {
		String str= "";
		Node head = n1;
		while (head != null) {
			str += " " + head.data;
			head = head.next;
		}
		return str;
	}
	
	@Test
	public void test4(){
		p2_4 p4 = new p2_4();
		String str = printList(p4.sort(n1, 2));
		assertEquals(" 1 1 4 3 3 2", str);
	}
	
	@Test
	public void test5(){
		p2_5 p5 = new p2_5();
		Node n51 = new Node(1);
		n51.appendTail(2);
//		n51.appendTail(7);
		Node n52 = new Node(4);
		n52.appendTail(5);
		n52.appendTail(6);
		assertEquals(" 4 6 8",printList(p5.sum(n51, n52)));
	}
	
	@Test
	public void test6(){
		p2_6 p6 = new p2_6();
		Node n3 = new Node(10);
		Node n4 = new Node(20);
		n1.next = n3;
		n3.next = n4;
		n4.next = n3;
		assertEquals(10, p6.findCircle(n1).data);
		n1.next = n1;
		assertEquals(1, p6.findCircle(n1).data);	
	}
	
	@Test
	public void test7(){
		p2_7 p7 = new p2_7();
		Node n71 = new Node(1);
		n71.appendTail(2);
		n71.appendTail(3);
		n71.appendTail(2);
		n71.appendTail(1);
		assertTrue(p7.ispalindrome(n71));
		Node n72 = new Node(1);
		n72.appendTail(2);
		n72.appendTail(3);
		n72.appendTail(3);
		n72.appendTail(2);
		n72.appendTail(1);
		assertTrue(p7.ispalindrome(n72));
		assertFalse(p7.ispalindrome(n1));
		Node n74 = new Node(1);
		n74.appendTail(2);
		n74.appendTail(3);
		assertFalse(p7.ispalindrome(n74));
		Node n73 = new Node(1);
		assertTrue(p7.ispalindrome(n73));
		n73.appendTail(1);
		assertTrue(p7.ispalindrome(n73));
	}

}
