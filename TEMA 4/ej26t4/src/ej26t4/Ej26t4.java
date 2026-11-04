//e26t4
package ej26t4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej26t4 {

     public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = entrada.nextInt();
        return n;
    }
    
    public static boolean esPrimo(int n){
        boolean enc = false;
        int i = 0;
        while(i < 10 && !enc){
            if(n % i == 0){
                enc = true;
            }
            
        }
        return enc;
    }

    public static void main(String[] args) {
        int n = pedirNumero();
        esPrimo(n);
    }
    
}
