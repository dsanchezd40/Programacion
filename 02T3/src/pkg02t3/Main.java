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
