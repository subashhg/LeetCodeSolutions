/**
 * 
 */
package jyosh.udacity.solutions;


/**
 * @author Subash
 *
 */
public class LinkedList {
	Element head;
	
	public LinkedList(Element element){
		head = element;
	}
	
	/**
	 * This method appends the element to the end of the linked list
	 * @param element
	 */
	public void append(Element element){
		Element current = null;
		if(head == null){
			head = element;
			return;
		}
		
		current = head;
		while(current.next!=null){
			current = current.next;
		}
		current.next = element;
	}
	
	/**
	 * This method will search and returns the position of the element if found
	 * 
	 * @param e
	 * @return
	 */
	public String getValueAtPosition(int index){
		String value = "NONE";
		
		if(head == null){
			return value;
		}
		Element current = head;
		for(int i =2; i<=index&&current!=null; i++){
			current = current.next;
		}
		if(current!=null)
			value = Integer.toString(current.value);
		return value;
	}
	
	/**
	 * This method will insert the element in to the position given,
	 * if the position given is more than the elements in the list, then 
	 * element will be added to the end of the list. 
	 * If the list is empty the the element given will become the head of the list.
	 * @param element
	 * @param position
	 */
	
	public void insert(Element element, int position){
		if(head == null){
			head = element;
		}
		Element current = head;
		for(int i =2; i<position&&current.next!=null; i++){
			current = current.next;
		}
		element.next = current.next;
		current.next = element;
	}
	
	/**
	 * This method deletes the element if found in the list. 
	 * @param element
	 */
	
	public void delete(int position) {
		if (head == null) {
			return;
		}
		if(position == 1){
			head = head.next;
			return;
		}
		Element current = head;
		Element prev = head;
		for (int i = 1; i < position && current!= null; i++) {
			prev = current;
			current = current.next;
		}
		if(current!=null)
			prev.next = current.next;
		
	}
	
	void printList(){
		if(head == null)
			System.out.println("List is empty");
		
		Element current = head;
		while(current!=null){
			System.out.print(current.value + " ");
			current = current.next;
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Element e1 = new Element(1);
		Element e2 = new Element(2);
		Element e3 = new Element(3);
		Element e4 = new Element(4);
		
		LinkedList ll = new LinkedList(e1);
		ll.append(e2);
		ll.append(e3);
		
		// Test get_position
		// Should print 3
		//print ll.head.next.next.value
		System.out.println("ll.head.next.next.value: "+ ll.head.next.next.value);
		//Should also print 3

		System.out.println("List: ");
		ll.printList();
		System.out.println("value at position 3: " + ll.getValueAtPosition(3));
		
		// Test insert
		ll.insert(e4,3);
		System.out.println("List: ");
		ll.printList();
		
		// print ll.get_position(3).value
		System.out.println("value at position 3: " + ll.getValueAtPosition(3));
		
		//# Test delete
		ll.delete(1);
		ll.printList();
		

	}

}

class Element {
    int value;
    Element next;    
    Element(int x) {
    	value = x; 
    }
}
