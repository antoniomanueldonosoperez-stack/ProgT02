package diapositivasEjercicios;

import java.util.Scanner;

public class Diapositiva30 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int contador = 0;
		int calificaciones = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Introduce una calificacion");
			calificaciones = teclado.nextInt();
			if (calificaciones >= 5) {
				System.out.println("Estas aprobado");
			} else {
				contador++;
			}
		}
		System.out.printf("Hay %d alumnos suspensos \n", contador);
		teclado.close();
	}

}
