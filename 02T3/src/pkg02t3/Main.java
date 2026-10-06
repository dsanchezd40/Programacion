//EJERCICIO 2 TEMA 3

//Realiza un programa en el que le solicites al usuario 2 números y, si el primer número introducido es mayor que 10, se multipliquen, y en caso contrario que se sumen. Muestra al usuario la operación realizada y el resultado

package pkg02t3;
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
      int res;
      
      Scanner entrada = new Scanner(System.in); 
        
        System.out.println("Por favor, introduzca un número:");
        num1 = entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo número:");
        num2 = entrada.nextInt();
        
        if (num1 > 10){
            res = num1 * num2;
            System.out.println("La operación que se realizó es multiplicación y el resultado es: " + res);
        } else {
            res = num1 + num2;
            System.out.println("La operación que se realizó es suma y el resultado es: " + res);
        }
    }
    
}
