//EJERCICIO 9 TEMA 3

//Escribe un programa en JAVA en el que el usuario introduzca cuatro números enteros y luego el programa los muestre por pantalla ordenados de forma creciente.(de menor a mayor)

package pkg09t3;
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
        int num4;
        int aux;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca el primer número: ");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca el segundo número: ");
        num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer número: ");
        num3 = entrada.nextInt();
        System.out.println("Por último, introduzca el cuarto número: ");
        num4 = entrada.nextInt();
        
        //PRIMERA VUELTA
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        } else if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        } else if (num3 > num4) {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        
        //SEGUNDA VUELTA
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        } else if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        } else if (num3 > num4) {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        
        //TERCERA VUELTA
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        } else if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        } else if (num3 > num4) {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        
        //CUARTA VUELTA
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        } else if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        } else if (num3 > num4) {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        System.out.println("El orden de los números introducidos es el: " + num1 + " - " + num2 + " - " + num3 + " - " + num4);
    }
    
}
