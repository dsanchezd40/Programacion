//e14t4
package e14t4;

import java.util.Scanner;

public class E14t4 {

    /**
     * Método para pedir el dato al usuario
     *
     * @return
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        return entrada.nextInt();
    }

    /**
     * Método para comprobar que sea mayor que 1 (repite la petición si está
     * mal)
     *
     * @param num
     * @return
     */
    public static int comprobar(int num) {
        Scanner entrada = new Scanner(System.in);
        // Mientras el número sea menor o igual a 1, dará error y volverá a pedirlo
        while (num <= 1) {
            System.out.println("Error: introduce un número mayor que 1: ");
            num = entrada.nextInt();
        }
        return num;
    }

    /**
     * Método para hacer los cálculos y mostrar el resultado
     *
     * @param num
     */
    public static void generar(int num) {
        int contadorMultiplos = 0;
        System.out.println("Múltiplos de 3 entre 1 y " + num + ":");

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                contadorMultiplos++;
            }
        }
        System.out.println("Total de números mostrados: " + contadorMultiplos);
    }

    public static void main(String[] args) {
        int numero = pedirNumero();
        comprobar(numero);
        generar(numero);
    }
}
