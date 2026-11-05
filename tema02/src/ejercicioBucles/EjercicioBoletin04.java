package ejercicioBucles;

import java.util.Scanner;

public class EjercicioBoletin04 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int cantidad;
		int numero;

		int positivos = 0;
		int negativos = 0;
		int ceros = 0;

		System.out.println("¿Cuántos números quieres introducir?");
		cantidad = teclado.nextInt();

		for (int i = 1; i <= cantidad; i++) {

			System.out.printf("Introduce el número %d \n ", i);
			numero = teclado.nextInt();

			if (numero > 0) {
				positivos++;
			} else if (numero < 0) {
				negativos++;
			} else {
				ceros++;
			}
		}

		System.out.println("\n--- RESULTADOS ---");
		System.out.printf("Números positivos: %d \n", positivos);
		System.out.printf("Números negativos: %d \n", negativos);
		System.out.printf("Números iguales a cero: %d \n", ceros);

		teclado.close();
	}

}
