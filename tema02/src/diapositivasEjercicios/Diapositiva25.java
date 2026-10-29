package diapositivasEjercicios;

import java.util.Scanner;

public class Diapositiva25 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num = 0;
		int suma = 0;
		double media = 0.0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Introduzca un numero");
			num = teclado.nextInt();
			suma = suma + num;
		}
		media = suma / 10.0;
		System.out.printf("La media es: %.2f \n", media);
		teclado.close();
	}

}
