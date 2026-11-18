
package funciones2;

public class Funcion02 {

	public static void main(String[] args) {
		System.out.println(numerosAfortunados(47896));

	}

	public static boolean numerosAfortunados(int n) {

		boolean suerte = false;

		int contadorSuerte = 0;

		int contadorMalaSuerte = 0;

		while (n > 0) {

			int cifra = n % 10;

			if (cifra == 3 || cifra == 7 || cifra == 8 || cifra == 9) {

				contadorSuerte++;

			} else {

				contadorMalaSuerte++;

			}

			n = n / 10;

		}

		if (contadorSuerte > contadorMalaSuerte) {

			suerte = true;

		}

		return suerte;

	}

}
