//Ejercicio 3 Tema 4
package pkg03t4;

import java.util.Scanner;
import op03t4.Operaciones03t4;

public class e03t4 {

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
        Operaciones03t4.ordenar(num1, num2, num3);
    }
    
}
