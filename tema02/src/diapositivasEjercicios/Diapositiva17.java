package diapositivasEjercicios;

import java.util.Scanner;

public class Diapositiva17 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int contador = 0;
		double suma = 0;
		double promedio = 0;
		
		do {
			System.out.println("Introduce un numero");
			numero=teclado.nextInt();
			suma=suma + numero;
			contador++;
			
		} while ( contador < 10);
		System.out.printf("La suma es %.2f \n", suma);
		promedio = suma / 10;
		System.out.printf("El promedio es %.2f  \n", promedio);
		
		teclado.close();
	}

}
