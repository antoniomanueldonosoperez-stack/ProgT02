package diapositivasEjercicios;

import java.util.Scanner;

public class Diapositiva22 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el numero de veces que quiere que se repita el mensaje");
		int veces = teclado.nextInt();
		int contador = 0;

		for (contador = 0; contador < veces; contador++) {
			System.out.println("¿Hoy vamos a ver una peli, Vladi?");
		}

		teclado.close();
	}

}
