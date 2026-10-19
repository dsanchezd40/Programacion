//Ejercicio 4 Tema 3
package pkg04t4;

import java.util.Scanner;
import op04t4.Operaciones04t4;

public class e04t4 {

    /**
     * Método para pedir número al usuario
     * @return 
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        return num;
    }
    
    public static void main(String[] args) {
        System.out.print("Introduzca el primer número: ");
        int num1 = pedirNumero();
        System.out.print("Introduzca el segundo número: ");
        int num2 = pedirNumero();
        System.out.print("Introduzca el tercero número: ");
        int num3 = pedirNumero();
        Operaciones04t4.ordenar(num1, num2, num3);
    }
    
}
