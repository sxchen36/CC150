package CC150;

public class p4_6 {


	/* Right answer, good OO design, but we can use iteration to 
	 * reduce the space consumption*/
//	public TreeNode findNext(TreeNode n){
//		if(n == null) return null;
//		if(n.right != null) return findLeftMost(n);
//		return findUpperRightParent(n);
//	}
//	
//	private TreeNode findLeftMost(TreeNode n){
//		if (n==null) return null;
//		if (n.left == null) return n;
//		return findLeftMost(n.left);
//	}
//	
//	private TreeNode findUpperRightParent(TreeNode n){
//		if (n == null) return null;
//		if (n == n.parent.left) return n.parent;
//		return findUpperRIghtParent(n.parent)
//	}

	
/* Right answer. 
 * Contains error cuz there is no parent field for TreeNode now
	public TreeNode findNext(TreeNode n){
		if(n==null) return null;
		if(n.right != null) return findLeftMost(n.right);
		return findUpperRightParent(n);
	}
	
	private TreeNode findLeftMost(TreeNode n){
		while(n.left != null) {
			n = n.left;
		}
		return n;
	}
	
	private TreeNode findUpperRightParent(TreeNode n){
		while(n != null && n.parent.left != n){
			n = n.parent;
		}
		return n.parent
	}
	*/
	
	
	
}
