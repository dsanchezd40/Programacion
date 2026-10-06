////EJERCICIO 4 TEMA 3

//Escribir un algoritmo en JAVA que pida tres números e imprima por pantalla el menor de ellos

package pkg06t3;
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
        int nota;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca su nota:");
        nota = entrada.nextInt();
        
        switch(nota) {
            case 0: {
                System.out.println("Suspenso");
                break;
            }
            case 1: 
            case 2:   
            case 3: 
            case 4: {
                System.out.println("Suspenso");
                break;
            }
            case 5:
            case 6: {
                System.out.println("Bien");
                break;
            }
            case 7:
            case 8: {
                System.out.println("Notable");
                break;
            }
            case 9:
            case 10: {
                System.out.println("Sobresaliente");
                break;
            }
            default: {
                System.out.println("Error, no se ha detectado ninguna nota entre 0 y 10");
            }
        }
    }
    
}
