//EJERCICIO 4 TEMA 3

//Escribir un algoritmo en JAVA que pida tres números e imprima por pantalla el menor de ellos

package pkg08t3;
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
        
        int dinero;
        int cincuenta;
        int veinte;
        int diez;
        int cinco;
        int dos;
        int uno;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca una cantidad de dinero: ");
        dinero = entrada.nextInt();
        
        System.out.println(dinero + " Euros se descomponen en:");
        
        cincuenta = dinero / 50;
        if (cincuenta >= 1) {
            System.out.println("Billetes de 50: " + cincuenta);
        }
        veinte = (dinero % 50) / 20;
        if (veinte >= 1) {
            System.out.println("Billetes de 20: " + veinte);
        }
        diez = ((dinero % 50) % 20) / 10;
        if (diez >= 1) {
            System.out.println("Billetes de 10: " + diez);
        }
        cinco = (((dinero % 50) % 20) % 10) / 5;
        if (cinco >= 1) {
            System.out.println("Billetes de 5: " + cinco);
        }
        dos = ((((dinero % 50) % 20) % 10) % 5) / 2;
        if (dos >= 1) {
            System.out.println("Monedas de 2 euros: " + dos);
        }
        uno = ((((dinero % 50) % 20) % 10) % 5) % 2;
        if (uno >= 1) {
            System.out.println("Monedas de 1 euro: " + uno);
        }            
    }
    
}
