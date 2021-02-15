package edLineales2020_21;

import java.util.EmptyStackException;

// TODO: Auto-generated Javadoc
/**
 * The Class StackDinamyc.
 *
 * @param <E> the element type
 */
public  class StackDynamic <E> implements Stack <E> {

	/** The top. */
	private Node <E> top;
	
	/** The size. */
	private int size;
	
	/**
	 * Instantiates a new stack dinamica.
	 */
	public StackDynamic() {
		top=null;
		size=0;
	}
	
	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		return (top == null);
	}
	
	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size () {
		return this.size;
	}
	
	/**
	 * Top.
	 *
	 * @return the e
	 */
	public E top() {
		if (isEmpty()) {
			return null;
		}
		return top.getElement();
	}
	
	/**
	 * Push.
	 *
	 * @param element the element
	 */
	public void push (E element) {
		Node <E> aux = new Node <E> (element,top);
		top=aux;
		this.size++;
	}
	
	/**
	 * Pop.
	 *
	 * @return the e
	 */
	public E pop() {
		
		if (isEmpty()) {
			return null;
		}else {
			E element=top.getElement();
			Node<E> aux = top.getNext();
			top= null;
			top=aux;
			this.size--;
			return element;
		}
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		if(isEmpty()){
			return "La pila esta vacia";
		}else {
			String resultado="";
			Node<E> aux = top;
			while (aux!=null) {
				resultado += aux.toString();
				aux=aux.getNext();
			}
			return resultado;
		}
	}

	
}
