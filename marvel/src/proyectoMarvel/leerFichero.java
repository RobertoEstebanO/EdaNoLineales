package proyectoMarvel;
import java.io.*;
import java.util.Scanner;
import graphsDSESIUCLM.*;
/**
 * @author Roberto,Paula  y Natalia
 */

/**
 * The Class leerFichero.
 */
public class leerFichero {
	
		/** The resultado. */
		String [] [] resultado; //matrices para datos
		
		/** The nfichero. */
		String nfichero;
		
	/**
	 * Instantiates a new leer fichero.
	 *
	 * @param nfichero the nfichero
	 */
	public leerFichero(String nfichero) {
		this.nfichero=nfichero;
		resultado= new String[9892][3];
	}
	
	/**
	 * Gets the resultado.
	 *
	 * @return the resultado
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public String [] [] getResultado () throws IOException{
		File fichero = new File(nfichero);
		Scanner lectura = null;
		
		try {
			int i=0;
			lectura=new Scanner(fichero);
			while(lectura.hasNext()) {
				String aux= lectura.nextLine();
				String [] aux2 = aux.split(",");
				resultado [i] =aux2;
				i++;
			}
		}catch (IOException e) {
			e.getStackTrace();
		}
		lectura.close();
		return resultado;
	}

}
