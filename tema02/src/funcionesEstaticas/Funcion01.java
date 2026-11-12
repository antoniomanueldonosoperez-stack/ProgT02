package funcionesEstaticas;

import java.util.Scanner;

public class Funcion01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = teclado.nextInt();
		System.out.println("El numero tiene " + digitos(numero) + " cifras");
		teclado.close();
	}

	public static int digitos(int numero) {
		int contador = 0;

		while (numero > 0) {
			numero = numero / 10;
			contador++;
		}

		return contador;

	}

}
