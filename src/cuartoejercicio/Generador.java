package cuartoejercicio;

/**
 * Librerías importadas
 */
import java.util.Scanner;

/**
 * Clase generador
 * 
 * @author javie
 *
 */
public class Generador {

	/** Creación de un objeto de la clase Scanner **/
	Scanner S = new Scanner(System.in);

	/** Atributos **/
	int numeroInstancias;

	/**
	 * Método encargado de realizar la lógica de la aplicación
	 */
	public void instanciasYCadenas() {

		// Uso de un do while para controlar que el usuario no introduzca un número
		// mayor a 10 tal y como se dice en el ejercicio
		do {
			System.out.println("Introduzca las instancias que quiera (Menor a 10) : ");
			numeroInstancias = S.nextInt();
		} while (numeroInstancias >= 10);

		// Iteramos
		for (int i = 0; i < numeroInstancias; i++) {

			// Mensaje al usuario
			System.out.println(" Número de cadenas a generar en la instancia " + i);
			int nuevoNumeroCadenas = S.nextInt();

			for (int j = 0; j < nuevoNumeroCadenas; j++) {

				// Instanciación de un objeto de la clase cadenas
				Cadenas c = new Cadenas();

				// Llamada al método
				c.conversionNumeroString();
			}

		}

	}

	/**
	 * Método main que se encargará de ejecutar la aplicación
	 * @param args
	 */
	public static void main(String[] args) {

		/** Creación de un objeto de la clase Scanner **/
		Scanner S = new Scanner(System.in);
		
		/** Creación de un objeto de la clase Generador **/
		Generador g = new Generador();

		/** Llamada al método **/
		g.instanciasYCadenas();

	}

}
