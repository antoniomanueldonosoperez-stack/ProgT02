package ejercicioBucles;

import java.util.Scanner;

public class EjercicioBoletin02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce una palabra(cadena)");
		String cadena = teclado.next();
		String carac1;
		String carac2;

		do {
			System.out.println("Introduce el primer caracter");
			carac1 = teclado.next();
			System.out.println("Introduce el segundo caracter");
			carac2 = teclado.next();
		} while (carac1.length() != 1 || carac2.length() != 1);

		int posicion = cadena.indexOf(carac1);

		if (posicion != -1) {
			String resultado = cadena.substring(0, posicion) + carac2 + cadena.substring(posicion + 1);
			System.out.println(resultado);
		} else {
			System.out.printf("El carácter %s no aparece en la cadena\n", carac1);
		}
		teclado.close();
	}
}
