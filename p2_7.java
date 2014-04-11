package CC150;

import java.util.Stack;

public class p2_7 {
	/* Create another reverse list and compare*/
//	public boolean ispalindrome(Node head){
//		Node firHead = head;
//		Node secHead = null;
//		while (firHead != null){
//			Node tmp = new Node(firHead.data);
//			tmp.next = secHead;
//			secHead = tmp;
//			firHead = firHead.next;
//		}
//		firHead = head;
//		while(firHead!= null && secHead != null){
//			if (firHead.data != secHead.data) return false;
//			firHead = firHead.next;
//			secHead = secHead.next;
//		}
//		return true;
//	}
	
	/* Only reverse Half of the list*/
//	public boolean ispalindrome(Node head){
//		int len = 0;
//		Node secHalf = head;
//		while(secHalf != null){
//			len++;
//			secHalf = secHalf.next;
//		}
//		if (len == 1) return true;
//		int count = len/2;
//		secHalf = head;
//		for (int i=0; i<count; i++){
//			secHalf = secHalf.next;
//		}
//		secHalf = (len%2 == 0) ? secHalf: secHalf.next; // Deal odd
//
//		Node revList = null;
//		while (secHalf != null){
//			Node tmp = new Node(secHalf.data);
//			tmp.next = revList;
//			revList = tmp;
//			secHalf = secHalf.next;
//		}
//		while(head != null && revList != null){
//			if (head.data != revList.data) return false;
//			head = head.next;
//			revList = revList.next;
//		}
//		return true;
//	}
	
	/* Use Stack and count middle using two pointer*/
//	public boolean ispalindrome(Node head){
//		Stack<Node> stack = new Stack<Node>();
//		Node faster = head;
//		Node slower = head;
//		while(faster != null && faster.next != null){
//			stack.push(slower);
//			slower = slower.next;
//			faster = faster.next.next;
//		}
//		if (faster != null){	
//			slower = slower.next;	// if even, current slower is last half already
//		}
//		while(!stack.empty()){
//			if(stack.pop().data != slower.data) return false;
//			slower = slower.next;
//		}
//		return true;
//	}
	
	
	/* recursion version in Book, don't consider 'null'*/
	private class Result {
		boolean result;
		Node n;
		public Result(Node n, boolean res){
			result = res;
			this.n = n;
		}
	}
	
	public boolean ispalindrome(Node head){
		int len = 0;
		Node secHalf = head;
		while(secHalf != null){
			len++;
			secHalf = secHalf.next;
		}
		Result res = helper(head, len);
		return res.result;
	}
	
	private Result helper(Node head, int length) {
		// terminate codition
		if (length == 1){
			return new Result(head.next, true);
		}else if (length == 0){
			return new Result(head, true);
		} else {
			// recursion
			// head is the pointer before the mid, return of helper() is the pointer after
			Result sec = helper(head.next, length-2);
			if (!sec.result) return sec;
			if (sec.n.data == head.data) {
				return new Result(sec.n.next, true);
			} else {
				return new Result(sec.n.next, false);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
