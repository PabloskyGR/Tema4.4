package ejercicios;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		String frase = "Hola que Tal estais";
		
		String[] palabras = frase.split(" ");
		
		Arrays.sort(palabras);
		
		String resultado = String.join(" ", palabras);
		
		System.out.println(resultado);

	}

}
