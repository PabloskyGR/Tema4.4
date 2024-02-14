package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase = "";
		
		String palabra = "";
		
		while(!palabra.equals(("fin"))) {
			System.out.println("Dime una palabra:");
			palabra = sc.next().toLowerCase();
			
			if(palabra.equals("fin")) {
				break;
			}
			
			frase += palabra + " ";
		}
		
		System.out.println(frase);
		
		sc.close();

	}

}
