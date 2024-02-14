package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String cadena = "";
		
		System.out.println("Dime una frase");
		cadena = sc.nextLine();
		
		System.out.println(invertida(cadena));
		
		sc.close();

	}
	
	public static String invertida(String cadena) {
		String resultado = "";
		
		for(int i = cadena.length() - 1; i >= 0; i--) {
			resultado += cadena.charAt(i);
		}
		
		return resultado;
	}

}
