package CC150;

public class p4_5 {
	/* Create an inner class to help*/
//	private class SpeNode {
//		TreeNode node;
//		Boolean isBSFNode;
//
//		public SpeNode(TreeNode n, Boolean b) {
//			node = n;
//			isBSFNode = b;
//		}
//	}
//	public boolean isBST(TreeNode root){
//		return isBSTHelper(root).isBSFNode;
//	}
//
//	private SpeNode isBSTHelper(TreeNode root){
//		if (root == null) return new SpeNode(root, true); // leaves
//		
//		SpeNode left = isBSTHelper(root.left);
//		SpeNode right = isBSTHelper(root.right);
//		
//		SpeNode cur = new SpeNode(root, false);
//		
//		Boolean leftValid = true;
//		if(root.left != null && root.left.value >= root.value) leftValid = false;
//		Boolean rightValid = true;
//		if(root.right != null && root.left.value >= root.value) leftValid = false;
//		
//		if(left.node.value < root.value && root.value<right.node.value
//				&& left.isBSFNode && right.isBSFNode) {
//			cur.isBSFNode = true;
//		}
//		return cur;
//		
//	}
	
	// In-order and copy it to an array to check whether in-order
	// Must know the size of the Tree, or use ArrayList
	
//	int[] array;
//	int index;
//	
//	public boolean isBST(TreeNode root){
//		array = new int[traverse(root)];
//		index = 0;
//		copyArray(root);
//		for (int i=1; i<array.length; i++){
//			if (array[i-1] >= array[i]) return false;
//		}
//		return true;
//	}
//	
//	private void copyArray(TreeNode root){
//		if (root == null) {
//			return;
//		}
//		copyArray(root.left);
//		array[index] = root.value;
//		index++;
//		copyArray(root.right);
//	}
//	
//	private int traverse(TreeNode root){
//		if (root == null) return 0;
//		int count = 0;
//		count += traverse(root.left) + traverse(root.right);
//		return count+1;
//	}
	
	
	/* Use only recursion */
	// No need to compare with left && right children. 
	// Only necessary to compare with the previous one
//	Integer pre_value = null;
//	public boolean isBST(TreeNode root){
//		if(root == null) return true;
//		if(!isBST(root.left)) return false;
//		if(pre_value != null && root.value <= pre_value) {
//			return false;
//		}
//		pre_value = root.value;
//		if(!isBST(root.right)) return false;
//		return true;
//	}
	/*Comment: use null to mark the starter of the recursion*/
	
	
	/* Another understanding of WHAT IS A TREE */
	/* ALL left nodes are less than current node *
	 * ALL right nodes are bigger than current node */
//	public boolean isBST(TreeNode root){
//		return helper(root, -1, 100);
//	}
//	
//	public boolean helper(TreeNode root, int min, int max){
//		if (root == null) return true;
//		return helper(root.left,min,root.value) && 
//				helper(root.right,root.value,max) &&
//				root.value < max && root.value > min;
//	}
	/* Comment: Wrong. this method should get MIN MAX in the first place.
	/* But actually it's not necessary. 
	 * For each node, when we check left, we only care whether all nodes
	 * in its left is smaller than it. Thus we only update max..
	 */
	
	/* Revised version of the previous wrong one */
	public boolean isBST(TreeNode root){
		return helper(root, null, null);
	}
	
	public boolean helper(TreeNode root, Integer min, Integer max){
		if (root == null) return true;
		
		if(min != null && root.value <= min) return false;
		if(max != null && root.value >= max) return false;
		
		if(!helper(root.left,min,root.value)) return false;
		if(!helper(root.right,root.value,max)) return false;
		return true;
	}

}
