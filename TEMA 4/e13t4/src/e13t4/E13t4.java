//e13t4
package e13t4;

import java.util.Scanner;

public class E13t4 {

    /**
     * 1. Método para pedir el dato al usuario
     *
     * @return
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        return entrada.nextInt();
    }

    /**
     * 2. Método para comprobar que sea mayor que 1 (repite la petición si está
     * mal)
     *
     * @param num
     * @return
     */
    public static int comprobar(int num) {
        Scanner entrada = new Scanner(System.in);
        // Mientras el número sea menor o igual a 1, da error y lo vuelve a pedir
        while (num <= 1) {
            System.out.print("Error: introduce un número mayor que 1: ");
            num = entrada.nextInt();
        }
        return num; 
    }

    /**
     * 3. Método para mostrar los números de 1 en 1 sin contador
     *
     * @param num
     */
    public static void generar(int num) {
        System.out.println("Números desde 1 hasta " + num + ":");

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numero = pedirNumero();
        numero = comprobar(numero);
        generar(numero);
    }

}
