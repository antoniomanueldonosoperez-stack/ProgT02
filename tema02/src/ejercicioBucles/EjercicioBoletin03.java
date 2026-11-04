package ejercicioBucles;

import java.util.Scanner;

public class EjercicioBoletin03 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String cadena = teclado.next();

		String cadenaInvertida = "";

		for (int i = 0; i < cadena.length(); i++) {
			cadenaInvertida = cadena.charAt(i) + cadenaInvertida;
		}

		if (cadenaInvertida.equals(cadena)) {
			System.out.printf("La palabra %s es un palíndromo\n", cadena);
		} else {
			System.out.printf("La palabra %s no es un palíndromo\n", cadena);
		}

		teclado.close();
	}

}