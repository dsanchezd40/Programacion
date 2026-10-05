package pkg26t2;

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
        int num;
        int primeraC;
        int segundaC;
        int terceraC;
        int cuartaC;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca un número de 4 cifras: ");
        
        num = entrada.nextInt();
        
        primeraC = num / 1000;
        segundaC = (num % 1000) / 100;
        terceraC = ((num % 1000) % 100) / 10;
        cuartaC = ((num % 1000) % 100) % 10;
       
        System.out.println("La primera cifra es: " + primeraC);
        System.out.println("La segunda cifra es: " + segundaC);
        System.out.println("La tercera cifra es: " + terceraC);
        System.out.println("La cuarta cifra es: " + cuartaC);
    }
    
}
