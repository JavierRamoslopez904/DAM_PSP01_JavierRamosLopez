package cuartoejercicio;

/**
 * Librer�as necesarias
 */
import java.util.Random;

/**
 * Clase cadenas que contendr� la l�gica de la aplicaci�n
 * 
 * @author javie
 *
 */
public class Cadenas {

	/** Instanciaci�n de un objeto de la clase Scanner **/
	Random r = new Random();

	/** Atributos **/
	int numeroCadenas;
	int firstAleatoryNumber;
	int aleatoryNumbers;
	char newAleatoryCharacters;
	String cadena;

	/**
	 * M�todo encargado de convertir n�meros aleatorios en una cadena de caracteres
	 */
	public void conversionNumeroString() {
			// Creaci�n de un n�mero aleatorio (1-20)
			firstAleatoryNumber = (int) (Math.random() * 20);

			// For para iterar el n�mero aleatorio obtenido anteriormente,
			// que ser� la longitud aleatoria, entre 1 y 20
			for (int j = 0; j < firstAleatoryNumber; j++) {

				// Creaci�n de los n�meros aleatorios que vamos a convertir
				// a texto
				aleatoryNumbers = (int) (Math.random() * (90 - 65 + 1) + 65);

				// Casteamos el n�mero generado aleatoriamente a char
				newAleatoryCharacters = (char) aleatoryNumbers;

				// Casteamos a String
				cadena = String.valueOf(newAleatoryCharacters);

				System.out.print(cadena);

			}
			System.out.print("\n");

		}

	

	/** M�todos Getters y Setters **/

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
	 * M�todo main que se encargar� de ejecutar la aplicaci�n
	 * @param args
	 */
	public static void main(String[] args) {
		
		/** Creaci�n de un objeto de la clase Cadenas **/
		Cadenas c = new Cadenas();

		/** Llamada al m�todo de la clase Cadenas **/
		c.conversionNumeroString();

	}
}
