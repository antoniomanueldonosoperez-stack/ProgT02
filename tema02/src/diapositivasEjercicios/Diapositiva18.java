
package diapositivasEjercicios;

import java.util.Scanner;

public class Diapositiva18 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num1;
        int num2;
        int resultado;
        int respuesta;
        int contador = 0;

        do {

            num1 = (int) (Math.random() * 100) + 1;
            num2 = (int) (Math.random() * 100) + 1;

            resultado = num1 + num2;

            System.out.printf("¿Cuánto es %d + %d  ? \n",num1,num2);
            respuesta = teclado.nextInt();

            if (respuesta == resultado) {
                System.out.println("¡Correcto!");
                contador++;
            } else {
                System.out.println("Incorrecto.");
            }

        } while (respuesta == resultado);

        System.out.println("Fin del juego.");
        System.out.printf("Operaciones acertadas: %d \n",contador);

        teclado.close();
    }
}
