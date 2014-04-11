package CC150;

public class p2_4 {
	/* List is acceptable to create two lists and merge them
	 * This my version only create one list. Actually it's doesn't matter*/
//	public Node sort(Node head, int x){
//		Node pointer = head;
//		Node larger = new Node(0);
//		while (pointer.next != null){
//			if(pointer == head && pointer.data >= x){
//				larger.appendTail(head.data);
//				head = head.next;
//			} else if (pointer.next.data >= x) {
//				larger.appendTail(pointer.next.data);
//				pointer.next = pointer.next.next;
//			} else {
//				pointer = pointer.next;
//			}
//		}
//		pointer.next = larger.next;
//		return head;
//	}
	
	public Node sort(Node head, int x) {
		Node less = null;
		Node more = null;
		while (head != null) {
			Node next = head.next;
			if (head.data < x){
				head.next = less;
				less = head;
			} else {
				head.next = more;
				more = head;
			}
			head = next;
		}
		if(less == null) return more;
		head = less;
		while(less.next != null){
			less = less.next;
		}
		less.next = more;
		return head;
	}

}
