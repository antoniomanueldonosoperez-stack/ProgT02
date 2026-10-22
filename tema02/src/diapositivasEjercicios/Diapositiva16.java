package diapositivasEjercicios;

import java.util.Scanner;

public class Diapositiva16 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num1;
		int num2;

		
		do {
			System.out.println("Introduce el primer numero");
			num1 = teclado.nextInt();
			System.out.println("Introduce el segundo numero");
			num2 = teclado.nextInt();
			
		} while (num1 != num2);
	}

}
