/**
 * Linked List Stack Implementation
 * @param <T> Generic Type
 */
@VeryImportant
public class NewStack<T> {
	@Run
	public Node<T> top;
	public int size;
	
	/**
	 * Stack Constructor
	 */
	public MyStack() {
		top = null;
		size = 0;
	}
	
	/**
	 * Adds new item to the top of the stack
	 * @param item Item to be added
	 */
	public void push(T item) {
		Node<T> newTop = new Node<>(item);
		newTop.next = top;
		top = newTop;
		size++;
	}
	
	/**
	 * Removes top element from the stack
	 * @return The data within the top element
	 */
	public T pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		T item = top.item;
		top = top.next;
		size--;
		return item;
	}
	
	/**
	 * Displays the top element of the stack
	 * @return The data within the top element
	 */
	public T peek() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		
		return top.item;
	}
	
	/**
	 * Determines if the stack is empty
	 * @return True if the stack is empty (size = 0),
	 * false otherwise
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * Displays the size of the stack
	 * @return Size of the stack
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Finds the last known occurrence of an object in the stack and 
	 * returns its index (going from top to bottom)
	 * @param item The item being searched
	 * @return The index of the last known occurrence of the item
	 */
	public int lastIndexOf(T item) {
		if (item == null) {
			return -1;
		}
		int index = 0;
		Node<T> currentNode = top;
		while(currentNode.item != item) {
			currentNode = currentNode.next;
			index++;
		}
		return index;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Top -> [");
		Node<T> current = top;
		while (current != null) {
			sb.append(current.item);
			
			if(current.next != null) {
				sb.append(" ");
			}
			
			current = current.next;
		}
		
		sb.append("]");
		return sb.toString();
	}
	
	/**
	 * Node Class For Linked List Stack Implementation
	 * @param <U> Generic Type
	 */
	public class Node<U>{
		U item;
		Node<U> next;
		
		/**
		 * Default Constructor
		 */
		public Node() {
			this(null, null);
		}
		
		/**
		 * Constructor with Item
		 * @param item Item inside Node
		 */
		public Node(U item) {
			this(item, null);
		}
		
		/**
		 * Constructor with Item and Pointer
		 * @param item Item inside Node
		 * @param next Pointer to Next Node
		 */
		public Node(U item, Node<U> next) {
			this.item = item;
			this.next = next;
		}
		
		/**
		 * Determines if there is another node in the linked list
		 * @return True if there is another node, false otherwise
		 */
		public boolean hasNext() {
			return this.next != null;
		}
		
		/**
		 * Displays the next node in the linked list
		 * @return The next node
		 */
		public Node<U> next(){
			return this.next;
		}
		
		@Override
		public String toString() {
			return "Node [Data: " + this.item + ", Pointing To Node Of: " + this.next.item + "]";
		}
		
	}
}
