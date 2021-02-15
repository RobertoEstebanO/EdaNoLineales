package edLineales2020_21;

import java.lang.reflect.Array;
import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class ListStatic.
 *
 * @param <T> the generic type
 * @param <E>
 */
public class ListStatic<T extends Comparable <T>, E>implements List <E>{

/** The t. */
int t=-1;

/** The n. */
int N=10;

/** The l. */
T [] L ;

	/**
	 * Instantiates a new list static.
	 *
	 * @param class1 the class 1
	 */
	public ListStatic(Class<persona[]> class1) {

	  L = (T[]) class1.cast(Array.newInstance (class1.getComponentType(), N));
}

	/**
	 * Adds the.
	 *
	 * @param <E> the element type
	 * @param element the element
	 */
	public <E> void add(E element) {
		if(t==N-1) {
			System.out.println("error");
		}else {
			t=t+1;
			L[t]=(T) element;
		}
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty(si t es menor a 0)
	 */
	@Override
	public boolean isEmpty() {
		return t<0;
	}

	/**
	 * Size.
	 *
	 * @return the int (el tamanio)
	 */
	@Override
	public int size() {
		return t+1;
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
		boolean match = false;
		if (!isEmpty()) {
			for (int i=0; i<=t && !match; i=i+1) {
				int match2=((Comparable<T>) L[i]).compareTo(element);
				if (match2>0) {
					match=true;
				}else if(match2<0){
					match=false;
				}
			}
		}
		return match;
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
		if(isEmpty()) {
			return null;
		}else {
			if (n<0 || n>t) {
				return null;
			}else {
				return (T) L[n];
			}
		}
	}

	/**
	 * Put.
	 *
	 * @param <E> the element type
	 * @param element the element
	 * @param n the n
	 */
	@Override
	public <E> void put(E element, int n) {
		if (t==N-1) {
			System.out.println("Error1");
		}else {
			t=t+1;
			if(n<0 || n>t) {
				System.out.println("Error2");
				System.out.println(n);
				System.out.println(t);
			}else {
				t=t+1;
				for(int j=t;j==n+1;j=j-1) {
					L[j]=L[j-1];
				}
				L[n]=(T) element;
			}
		}
		
	}

	/**
	 * Removes the.
	 *
	 * @param <T> the generic type
	 * @param i the i
	 * @return the t
	 */
	@Override
	public <T> T remove(int i) {
		if (isEmpty()) {
			return null;
		}else {
			if (i<0 || i>t) {
				return null;
			}else {
				for(int j=i;j==t;) {
					L[j]=L[j+1];
				}
				t=t-1;
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
		if(isEmpty()) {
			System.out.println("error");
		}else {
			for (int j=0; j<=t && i==-1; j=j+1) {
				if (L[j]==element) {
					i=j;
					//i++; //Para que empiece la numeracion desde 1,2,3....10
					System.out.println(L[i]);
				}
			}
		}
		return i;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	/*@Override
	public String toString() {
		return "\nt=" + t + ", \nN=" + N + ", \nLista Completa=" + Arrays.toString(L) + ", \nEl tamaño de la lista es =" + size() + "]";
	}*/
	@Override
	public String toString() {
		if(isEmpty()) {
			return "La Lista esta vacia";
			
		} else {
			String cadena = "";
			for (int i = 0; i < L.length; i++) {
				if (L[i] != null) {
					cadena += L[i] + "\n";
				}
			}
			return cadena;
		}
	}
 
    }
	
	
	 


