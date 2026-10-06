//EJERCICIO 1 TEMA 3

//Implementa un algoritmo en JAVA que le pida al usuario un número por teclado. Posteriormente el programa le dirá al usuario si el número introducido es positivo o negativo.

package pkg01t3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca un número: ");
        num = entrada.nextInt();
        
        if (num > 0){
            System.out.println("El número introducido es positivo");
        } else if (num < 0) {
            System.out.println("El número introducido es negativo");
        } else {
            System.out.println("El número inroducido es 0");
        } 
    }
    
}
