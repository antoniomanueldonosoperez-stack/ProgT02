package diapositivasEjercicios;


import java.util.Scanner;

public class Diapositiva28 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = teclado.nextInt();
		if (numero >0) {
			for (;numero > 0; numero = numero / 10) {
				 System.out.printf("%d \n", numero % 10);
			}
		}else
			System.out.println("El numero introducido debe ser positivo");
		
		
		teclado.close();
		
	}

}
