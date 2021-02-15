package edLineales2020_21;

import graphsDSESIUCLM.Vertex;
import proyectoMarvel.DecoratedElement;

/**
 * The Interface Queue.
 *
 * @param <T> the generic type
 */
public interface Queue <T> {

	/**
	 * Enqueue.
	 *
	 * @param element the element
	 * @throws FullQueueException the full queue exception
	 */
	public void enqueue ( T element) throws FullQueueException; ;
	
	/**
	 * Dequeue.
	 *
	 * @return the t
	 * @throws EmptyQueueException the empty queue exception
	 */
	public T dequeue () throws EmptyQueueException;
	
	/**
	 * Front.
	 *
	 * @return the t
	 * @throws EmptyQueueException the empty queue exception
	 */
	public T front() throws EmptyQueueException;
	
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
	 * The Class EmptyQueueException.
	 */
	public class EmptyQueueException extends RuntimeException{
		
		/**
		 * Instantiates a new empty queue exception.
		 *
		 * @param err the err
		 */
		public EmptyQueueException (String err) {
			super("La cola esta vacia");
		}
	}
	
	/**
	 * The Class FullQueueException.
	 */
	public class FullQueueException extends RuntimeException{
		
		/**
		 * Instantiates a new full queue exception.
		 *
		 * @param err the err
		 */
		public FullQueueException (String err) {
			super("La cola esta llena");
		}
	}

	public void offer(Vertex<DecoratedElement> s);

	public Vertex<DecoratedElement> poll();
}
