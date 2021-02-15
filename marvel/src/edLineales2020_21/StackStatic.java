package edLineales2020_21;

import java.util.EmptyStackException;


/**
 * The Class StackStatic.
 *
 * @param <E> the element type
 */
public  class StackStatic <E> implements Stack <E> {

	/** The t. */
	private int t=-1;
	
	/** The maxima. */
	private int maxima=10;
	
	/** The s. */
	private Object S[]= new Object [maxima];
	
	
	/**
	 * Instantiates a new stack estatica.
	 */
	public StackStatic() {
		super();
		this.t = t;
		this.maxima = maxima;
		S = S;
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		return (t<0);
	}
	
	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size () {
		return (t +1);
	}
	
	/**
	 * Top.
	 *
	 * @return the e
	 * @throws EmptyStackException the empty stack exception
	 */
	public E top() throws EmptyStackException {
		if (isEmpty()) {
			return (E) "La pila esta vacia";
		}
		return (E) S[t];
	}
	
	/**
	 * Push.
	 *
	 * @param element the element
	 */
	public void push (Object element) {
		if (t == maxima-1) {
			throw new StackOverflowError ("Error esta llena");
		}else {
			
			t= t+1;
			S[t]=element;
		}
	}
	
	/**
	 * Pop.
	 *
	 * @return the e
	 */
	public E pop() {
		Object element;
		if (isEmpty()) {
			return null;
		}else {
			
			 element=S[t];
			t=t-1;
		}
		return (E) element;
	}
	
	
	}

	

