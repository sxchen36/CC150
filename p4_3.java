package CC150;

public class p4_3 {
	/* Better to create a new method taking (int[] array, int start, int end)
	 * as parameters*/
	public TreeNode bst(int[] array){
		if(array.length == 1){
			return new TreeNode(array[0]);
		}
		int len = array.length;
		TreeNode root = new TreeNode(array[len/2]);
		int[] lchildren = new int[len/2];
		for(int i=0; i<len/2; i++){
			lchildren[i] = array[i];
		}
		int rlen = (len%2 == 0) ? len/2 : (len/2+1);
		int[] rchildren = new int[rlen];
		for(int i=0; i<rlen; i++){
			rchildren[i] = array[len/2 + i];
		}
		root.left = bst(lchildren);
		root.right = bst(rchildren);
		return root;
	}
}
