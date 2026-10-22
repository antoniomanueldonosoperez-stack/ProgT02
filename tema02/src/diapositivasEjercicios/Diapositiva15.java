
package diapositivasEjercicios;

import java.util.Scanner;

public class Diapositiva15 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String vocal;

		do {
			System.out.println("Introduce una vocal");
			vocal = teclado.next().toUpperCase();

		} while (!vocal.equals("A") && !vocal.equals("E") && !vocal.equals("I") && !vocal.equals("O")
				&& !vocal.equals("U"));

		System.out.printf("Vocal correcta: %s \n", vocal);

		teclado.close();
	}
}
