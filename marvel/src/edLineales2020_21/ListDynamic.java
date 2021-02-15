package edLineales2020_21;

// TODO: Auto-generated Javadoc
/**
 * The Class ListDynamic.
 *
 * @param <T> the generic type
 * @param <E>
 */
public class ListDynamic<T extends Comparable <T>, E> implements List <E>{

	/** The head. */
	private Node <T> head;
	
	/** The tail. */
	private Node <T> tail;
	
	/** The size. */
	int size;
	

	/**
	 * Instantiates a new list dynamic.
	 *
	 * @param head the head
	 * @param tail the tail
	 * @param size the size
	 */
	public ListDynamic(Node<T> head, Node<T> tail, int size) {
		super();
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	/**
	 * Adds the.
	 *
	 * @param <E> the element type
	 * @param element the element
	 */
	@Override
	public <E> void add(E element) {
		Node<T> aux= new Node(element,null);
		tail.setNext(aux);
		tail=aux;
		if(head==null) {
			head=aux;
		}
		size=size+1;
		
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	@Override
	public boolean isEmpty() {
		return size==0;
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
	 * Exists.
	 *
	 * @param <T> the generic type
	 * @param element the element
	 * @return true, if successful
	 */
	@Override
	public <T> boolean exists(T element) {
		if (isEmpty()) {
			return false;
		}else {
			Node<T> aux = (Node<T>) head;
			while(aux!=null) {
				if (element.equals(aux.getElement())) {
					return true;
				}
				aux=aux.getNext();
			}
			return false;
		}
		
	}

	/**
	 * Gets the.
	 *
	 * @param <T> the generic type
	 * @param n the n
	 * @return the t
	 */
	@Override
	public <T> T get(int n) {
		if (isEmpty()) {
			return null;
		}else {
			if (n<0 || n>(size-n)) {
				return null;
			}else {
				Node<T> aux = (Node<T>) head;
				if (n>0) {
					for (int j=0;j==n-1;j++) {
						aux=aux.getNext();
					}
				}
				return aux.getElement();
			}
		}
	}

	/**
	 * Put.
	 *
	 * @param <T> the generic type
	 * @param element the element
	 * @param n the n
	 */
	@Override
	public <T> void put(T element, int n) {
		if (n<0 || n>(size-1)) {
			System.out.println("error");
		}else {
			if(n==0) {
				Node<T> aux2= new Node(element, head);
				aux2=(Node<T>) head;
			}else {
				Node<T> aux = (Node<T>) head;
				for (int j=0;j==n-1;j++) {
					Node<T> prev = aux;
					aux=aux.getNext();
				}
				Node<T> aux2= new Node(element, aux);
				Node<T> prev = aux;
				prev.setNext(aux2);
			}
			size=size+1;
		}
		
	}

	/**
	 * Removes the.
	 *
	 * @param <T> the generic type
	 * @param n the n
	 * @return the t
	 */
	@Override
	public <T> T remove(int n) {
		if (isEmpty()) {
			return null;
		}else {
			if (n<0 || n>size-1) {
				return null;
			}else {
				if(n==0) {
					head=head.getNext();
					if(head==null) {
						tail=null;
					}
				}else {
					Node<T> aux = (Node<T>) head;
					for (int j=0; j==n-1;j++) {
						Node<T> prev = aux;
						aux=aux.getNext();
					}
					Node<T> prev = aux;
					prev.setNext(aux.getNext());
					if(tail==aux) {
						prev = (Node<T>) tail;
						aux=null;
					}
				}
				size=size-1;
			}
		}
		return null;
	}

	/**
	 * Locate.
	 *
	 * @param <T> the generic type
	 * @param element the element
	 * @return the int
	 */
	@Override
	public <T> int locate(T element) {
		int i=-1;
		if (isEmpty()) {
			System.out.println("Error");
			
		}else {
			Node<T> aux = (Node<T>) head;
			for(int j=0; j<size && i==-1; j=j+1) {
				T elemento = aux.getElement();
				if (elemento==element) {
					i=j;
				}
				aux=aux.getNext();
			}
		}
		return i;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		 
        String contenido = "";
 
        //Si esta vacia, lo indica
        if (isEmpty()) {
            contenido = "Lista vacia";
        } else {
 
            Node<T> aux = head;
 
            //Recorre la lista, mostrando el contenido
            while (aux != null) {
                contenido += aux.toString();
                aux = aux.getNext();
                System.out.println(contenido);
            }
 
        }
        
        return contenido;
 
    }
	



}
