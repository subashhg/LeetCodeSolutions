/**
 * 
 */
package jyosh.udacity.solutions;

/**
 * @author Subash
 *
 */
public class Queue {

	Element head;
	Element tail;	
	
	public Queue(){};
	
	public Queue(Element element){
		if(head == null || tail == null)
			head = tail = element;
		else
		  enqueue(element);
	}
	
	/**
	 * This method checks if the element passed is the first element being added, 
	 * if yes then make it head and tail  or add it to tail
	 * 
	 * @param element
	 */
	
	public void enqueue(Element element) {
		if (head == null || tail == null)
			head = tail = element;
		else {
			tail.next = element;
			tail = element;
		}

	}
	
	/**
	 * this is the overridden method that takes the value and constructs the element out of it
	 * and then calls other enqueue method to add the element to queue
	 * @param i
	 */
	
	public void enqueue(int i) {
		enqueue(new Element(i));
	}

	/**
	 * peek the next visible value in the queue if the queue is not empty
	 * @return
	 */
	
    public String peek() {
    	String value = "Queue Empty";
    	
    	if (head != null)
    		value = Integer.toString(head.value);
    	
    	return value;
    } 

    /**
     * delete the first element from head by making next element to head as head
     *  if the queue is not empty
     * @return
     */
    
	public String dequeue() {
		String value = "Queue Empty";

		if (head != null) {
			value = Integer.toString(head.value);
			head = head.next;
		}
		if(head == null)
			tail = null;
		return value;
	}
	/**
	 * Printing the queue to see all the available values
	 */
	void printQueue(){
		if(head == null)
			System.out.println("Queue is empty");
		
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
		// TODO Auto-generated method stub
		
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		System.out.println("peek: "+q.peek());
		System.out.println("dequeue: "+q.dequeue());
		System.out.println("Queue: ");
		q.printQueue();
		System.out.println("Enqueu 4");
		q.enqueue(4);
		System.out.println("Queue: ");
		q.printQueue();
		System.out.println("dequeue: "+q.dequeue());
		System.out.println("dequeue: "+q.dequeue());
		System.out.println("dequeue: "+q.dequeue());
		System.out.println("dequeue: "+q.dequeue());
		System.out.println("dequeue: "+q.dequeue());
		System.out.println("Queue: ");
		q.printQueue();
	}
}


