package ejercicioBucles;

import java.util.Scanner;

public class BucleDependiente {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número para formar un triangulo");
		int asteriscos = teclado.nextInt();

		for (int fila = 1; fila <= asteriscos; fila++) {

			for (int i = 1; i <= fila; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		teclado.close();
	}

}
