package CC150;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class p2_1 {
	/* Use no buffer. O(N^2)*/
//	public void removeDup(Node head) {
//		Node cur = head;
//		while (cur.next != null) { // Should be cur != null, no need to be .next
//			Node p = cur.next;     // Should be  = cur, no need to be .next cuz it will always check .next=cur or not
//			if (p.data ==  cur.data) {
//				cur.next = p.next;
//				continue;
//			}
//			while (p.next != null){
//				if (p.next.data == cur.data) {
//					p.next = p.next.next;
//				}
//				p = p.next;
//			}
//			cur = cur.next;
//		}
//		
//	}
	
	public void removeDup(Node head){
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		Node pre = null;
		while(head != null) {
			if(!map.containsKey(head.data)){
				map.put(head.data, true);
				pre = head;
			} else {
				pre.next = head.next;
			}
			head = head.next;
		}
	}
}
