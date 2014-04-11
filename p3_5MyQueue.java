package CC150;

import java.util.Stack;

public class p3_5MyQueue<T> {
	Stack<T> stack1 = new Stack<T>();
	Stack<T> stack2 = new Stack<T>();
	public T pop() {
		shift();
		return stack2.pop();
	}
	
	private void shift(){
		if (stack2.empty()){
			while (!stack1.empty()){
				stack2.push(stack1.pop());
			}
		}
	}
	
	public void push(T t) {
		stack1.push(t);
	}
	
	public boolean empty() {
		return stack1.empty() && stack2.empty();
	}
	
	public int size() {
		return stack1.size()+stack2.size();
	}
	
	public T peek() {
		shift();
		return stack2.peek();
	}
}
