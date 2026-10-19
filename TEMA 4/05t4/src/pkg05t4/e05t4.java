//e5t4
package pkg05t4;

import java.util.Scanner;
import op05t4.Operaciones05t4;

/**
 *
 * @author alumno
 */
public class e05t4 {

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
        System.out.print("Introduzca un número: ");
        //Introducimos un número cualquiera
        int num1 = pedirNumero();
        Operaciones05t4.detectar(num1);
    }
    
}
