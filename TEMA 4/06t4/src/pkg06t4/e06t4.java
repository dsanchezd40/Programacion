//e06t4
package pkg06t4;

import java.util.Scanner;
import op06t4.Operaciones06t4;

/**
 *
 * @author alumno
 */
public class e06t4 {

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        return num;
    }
    
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        //Introducimos un número cualquiera
        int num1 = pedirNumero();
        Operaciones06t4.valorar(num1);
    }
    
}
