
package actividadEvaluable;

import java.util.Scanner;

public class Actividad2_2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce una palabra");
		String palabra = teclado.next();

		String resultado = "";

		for (int i = 0; i < palabra.length(); i++) {

			char letra = palabra.charAt(i);

			if (Character.isUpperCase(letra)) {
				resultado += Character.toLowerCase(letra);
			} else if (Character.isLowerCase(letra)) {
				resultado += Character.toUpperCase(letra);
			} else {
				resultado += letra;
			}
		}

		System.out.printf("Palabra convertida: %s \n",resultado);

		teclado.close();

	}

}
