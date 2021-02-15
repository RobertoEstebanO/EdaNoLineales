package proyectoMarvel;

import graphsDSESIUCLM.*;

/**
 * The Class DecoratedElement.
 *
 * @param <T> the generic type
 */
public class DecoratedElement<T> implements Element,Edge{

  /** The id. */
  private String ID;                 //Vertex ID
  
  /** The element. */
  private T element;                 //Data Element
  
  /** The visited. */
  private boolean visited;          //Attribute to label the node as visited
  
  /** The parent. */
  private DecoratedElement<T> parent; // Vertex from which
                                                
                                                /** The distance. */
                                                // the current node is accessed
  private int distance;    // Distance (in vertices) from the original node

  /**
   * Instantiates a new decorated element.
   *
   * @param key the key
   * @param element the element
   */
  public DecoratedElement(String key, T element) {
    this.element = element;
    ID = key;
    visited = false;
    parent = null;
    distance = 0;
  }

  /**
   * Gets the element.
   *
   * @return the element
   */
  public T getElement() {
    return element;
  }
  
  /**
   * Gets the visited.
   *
   * @return the visited
   */
  public boolean getVisited() {
    return visited;
  }
  
  /**
   * Sets the visited.
   *
   * @param t the new visited
   */
  public void setVisited(boolean t) {
    visited = t;
  }
  
  /**
   * Gets the parent.
   *
   * @return the parent
   */
  public DecoratedElement<T> getParent() {
    return parent;
  }
  
  /**
   * Sets the parent.
   *
   * @param u the new parent
   */
  public void setParent(DecoratedElement<T> u) {
    parent = u;
  }
  
  /**
   * Gets the distance.
   *
   * @return the distance
   */
  public int getDistance() {
    return distance;
  }
  
  /**
   * Sets the distance.
   *
   * @param d the new distance
   */
  public void setDistance(int d) {
    distance = d;
  }

  /**
   * Equals.
   *
   * @param n the n
   * @return true, if successful
   */
  /* In this case, to check if two Vertices are identical, both the key and the
   * element must be equal.
   * Notice the cast to convert n (class Object) to class
   * DecoratedElement<T>
   * IMPORTANT: element needs to override equals()
  */
  public boolean equals (Object n) {
    return (ID.equals(((DecoratedElement) n).getID())
       && element.equals(((DecoratedElement<T>) n).getElement()));
  }
  
  /**
   * To string.
   *
   * @return the string
   */
  public String toString() {
    return element.toString();   //element needs to override toString()
  }
  
  /**
   * Gets the id.
   *
   * @return the id
   */
  public String getID() {
    return ID;
  }
}
