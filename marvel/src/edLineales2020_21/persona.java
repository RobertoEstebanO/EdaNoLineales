package edLineales2020_21;

/**
 * The Class persona.
 */
public class persona implements Comparable<persona> {
	
	/** The nombre. */
	String nombre;
	 
 	/** The edad. */
 	int edad;
	
		/**
		 * Instantiates a new persona.
		 *
		 * @param nombre the nombre
		 * @param edad the edad
		 */
	public persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
		
		/**
		 * Gets the nombre.
		 *
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}
		
		/**
		 * Sets the nombre.
		 *
		 * @param nombre the new nombre
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		/**
		 * Gets the edad.
		 *
		 * @return the edad
		 */
		public int getEdad() {
			return edad;
		}
		
		/**
		 * Sets the edad.
		 *
		 * @param edad the new edad
		 */
		public void setEdad(int edad) {
			this.edad = edad;
		}


	/**
	 * Compare to.
	 *
	 * @param o the o
	 * @return the int
	 */
	public int compareTo(persona o) {
		int resultado=0;
		if(this.edad>o.edad) { 
			resultado = 1;
			toString();
			}
		else if (this.edad<o.edad) {
			resultado = -1;
			toString();
			}
		else {
			resultado=0;
			toString();
		}
		return resultado;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "persona [Nombre: " + nombre + ", Edad: " + edad + "]";
	}
	
	

}