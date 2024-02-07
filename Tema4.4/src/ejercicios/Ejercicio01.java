package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Variable donde guardaremos la frase 1 que introduzca el usuario
		String frase1;

		// Variable donde guardaremos la farse 2 que inrtoduzca el usuario
		String frase2;

		// Le pedimos al usuario una frase
		System.out.println("Dime una frase: ");
		frase1 = sc.nextLine();

		// Le pedimos al usuario otra frase
		System.out.println("Dime otra frase:");
		frase2 = sc.nextLine();

		// Comprobamos que frase es mas chica o si son iguales
		if (frase1.length() < frase2.length()) {
			System.out.println("La frase 1 es más corta que la frase 2");
		} else if (frase1.length() == frase2.length()) {
			System.out.println("Las dos frases son iguales");
		} else {
			System.out.println("La frase 2 es más corta que la frase 1");
		}

		// Cerramos el scanner
		sc.close();

	}

}
