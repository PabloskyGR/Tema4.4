package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase;
		String palabra;
		
		System.out.println("Dime una frase:");
		frase = sc.nextLine();
		
		System.out.println("Ahora dime una palabra que quieras buscar");
		palabra = sc.next();
		
		System.out.println("La palabra " + palabra + " aparece un total de " + contador(palabra, frase) + " veces");
		
		sc.close();
	}
	
	public static int contador(String palabra, String frase) {
		int cont = 0;
		int busqueda = frase.indexOf(palabra); 
		
		while (busqueda != -1) { 
			cont++; 
			busqueda = frase.indexOf(palabra, busqueda + 1); 
		}
		
		return cont;
	}
}

