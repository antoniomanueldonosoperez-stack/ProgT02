package diapositivasEjercicios;

import java.util.Scanner;

public class Diapositiva14 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero;

		do {
			System.out.println("Introduce un numero entre 1 y 10");
			numero = teclado.nextInt();

		} while (numero < 0 || numero > 10);
	}

}
