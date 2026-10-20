//10t4
package e10t4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class E10t4 {

    /**
     * Método que pide al usuario un número entero
     * 
     * @return el número que escribe al usuario
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Número: ");
        int num = entrada.nextInt();
        return num;
    }
    
    public static int multiplicar(int num){
        
        for(int i = 0; i < 10; i++){
            int m = num * i;
            System.out.println(num + " * " + i + " = " + m);
        }
        return num;
    }
    
    public static void main(String[] args) {
        int num = pedirNumero();
        multiplicar(num);
    }
    
}
