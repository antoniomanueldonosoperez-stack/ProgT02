package diapositivasEjercicios;

import java.util.Scanner;

public class Diapositiva26 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un numero entre 1 y 10");
		int numeroIntroducido = teclado.nextInt();
		if (numeroIntroducido >= 1 && numeroIntroducido <= 10) {
			for (int i = 0; i <= 10; i++) {
				System.out.printf("%d x %d = %d%n", numeroIntroducido, i, numeroIntroducido * i);
			}
		} else
			System.out.println("El numero introducido no esta entre el rango asignado");

		teclado.close();
	}

}
