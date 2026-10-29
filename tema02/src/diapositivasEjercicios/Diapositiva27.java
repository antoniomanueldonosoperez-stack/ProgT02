
package diapositivasEjercicios;

public class Diapositiva27 {

    public static void main(String[] args) {

        int suma = 0;
        int numero = 1;

        for (int i = 1; i <= 10; i++) {
            suma = suma + numero;
            numero = numero + 2;
        }

        System.out.printf("La suma es: %d \n", suma);
    }
}
