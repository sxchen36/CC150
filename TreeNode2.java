package CC150;

public class TreeNode2 {
	TreeNode2 left;
	TreeNode2 right;
	int value;
	TreeNode2 parent;
	
	public TreeNode2(int v){
		left = null;
		right = null;
		parent = null;
		value = v;
	}
	
	public TreeNode2 leftChild(int v){
		TreeNode2 left = new TreeNode2(v);
		left.parent = this;
		this.left = left;
		return left;
	}
	
	public TreeNode2 rightChild(int v){
		TreeNode2 right = new TreeNode2(v);
		right.parent = this;
		this.right = right;
		return right;
	}
}
