package ejercicios;

public class Ejercicio03 {

	public static void main(String[] args) {
		System.out.println(cuentaEspacios("Hola a todos"));
	}

	public static int cuentaEspacios(String frase) {
		int espacios = 0;

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				espacios++;
			}
		}

		return espacios;
	}

}
