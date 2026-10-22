package diapositivasEjercicios;

import java.util.Scanner;

public class Diapositiva10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = teclado.nextInt();

		while (numero != 0) {
			if (numero % 2 == 0) {
				System.out.printf("El numero es par,el numero es %d \n", numero);
			}
			System.out.println("Vuelve a introducir un numero");
			numero = teclado.nextInt();
		}
		System.out.printf("has introducido el numero %d y el programa finaliza \n", numero);
		teclado.close();
	}

}
