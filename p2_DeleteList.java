package CC150;

public class p2_DeleteList {

	/* recursion way*/
//	public Node deleteNode(Node n, int d){
//		if (n == null) return null;
//	    if(n.data == d){
//			return n.next;
//		}
//		n.next = deleteNode(n.next, d);
//		return n;
//	}
	
	public Node deleteNode(Node head, int d){
		Node n = head;
		if(n == null) return null;
		if (n.data == d) return n.next;
		while(n.next != null) {
			if(n.next.data == d){
			    n.next = n.next.next;	
			    return head;
			}
			n = n.next;
		}
		return head;
	}
}
