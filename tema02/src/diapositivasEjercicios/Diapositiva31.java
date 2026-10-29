package diapositivasEjercicios;

import java.util.Scanner;

public class Diapositiva31 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcion = 0;

		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1. Opcion 1");
			System.out.println("2. Opcion 2");
			System.out.println("3. Opcion 3");
			System.out.println("4. Opcion 4");
			System.out.println("5. Salir");
			System.out.println("Introduce una opcion:");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Has seleccionado la opcion 1");
				break;
			case 2:
				System.out.println("Has seleccionado la opcion 2");
				break;
			case 3:
				System.out.println("Has seleccionado la opcion 3");
				break;
			case 4:
				System.out.println("Has seleccionado la opcion 4");
				break;
			case 5:
				System.out.println("Has seleccionado la opcion 5");
				System.out.println("Saliendo.........");
				break;

			default:
				System.out.println("Opcion no valida. Fin del programa");
				break;
			}

		} while (opcion >= 1 && opcion <= 4);

		teclado.close();
	}

}
