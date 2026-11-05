
package actividadEvaluable;

import java.util.Scanner;

public class Actividad2_1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		long numero;

		int contadorPares = 0;
		int sumarPares = 0;

		do {
			System.out.println("Introduce un número (que sea positivo)");
			numero = teclado.nextLong();

		} while (numero <= 0);

		while (numero > 0) {

			long digito = numero % 10;

			if (digito % 2 == 0) {

				contadorPares++;
				sumarPares += digito;

			}

			numero = numero / 10;
		}

		System.out.printf("Cantidad de dígitos pares: %d \n",contadorPares);
		System.out.printf("Suma de los dígitos pares: %d \n",sumarPares);

		teclado.close();

	}

}
