package CC150;

import java.util.HashMap;

public class p2_6 {
	
	/* Space O(N)*/
//	public Node findCircle(Node head){
//		HashMap<Node,Boolean> map = new HashMap<Node,Boolean>();	
//		while(head != null){
//			if(map.containsKey(head)){
//				return head;
//			} else {
//				map.put(head,true);
//				head = head.next;
//			}
//		}
//		return head;
//	}
	
	/* Without other data structure*/
	public Node findCircle(Node head){
		Node slower = head;
		Node faster = head;
		while(faster != null && faster.next != null){
			slower = slower.next;
			faster = faster.next.next;
			if (slower == faster){
				break;
			}
		}
			slower = head;
		while (faster != slower){
			slower = slower.next;
			faster = faster.next;
		}
		return faster;
	}
}
