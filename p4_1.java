package CC150;

public class p4_1 {
	public boolean isBalanced(TreeNode root){
		return helper(root) > 0;
	}
	
	private int helper(TreeNode root){
		if (root == null) {
			return 0;
		}
		int left = helper(root.left);
		int right = helper(root.right);
		if (left < 0 || right < 0 || Math.abs(left-right)>1) return -1;
		return (left>right)? left+1 : right+1;
	}
}
