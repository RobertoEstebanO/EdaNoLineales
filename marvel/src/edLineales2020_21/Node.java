package edLineales2020_21;

/**
 * The Class Node.
 *
 * @param <E> the element type
 */
public class Node<E> {

	/** The element. */
	private E element;
	
	/** The next. */
	private Node<E> next;
	
	/**
	 * Instantiates a new node.
	 *
	 * @param element the element
	 * @param next the next
	 */
	public Node(E element, Node<E> next) {
		super();
		this.element = element;
		this.next = next;
	}
	
	/**
	 * Instantiates a new node.
	 *
	 * @param element the element
	 */
	public Node(E element) {
		super();
		this.element = element;
	}

	/**
	 * Gets the element.
	 *
	 * @return the element
	 */
	public E getElement() {
		return element;
	}

	/**
	 * Sets the element.
	 *
	 * @param element the new element
	 */
	public void setElement(E element) {
		this.element = element;
	}

	/**
	 * Gets the next.
	 *
	 * @return the next
	 */
	public Node<E> getNext() {
		return next;
	}

	/**
	 * Sets the next.
	 *
	 * @param aux the new next
	 */
	public void setNext(Node<E> aux) {
		this.next = aux;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return  element + "\n";
	}

	

	

}
