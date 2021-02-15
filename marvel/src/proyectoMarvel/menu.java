package proyectoMarvel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import edLineales2020_21.*;
import graphsDSESIUCLM.Edge;
import graphsDSESIUCLM.Element;
import graphsDSESIUCLM.Graph;
import graphsDSESIUCLM.TreeMapGraph;
import graphsDSESIUCLM.Vertex;
/**
 * @author Roberto,Paula y Natalia
 */

// TODO: Auto-generated Javadoc
/**
 * The Class menu.
 */
public class menu {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		System.out.println(" ___   ___   ___         ___   ___   ___   ___               ___   ___         ___   ");     
		System.out.println(" |   | |   | |   |  | /  |     |       |   |   |       || /| |   | |   | |  /  |     |  ");   
		System.out.println(" |-+-  |-+-  |   |   +   |-+-  |       +   |   |       | + | |-+-| |-+-  | +   |-+-  |    "); 
		System.out.println(" |     |  |  |   |   |   |     |       |   |   |       |   | |   | |  |  |/    |     |     ");
		System.out.println("              ---         ---   ---         ---                                 ---   ---  ");
        Graph grafo = crearGrafo(LeerDatos());
        Scanner teclado= new Scanner(System.in);
        boolean seguir=true;
        try {
        do {
        	System.out.println();
        	System.out.println("Ingrese la opcion que desea realizar:");
        	System.out.println("1- Grafo e informacion");
        	System.out.println("2- Crear camino con 2 personajes");
        	System.out.println("3- Crear camino con 2 personajes limitado a 9 interaciones como máximo");
        	System.out.println("0- Cerrar programa");
        	
        	switch(teclado.next()) {
        	case "1":
        		imprimirGrafo(grafo);
        			break;
        	case "2":
        			caminoB(grafo);
        			
        			break;
        			
        	case "3":
  
    			caminoC(grafo);
    		
        			break;
        	case "0":
        		System.out.println("Adios!!");
        			System.exit(0);
        	}
        } while (seguir);
        } catch (ArrayIndexOutOfBoundsException e) {
        	System.out.println("Opcion no validad, Ingrese una opcion del menu:");
        	teclado.reset();
        }

	
	}


	/**
	 * Metodo Resetear grafo. Pone el estado Visitado de todos los elementos a False
	 *
	 * @param grafo the grafo
	 * 
	 */
	private static void resetearGrafo(Graph grafo) {
		Iterator<Vertex> it;
		it=grafo.getVertices();
		Vertex<DecoratedElement> R;
		//bucle para ir poniendo todo los visited de los elementos en false
		while(it.hasNext()) {
			R=it.next();
			R.getElement().setVisited(false);
		}
		
	}


	/**
	 * Camino C. Metodo del apartado C, pide dos personajes
	 *
	 * @param gr the gr
	 * @param  
	 * @throws IOException 
	 */
	private static void caminoC(Graph gr) throws IOException {
		 Scanner teclado= new Scanner(System.in);
			System.out.println("Escribe el nombre del primer personaje: ");
			String personaje1=teclado.nextLine();
			//teclado.nextLine();
			System.out.println("Escribe el nombre del segundo personaje: ");
			String personaje2=teclado.nextLine();
		
		
		DecoratedElement startNode, endNode, nx;
	    boolean bool1 = true, bool2 = true, noPath;
	    resetearGrafo(gr);
	    Vertex<DecoratedElement> aux, s = null, t = null;
	    Vertex [] v;
	    Stack<Edge> p1 = new Stack(), p2 = new Stack();
	    Iterator<Vertex<DecoratedElement>> it;
	    int peso = 0;
	
	    startNode = new DecoratedElement(personaje1,personaje1);
	    endNode = new DecoratedElement(personaje2,personaje2);

	    it = gr.getVertices();
	    while (it.hasNext() && (bool1 || bool2)) {
	      aux = it.next();
	      nx = aux.getElement();
	      if (nx.equals(startNode)) {
	       s = aux;
	       bool1 = false;
	      }
	      if (nx.equals(endNode)) {
	        t = aux;
	        bool2 = false;
	      }
	    }
	    if (!(bool1 || bool2)){
	      noPath = pathDFS(gr, s, t, p1,peso);
	      if (!noPath) {
	        while (!p1.isEmpty()){
	          p2.push(p1.pop());
	        }
	        System.out.println("\nCamino:");
	        while (!p2.isEmpty()) {
	          v = gr.endVertices(p2.pop());
	          System.out.print(v[0].getElement().toString() + "-");
	          System.out.println(v[1].getElement().toString() + ".");
	         
	        }
	      } else {
	        System.out.println("\nNo hay camino entre los dos personajes");
	      }
	    }
	    else {
	      System.out.println("\nAl menos uno de los personajes no existe");
	    }
	  }


	/**
	 * Path DFS.
	 *
	 * @param g the grafo
	 * @param v the Vertice1
	 * @param z the Vertice 2
	 * @param sp hace referencia a la arista del Stack
	 * @param peso the peso
	 * @return true, si esta correcto todo
	 */
	private static boolean pathDFS(Graph g, Vertex<DecoratedElement> v, Vertex<DecoratedElement> z, Stack<Edge> sp,int peso) {
		boolean noEnd = !v.equals(z);
	    Edge<DecoratedElement>e;
	    Iterator<Edge<DecoratedElement>> it;
	    Vertex<DecoratedElement> w;
	    v.getElement().setVisited(true);
	  
	    it = g.incidentEdges(v);
	    while (it.hasNext() && noEnd) {
	      e = it.next();
	      peso=peso + ((Integer) e.getElement().getElement());
	      if(peso>9) {
	    	  noEnd=false;
	      }
	      w = g.opposite(v, e);
	      if (!w.getElement().getVisited()) {
	        sp.push(e);
	        noEnd = pathDFS(g, w, z, sp,peso);
	        if (noEnd)
	          sp.pop();
	        
	      }
	    }
		return false;
	}


	/**
	 * Camino B.
	 *
	 * @param gr hace referencia al grafo
	 */
	private static void caminoB(Graph gr) {
		 Scanner teclado= new Scanner(System.in);
		System.out.println("Escribe el nombre del primer personaje: ");
		String personaje1=teclado.nextLine();
		//teclado.nextLine();
		System.out.println("Escribe el nombre del segundo personaje: ");
		String personaje2=teclado.nextLine();
		    DecoratedElement startNode, endNode, nx, node = null;
		    boolean bool1 = true, bool2 = true;
		    resetearGrafo(gr);
		    int size;
		    Vertex<DecoratedElement> aux, s = null, t = null;
		    edLineales2020_21.Stack  sp = new StackStatic();
		    Iterator<Vertex<DecoratedElement>> it;
			
		    // añadimos Personaje 1 y personaje 2
		    startNode = new DecoratedElement(personaje1, personaje1);
		    endNode = new DecoratedElement(personaje2, personaje2);

		    it = gr.getVertices();
		    while (it.hasNext() && (bool1 || bool2)) {
		      aux = it.next();
		      nx = aux.getElement();
		      if (nx.equals(startNode)) {
		       s = aux;
		       bool1 = false;
		      }
		      if (nx.equals(endNode)) {
		        t = aux;
		        bool2 = false;
		      }
		    }
		    if (!(bool1 || bool2)) {
		      node = pathBFS(gr, s, t);

		      // recorrer los nodos e imprimir el camino

		      if (node.getParent() == null) {
		        System.out.println("\nTNo hay camino posible.");
		      } else {
		        System.out.println("\nEl Camino es: ");
		        while (node.getParent() != null) {
		          sp.push(node);
		          node = node.getParent();
		        }
		        sp.push(node);

		        size = sp.size();
		        for (int i = 0; i<size-1; i++){
		          node = (DecoratedElement) sp.pop();
		          System.out.print(node.getElement().toString() + "("
		                      + node.getDistance() + ")" + "-");
		        }
		        node = (DecoratedElement) sp.pop();
		        System.out.print(node.getElement().toString() + "("
		                      + node.getDistance() + ")");
		      }
		    }
		    else {
		      System.out.println("\nAl menos uno de los personajes no está en el Grafo");
		    }
		  }
	
	/**
	 * Path BFS.
	 *
	 * @param g referencia al grafo
	 * @param s referencia al vertice 1
	 * @param t referencia al vertice 2
	 * @return the decorated element
	 */
	public static DecoratedElement pathBFS(Graph g, Vertex<DecoratedElement> s, Vertex<DecoratedElement> t) {
			Queue<Vertex<DecoratedElement>> q = new LinkedList();
			boolean noEnd = true;
			Vertex<DecoratedElement> u, v = null;
			Edge e;
			Iterator<Edge> it;

			s.getElement().setVisited(true);
			q.offer(s);
			while (!q.isEmpty() && noEnd) {
				u = q.poll();
				it = g.incidentEdges(u);
					while (it.hasNext() && noEnd) {
							e = it.next();
							v = g.opposite(u, e);
							if (!(v.getElement()).getVisited()) {
								(v.getElement()).setVisited(true);
								(v.getElement()).setParent(u.getElement());
								(v.getElement()).setDistance(((u.getElement()).getDistance()) + 1);
								q.offer(v);
								noEnd = !(v.getElement().equals(t.getElement()));
								}
					}
			}
			if (noEnd)
				v.getElement().setParent(null);
			return v.getElement();
	}


	/**
	 * Crear grafo.
	 *
	 * @param data the data
	 * @return el grafo
	 */
	@SuppressWarnings("unchecked")
	public static Graph crearGrafo (String [][] data) {
		int j = 0;
		Graph grafo = new TreeMapGraph  ();
		Element <String> element1;
		Element <String> element2;
		Element <Integer> peso;

		for (int i = 1; i < data.length; i++) {
			element1 = new DecoratedElement<String>(data[i][0], data[i][0]);
			element2 = new DecoratedElement<String>(data[i][1], data[i][1]);
			peso = new DecoratedElement <Integer> (String.valueOf(j++), Integer.parseInt(data[i][2]));
			grafo.insertEdge(element1, element2, peso);
		
			
		}
		return grafo;
		
	}

	/**
	 * Imprimir grafo.
	 *
	 * @param grafo the grafo
	 */
	private static void imprimirGrafo(Graph grafo) {
		System.out.println("Creaccion de Grafo en proceso...");
		Iterator<Vertex> e2 = grafo.getVertices();
		int Maximo=0, Minimo=0;
		StackStatic<DecoratedElement<Personaje>> StackMin= new StackStatic<DecoratedElement<Personaje>>();
		StackStatic<DecoratedElement<Personaje>> StackMax= new StackStatic<DecoratedElement<Personaje>>();
		while(e2.hasNext()) {
			Vertex vertice=e2.next();
			int aristas= vertice.getList().size();
			if(aristas >=Maximo) {
				if(StackMax.isEmpty()) {
					StackMax.push((DecoratedElement<Personaje>) vertice.getElement());
					Maximo=aristas;
				}
				else {
					if(aristas==Maximo) {
						StackMax.push((DecoratedElement<Personaje>) vertice.getElement());
					}
					else {
					while(!StackMax.isEmpty()) {
						StackMax.pop();
					}
					StackMax.push((DecoratedElement<Personaje>) vertice.getElement());
					Maximo=aristas;
					}
				}
			}
		}
		e2 = grafo.getVertices();
		while(e2.hasNext()) {
			Vertex vertice=e2.next();
			int aristas= vertice.getList().size();
			if(StackMin.isEmpty()) {
				StackMin.push((DecoratedElement<Personaje>) vertice.getElement());
				Minimo=aristas;
			}else {
				if(aristas<=Minimo) {
					if(aristas==Minimo) {
						StackMin.push((DecoratedElement<Personaje>) vertice.getElement());
					}else {
						while(!StackMin.isEmpty()) {
							StackMin.pop();
						}
						StackMin.push((DecoratedElement<Personaje>) vertice.getElement());
						Minimo=aristas;
					}
				}
			}
		}
		
		System.out.println("Numero de Personajes totales:\n"+grafo.getN());
		System.out.println("Numero de Relaciones en todo el grafo:\n"+grafo.getM());
		
		while(!StackMax.isEmpty()) {
			DecoratedElement aux = StackMax.pop();
			System.out.println("El personaje mas popular es:\n" +aux.toString()+ " con " + Maximo+" relaciones totales");
		}
		while(!StackMin.isEmpty()) {
			DecoratedElement aux2 = StackMin.pop();
			System.out.println("El personaje menos popular es:\n" +aux2.toString()+ " con " + Minimo+" relaciones totales");
		}
	}

	/**
	 * Leer datos.
	 *
	 * @return the string[][]
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private static String [][] LeerDatos() throws IOException {
		leerFichero datos= new leerFichero("C:/Users/Roberto/eclipse-workspace/Eda/src/proyectoMarvel/nuevo/marvel-unimodal-edges.csv");
		String [][] datosLeidos = datos.getResultado();
		return datosLeidos;
	}
}