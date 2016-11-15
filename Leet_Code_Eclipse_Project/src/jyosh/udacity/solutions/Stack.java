/**
 * 
 */
package jyosh.udacity.solutions;

/**
 * Doubly Linked list is used to implement stack
 * @author Subash
 *
 */
public class Stack {
	Node top;
	
	public Stack(Node node){
		top = node;
	}
	
	/**
	 * This method pushes the element to the top of the stack
	 * @param element
	 */
	public void push(Node node){
		if(top == null){
			top = node;
		}else {
			top.next = node;
			node.prev = top;
			top = node;
		}		
	}
	
	
	/**
	 * This method pops the top element from the stack. 
	 * @param element
	 */
	
	public void pop() {
		if (top == null) {
			return;
		}else{
			top = top.prev;
			top.next = null;
		}
		
	}
	
	void printStack(){
		if(top == null)
			System.out.println("stack is empty");
		
		Node current = top;
		while(current!=null){
			System.out.print(current.value + " ");
			current = current.prev;
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node e1 = new Node(1);
		Node e2 = new Node(2);
		Node e3 = new Node(3);
		Node e4 = new Node(4);
		
		Stack stack = new Stack(e1);
		stack.push(e2);
		stack.push(e3);
		
		
		System.out.println("Stack: ");
		stack.printStack();
		
		// Test insert
		stack.push(e4);
		System.out.println("Stack: ");
		stack.printStack();
		
		
		//# Test delete
		stack.pop();
		System.out.println("after pop Stack: ");
		stack.printStack();
		

	}

}

class Node {
    int value;
    Node next;
    Node prev;
    Node(int x) {
    	value = x; 
    }
}
