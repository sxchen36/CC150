package CC150;

public class p4_7 {
	/* Don't know how to do it if without Node.parent*/
//	public TreeNode commonAncestor(TreeNode root, TreeNode n1, TreeNode n2){
//		
//	}
//	
//	private TreeNode findN1(TreeNode root, TreeNode n1){
//		if (root == null) return null;
//		if (root == n1) return n1;
//		
//		TreeNode left = findN1(root.left, n1);
//		TreeNode right = findN1(root.right, n1);
//		
//		if (left != null){
//			return left;
//		} else {
//			return right;
//		}
//	}
	
	
	public TreeNode2 commonAncestor(TreeNode2 n1, TreeNode2 n2) {
		TreeNode2 parent = n1.parent;
		while(parent != null){
			if (parent.left == n1 && findN2(parent.right, n2)) {
				return parent ;
			} else if (parent.right == n1 && findN2(parent.left, n2)){
				return parent;
			} else {
				n1 = parent;
				parent = parent.parent;
			}
		}
		return parent;
	}
	
	private Boolean findN2(TreeNode2 root, TreeNode2 n2){
		if(root == null)
			return false;
		if(root == n2) 
			return true;
		return findN2(root.left,n2)||findN2(root.right,n2);
	}
}
