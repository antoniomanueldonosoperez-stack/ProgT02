package funciones2;

import java.util.Random;
import java.util.Scanner;

public class Funcion01 {

	public static void main(String[] args) {
		
		adivinaNumero();
	}

	public static void adivinaNumero() {

		Scanner teclado = new Scanner(System.in);

		int intentos = 0;

		Random r = new Random();

		int inicio = 1;
		int fin = 100;

		int aleatorio = r.nextInt(inicio, fin + 1);

		int numeroIntroducido;

		do {
			System.out.println("Introduce un numero");
			numeroIntroducido = teclado.nextInt();

			intentos++;

			if (numeroIntroducido < aleatorio) {
				System.out.println("El numero a adivinar es mayor");
			} else if (numeroIntroducido > aleatorio) {
				System.out.println("El numero a adivinar es menor");
			} else {
				System.out.println("HAS ACERTADO");
				System.out.printf("Lo has conseguido en %d intentos \n", intentos);
			}
			if (numeroIntroducido != aleatorio && intentos < 10) {
				System.out.printf("Llevas %d intentos \n", intentos);

			}
		} while (numeroIntroducido != aleatorio && intentos < 10);
		if (numeroIntroducido != aleatorio) {
			System.out.println("Has agotado los 10 intentos.");
			System.out.printf("El numero era el %d \n", aleatorio);
		}
		teclado.close();
	}

}
