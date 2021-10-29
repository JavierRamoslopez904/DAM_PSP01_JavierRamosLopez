package cuartoejercicio;

/**
 * Librerías necesarias
 */
import java.util.Random;

/**
 * Clase cadenas que contendrá la lógica de la aplicación
 * 
 * @author javie
 *
 */
public class Cadenas {

	/** Instanciación de un objeto de la clase Scanner **/
	Random r = new Random();

	/** Atributos **/
	int numeroCadenas;
	int firstAleatoryNumber;
	int aleatoryNumbers;
	char newAleatoryCharacters;
	String cadena;

	/**
	 * Método encargado de convertir números aleatorios en una cadena de caracteres
	 */
	public void conversionNumeroString() {
			// Creación de un número aleatorio (1-20)
			firstAleatoryNumber = (int) (Math.random() * 20);

			// For para iterar el número aleatorio obtenido anteriormente,
			// que será la longitud aleatoria, entre 1 y 20
			for (int j = 0; j < firstAleatoryNumber; j++) {

				// Creación de los números aleatorios que vamos a convertir
				// a texto
				aleatoryNumbers = (int) (Math.random() * (90 - 65 + 1) + 65);

				// Casteamos el número generado aleatoriamente a char
				newAleatoryCharacters = (char) aleatoryNumbers;

				// Casteamos a String
				cadena = String.valueOf(newAleatoryCharacters);

				System.out.print(cadena);

			}
			System.out.print("\n");

		}

	

	/** Métodos Getters y Setters **/

	public int getNumeroCadenas() {
		return numeroCadenas;
	}

	public void setNumeroCadenas(int numeroCadenas) {
		this.numeroCadenas = numeroCadenas;
	}

	public char getNewAleatoryCharacters() {
		return newAleatoryCharacters;
	}

	public void setNewAleatoryCharacters(char newAleatoryCharacters) {
		this.newAleatoryCharacters = newAleatoryCharacters;
	}

	/**
	 * Método main que se encargará de ejecutar la aplicación
	 * @param args
	 */
	public static void main(String[] args) {
		
		/** Creación de un objeto de la clase Cadenas **/
		Cadenas c = new Cadenas();

		/** Llamada al método de la clase Cadenas **/
		c.conversionNumeroString();

	}
}
