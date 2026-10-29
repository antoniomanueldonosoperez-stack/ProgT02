package diapositivasEjercicios;

import java.util.Scanner;

public class Diapositiva29 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero para calcular su factorial");
		int numero = teclado.nextInt();
		int multiplica = 1;
		for (; numero >= 1 ; numero--) {
			multiplica = multiplica * numero;
		}
		System.out.printf("El factorial es: %d \n", multiplica);
		teclado.close();
	}

}
