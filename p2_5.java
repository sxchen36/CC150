package CC150;

public class p2_5 {
	/* FOLLOW UP solution. I think mine is better than the book 
	 * Noticed: don't try to over brief it. You can't get rid of 
	 * add zero to it. When you have a solution, write it down!*/
	public Node sum(Node n1, Node n2){
		int len1 = length(n1);
		int len2 = length(n2);
		if (len1 > len2) {
			for (int i=0; i<len1-len2; i++){
				Node tmp = new Node(0);
				tmp.next = n2;
				n2 = tmp;
			}
		}else if (len1 < len2){
			for (int i=0; i<len2-len1; i++){
				Node tmp = new Node(0);
				tmp.next = n1;
				n1 = tmp;
			}
		}
		return sumHelper(n1,n2);
	}
	
	private int length(Node n){
		int c = 0;
		while(n!= null){
			c++;
			n=n.next;
		}
		return c;
	}
	
	private Node sumHelper(Node n1, Node n2){
		if (n1.next == null && n2.next == null){
			return new Node(n1.data + n2.data);
		} else {
			Node n = new Node(n1.data + n2.data);
			n.next = sumHelper(n1.next,n2.next);
			if (n.next.data >= 10) {
				n.next.data = n.next.data%10;
				n.data += 1;
			}
			return n;
		}
	}
}
