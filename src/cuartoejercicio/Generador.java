package cuartoejercicio;

/**
 * Librer�as importadas
 */
import java.util.Scanner;

/**
 * Clase generador
 * 
 * @author javie
 *
 */
public class Generador {

	/** Creaci�n de un objeto de la clase Scanner **/
	Scanner S = new Scanner(System.in);

	/** Atributos **/
	int numeroInstancias;

	/**
	 * M�todo encargado de realizar la l�gica de la aplicaci�n
	 */
	public void instanciasYCadenas() {

		// Uso de un do while para controlar que el usuario no introduzca un n�mero
		// mayor a 10 tal y como se dice en el ejercicio
		do {
			System.out.println("Introduzca las instancias que quiera (Menor a 10) : ");
			numeroInstancias = S.nextInt();
		} while (numeroInstancias >= 10);

		// Iteramos
		for (int i = 0; i < numeroInstancias; i++) {

			// Mensaje al usuario
			System.out.println(" N�mero de cadenas a generar en la instancia " + i);
			int nuevoNumeroCadenas = S.nextInt();

			for (int j = 0; j < nuevoNumeroCadenas; j++) {

				// Instanciaci�n de un objeto de la clase cadenas
				Cadenas c = new Cadenas();

				// Llamada al m�todo
				c.conversionNumeroString();
			}

		}

	}

	/**
	 * M�todo main que se encargar� de ejecutar la aplicaci�n
	 * @param args
	 */
	public static void main(String[] args) {

		/** Creaci�n de un objeto de la clase Scanner **/
		Scanner S = new Scanner(System.in);
		
		/** Creaci�n de un objeto de la clase Generador **/
		Generador g = new Generador();

		/** Llamada al m�todo **/
		g.instanciasYCadenas();

	}

}
