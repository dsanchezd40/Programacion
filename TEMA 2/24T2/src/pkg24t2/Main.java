package pkg24t2;

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
        double notaP;
        int notaL;
        double notaB;
        int notaE;
        int notaS;
        double notaF;
        double notaM;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca la nota de Programación: ");
        notaP = entrada.nextDouble();
        
        System.out.println("Por favor, introduzca la nota de Lenguaje de Marcas : ");
        notaL = entrada.nextInt();
        
        System.out.println("Por favor, introduzca la nota de Bases de Datos: ");
        notaB = entrada.nextDouble();
        
        System.out.println("Por favor, introduzca la nota de Entornos de Desarrollo: ");
        notaE = entrada.nextInt();
        
        System.out.println("Por favor, introduzca la nota de Sistemas Informáticos: ");
        notaS = entrada.nextInt();
        
        System.out.println("Por favor, introduzca la nota de Formación y Orientación Laboral: ");
        notaF = entrada.nextDouble();
        
        System.out.println("Su nota media del curso es: ");
        notaM = (notaP + notaL + notaB + notaE + notaS + notaF) / 6;
    }
    
}
