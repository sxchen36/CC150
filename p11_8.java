package CC150;

/* Right answer from CC150*/
public class p11_8 {
	class Node {
		Node right;
		Node left;
		int value;
		int count;
		int leftChildren;
		Node(int v){
			value = v;
			count = 0;
		}
		
		Node insert(int v){
			if (v > this.value){
				if (this.right == null){
					Node rchild = new Node(v);
					this.right = rchild;
				} else {
					this.right = this.right.insert(v);
				}
			} else if (v < this.value){
				if (this.left == null){
					Node lchild = new Node(v);
					this.left = lchild;
					this.leftChildren++;
				} else {
					this.left = this.left.insert(v);
					this.leftChildren = this.left.leftChildren+1; 
				}
			} else {
				this.count++;
			}
			return this;
		}

	}
	
	Node root;
	
	public void track(int x){
		if (root == null) {
			root = new Node(x);
		} else {
			root.insert(x);
		}
	}
	
	public int getRankOfNumber(int x){
		return rankOfNumberHelper(root, x);
	}
	
	private int rankOfNumberHelper(Node n, int x){
		if (n.value == x) return n.leftChildren + n.count -1;
		if (x < n.value) {
			if (n.left == null) return -1;
			return rankOfNumberHelper(n.left,x);
		} else {
			if (n.right == null) return -1;
			int count = rankOfNumberHelper(n.right,x);
			if (count == -1) return -1;
			count += n.leftChildren;
			count += n.count;
			return count;
		}
	}
	
	
}
