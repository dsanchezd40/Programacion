//EJERCICIO 3 TEMA 3

//Diseña un programa en JAVA que lea tres números e imprima por pantalla el mayor de ellos.

package pkg03t3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca el primer numero:");
        num1 = entrada.nextInt();
        
        System.out.println("Por favor, introduzca el segundo numero:");
        num2 = entrada.nextInt();
        
        System.out.println("Por favor, introduzca el tercer numero:");
        num3 = entrada.nextInt();
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("El número mayor de los introducidos es el " + num1);
    } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número mayor de los introducidos es el " + num2);
    } else if (num3 > num1 && num3 > num2) {
            System.out.println("El número mayor de los introducidos es el " + num3);
    }
    }
    
}
