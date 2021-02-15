package edLineales2020_21;

/**
 * The Interface List.
 */
public interface List <E> {
	
	/**
	 * Adds the.
	 *
	 * @param <T> the generic type
	 * @param element the element
	 * @throws FullListException the full list exception
	 */
	public <T> void add (T element) throws FullListException;
	
	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 * @throws EmptyListException the empty list exception
	 */
	public boolean isEmpty() throws EmptyListException;
	
	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size();
	
	/**
	 * Exists.
	 *
	 * @param <T> the generic type
	 * @param element the element
	 * @return true, if successful
	 */
	public <T> boolean exists(T element);
	
	/**
	 * Gets the.
	 *
	 * @param <T> the generic type
	 * @param n the n
	 * @return the t
	 * @throws IndexOutOfBoundsException the index out of bounds exception
	 */
	public <T> T get (int n) throws IndexOutOfBoundsException;
	
	/**
	 * Put.
	 *
	 * @param <T> the generic type
	 * @param element the element
	 * @param n the n
	 * @throws IndexOutOfBoundsException the index out of bounds exception
	 */
	public <T> void put (T element, int n) throws IndexOutOfBoundsException;
	
	/**
	 * Removes the.
	 *
	 * @param <T> the generic type
	 * @param n the n
	 * @return the t
	 * @throws IndexOutOfBoundsException the index out of bounds exception
	 */
	public <T> T remove (int n)throws IndexOutOfBoundsException;
	
	/**
	 * Locate.
	 *
	 * @param <T> the generic type
	 * @param element the element
	 * @return the int
	 */
	public <T> int locate (T element);
	
/**
 * The Class EmptyListException.
 */
public class EmptyListException extends RuntimeException{
		
		/**
		 * Instantiates a new empty list exception.
		 *
		 * @param err the err
		 */
		public EmptyListException (String err) {
			super("La Lista esta vacia");
		}
		
	}

/**
 * The Class FullListException.
 */
public class FullListException extends RuntimeException{
	
	/**
	 * Instantiates a new full list exception.
	 *
	 * @param err the err
	 */
	public FullListException (String err) {
		super("La Lista esta Llena");
	}
}
}


