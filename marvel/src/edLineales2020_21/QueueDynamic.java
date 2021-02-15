package edLineales2020_21;

import graphsDSESIUCLM.Vertex;
import proyectoMarvel.DecoratedElement;

/**
 * The Class QueueDynamic.
 *
 * @param <E> the element type
 */
public class QueueDynamic<E>  implements Queue <E>{

	/** The front. */
	private Node <E> front;
	
	/** The rear. */
	private Node <E> rear;
	
	/** The size. */
	int size=0;
	
	/**
	 * Instantiates a new queue dinamica.
	 *
	 * @param front the front
	 * @param rear the rear
	 * @param size the size
	 */
	public QueueDynamic(Node<E> front, Node<E> rear, int size) {
		super();
		this.front = front;
		this.rear = rear;
		this.size = size;
	}

	/**
	 * Enqueue.
	 *
	 * @param element the element
	 */
	@Override
	public  void enqueue(E element) {
		Node<E> aux= new Node(element,null);
		if (isEmpty()) {
			front=aux;
			rear=aux;
			
		}
		else {
			if (size() == 1) {
				front.setNext(aux);
			}else {
				rear.setNext(aux);
			}
			rear=aux;
		}
		size++;
		return;
		
	}

	/**
	 * Dequeue.
	 *
	 * @return the e
	 */
	@Override
	public E dequeue() {
		if (isEmpty()) {
		return null;
		}
		E element = front.getElement();
		Node<E> aux = front.getNext();
		front=null;
		
		front=aux;
		size--;
	
	if (isEmpty()) {
		rear=null;
	}
	
	return element;
	}


	/**
	 * Front.
	 *
	 * @return the e
	 */
	@Override
	public E front() {
		if (isEmpty()) {
		return null;
	}
		else {
			
			return front.getElement();
		}
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	@Override
	public boolean isEmpty() {
		if (size== 0) {
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
			return "La lista esta vacia";
			
		}else {
			String cadena ="";
			Node<E> aux =front;
			while (aux != null) {
				cadena += aux;
				aux=aux.getNext();
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
