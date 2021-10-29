package cuartoejercicio;

/**
 * Librer�as importadas
 */
import java.util.Scanner;

/**
 * Clase frecuencia
 * 
 * @author javie
 *
 */
public class Frecuencia {

	/** Instanciaci�n de un objeto de la clase Scanner **/
	Scanner S = new Scanner(System.in);

	/** Atributos **/
	private String palabra;
	private int contador1 = 0;
	private int contador2 = 0;
	private int contador3 = 0;
	private int contador4 = 0;
	private int contador5 = 0;

	/** M�todo encargado de realizar la l�gica de la aplicaci�n **/
	public void frase(String palabra) {

		// Establecimiento de condiciones para ir contando el n�mero de vocales que
		// aparece en la palabra
		palabra = palabra.toLowerCase();
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) == 'a') {
				contador1++;
			} else if (palabra.charAt(i) == 'e') {
				contador2++;
			} else if (palabra.charAt(i) == 'i') {
				contador3++;
			} else if (palabra.charAt(i) == 'o') {
				contador4++;
			} else if (palabra.charAt(i) == 'u') {
				contador5++;
			}

		}

		// Mostramos el n�mero de veces que ha aparecido cada vocal
		System.out.println(contador1 + " " + contador2 + " " + contador3 + " " + contador4 + " " + contador5 + " ");

	}

	/**
	 * M�todo main que se encargar� de ejecutar la aplicaci�n
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/** Creaci�n de un objeto de la clase Scanner **/
		Scanner S = new Scanner(System.in);

		/** Creaci�n de un objeto de la clase Frecuencia **/
		Frecuencia f = new Frecuencia();

		/** Mensaje para que el usuario interactue con la aplicaci�n **/
		System.out.println("PALABRA : ");
		String palabra = S.nextLine();

		/** Mostramos la palabra **/
		System.out.println(palabra);

		/** Llamada al m�todo recibiendo la palabra introducida por el usuario **/
		f.frase(palabra);

	}

}
