package edLineales2020_21;

import java.util.EmptyStackException;

// TODO: Auto-generated Javadoc
/**
 * The Interface Stack.
 *
 * @param <T> the generic type
 */
public interface Stack <T> {

	/**
	 * Push.
	 *
	 * @param element the element
	 * @throws FullStackException the full stack exception
	 */
	public void push (T element) throws FullStackException;
	
	/**
	 * Pop.
	 *
	 * @return the t
	 * @throws EmptyStackException the empty stack exception
	 */
	public T pop() throws EmptyStackException;
	
	/**
	 * Top.
	 *
	 * @return the t
	 * @throws EmptyStackException the empty stack exception
	 */
	public T top() throws EmptyStackException;
	
	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty();
	
	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size();
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString();
	
/**
 * The Class FullStackException.
 */
public class FullStackException extends RuntimeException{
		
		/**
		 * Instantiates a new full stack exception.
		 *
		 * @param err the err
		 */
		public FullStackException (String err) {
			super("La pila esta llena");
		}
	}
}
