package CC150;

import static org.junit.Assert.*;

import org.junit.Test;

public class p4Test {
	
	@Test
	public void test1() {
		TreeNode root = new TreeNode(4);
		p4_1 p1 = new p4_1();
		assertTrue(p1.isBalanced(root));
		
		TreeNode l1 = new TreeNode(2);
		root.left = l1;
		TreeNode r1 = new TreeNode(6);
		root.right = r1;
		assertTrue(p1.isBalanced(root));
		TreeNode l1l = new TreeNode(1);
		l1.left = l1l;
		assertTrue(p1.isBalanced(root));
		TreeNode l1ll = new TreeNode(-1);
		l1l.left = l1ll;
		assertFalse(p1.isBalanced(root));
	}
	
	@Test
	public void test5_1() {
		p4_5 p5 = new p4_5();
		TreeNode root = new TreeNode(4);
		assertTrue(p5.isBST(root));	
		TreeNode left = new TreeNode(2);
		root.left = left;
		//p5.pre_value = null;//reset pre_value on solution 2
		assertTrue(p5.isBST(root));
		TreeNode right = new TreeNode(10);
		root.right = right;
		//p5.pre_value = null;//reset pre_value on solution 2
		assertTrue(p5.isBST(root));
	}
	@Test
	public void test5_2() {
		p4_5 p5 = new p4_5();
		TreeNode root = new TreeNode(4);
		TreeNode left = new TreeNode(2);
		root.left = left;
		TreeNode right = new TreeNode(1);
		root.right = right;
		assertFalse(p5.isBST(root));
	}
	
	@Test
	public void test7() {
		p4_7 p7 = new p4_7();
		//Regardless whether is BST or not
		TreeNode2 four = new TreeNode2(4);
		TreeNode2 two = four.leftChild(2);
		TreeNode2 three = two.rightChild(3);
		TreeNode2 one = two.leftChild(1);
		TreeNode2 six = four.rightChild(6);
		TreeNode2 five = six.leftChild(5);
		TreeNode2 seven = six.rightChild(7);
		assertEquals(p7.commonAncestor(three, six).value, 4);
		assertEquals(p7.commonAncestor(one, three).value, 2);
		assertEquals(p7.commonAncestor(one, four), null);
	}

}
