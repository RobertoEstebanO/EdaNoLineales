package edLineales2020_21;

import graphsDSESIUCLM.Vertex;
import proyectoMarvel.DecoratedElement;

// TODO: Auto-generated Javadoc
/**
 * The Class QueueStatic.
 *
 * @param <E> the element type
 */
public class QueueStatic <E> implements Queue <E>{

	/** The size. */
	int size=0;
	
	/** The f. */
	int f=0;
	
	/** The n. */
	int N=10;
	
	/** The queue. */
	E [] queue = (E[]) new Object [N];
	
	/**
	 * Enqueue.
	 *
	 * @param element the element
	 */
	@Override
	public void enqueue(E element) {
		if (size == N) {
			System.out.println("Error");
		}else {
			int r=(f + size) % N;
			queue[r]= element;
			size= size+1;
		}
		
	}

	/**
	 * Dequeue.
	 *
	 * @return the e
	 * @throws EmptyQueueException the empty queue exception
	 */
	@Override
	public E dequeue() throws EmptyQueueException {
		if (isEmpty()) {
			return null;
		}else {
			E element = null;
			 element =queue[f];
			f= (f+1) % N;
			size= size -1;
			return element;
		}
	}

	/**
	 * Front.
	 *
	 * @return the e
	 * @throws EmptyQueueException the empty queue exception
	 */
	@Override
	public E front() throws EmptyQueueException {
		if (isEmpty()) {
			return null;
		}else {
			return queue[f];
		}
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	@Override
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	/**
	 * Size.
	 *
	 * @return the int
	 */
	@Override
	public int size() {
		
		return size;
	}
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		if(isEmpty()) {
			return "La cola esta vacia";
			
		} else {
			String cadena = "";
			for (int i = f; i < queue.length; i++) {
				if (queue[i] != null) {
					cadena += queue[i] + "\n";
				}
			}
			return cadena;
		}
	}

	@Override
	public void offer(Vertex<DecoratedElement> s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vertex<DecoratedElement> poll() {
		// TODO Auto-generated method stub
		return null;
	}
}
