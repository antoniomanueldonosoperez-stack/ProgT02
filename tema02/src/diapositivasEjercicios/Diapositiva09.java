package diapositivasEjercicios;

import java.util.Scanner;

public class Diapositiva09 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numeros;
		int contador = 0;
		int suma = 0;

		while (contador < 10) {
			System.out.println("Introduce un numero");
			numeros = teclado.nextInt();
			suma = suma + numeros;
			contador++;
		}
		System.out.printf("La suma es %d \n", suma);
		double promedio = (double) suma / 10;
		System.out.printf("El promedio es %.2f  \n", promedio);
		teclado.close();
	}

}
