//Ejercicio 27 Tema 3
package pkg27t3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int x;
        int y;
        int opt = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número:");
        x = entrada.nextInt();
        System.out.println("Ahora, introduce otro número:");
        y = entrada.nextInt();
        
        do{
            //MOSTRAMOS MENÚ AL USUARIO
            System.out.println("1. Sumar los números"); 
            System.out.println("2. restar los números");
            System.out.println("3. Multiplicar los números");
            System.out.println("4. Dividir los números");
            System.out.println("Salir del programa");
            
            //PEDIR OPCIÓN
            System.out.println("Elija una opción");
            opt = entrada.nextInt();
          
            
            
        } while(opt != 4);
        
        
    }
    
}
