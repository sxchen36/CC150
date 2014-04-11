package CC150;


public class Node {
	int data;
	Node next;
	public Node(int a) {
		data = a;
		next = null;
	}
	public void appendTail(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	
}
