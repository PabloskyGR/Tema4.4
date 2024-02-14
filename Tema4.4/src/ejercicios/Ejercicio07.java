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
	}
	
	public static int contador(String palabra, String frase) {
		int cont = 0;
		int busqueda;
		
		for(int i = 0; i < frase.length() - 1; i++) {
			busqueda = frase.indexOf(palabra);
			
			if(busqueda >= 0) {
				cont++;
			}
		}
		
		return cont;
	}

}
