package diapositivasEjercicios;


import java.util.Scanner;

public class Diapositiva23 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		int num = teclado.nextInt();
		int contador = 1;
		
		for (contador = 1; contador <= num ; contador++) {
			System.out.printf("El numero es: %d \n",contador);
		}
		
		teclado.close();
	}

}
