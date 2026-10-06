package pkg32t2;

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

        int dineroTotal;
        int cincuenta;
        int veinte;
        int diez;
        int cinco;
        int dos;
        int uno;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, indique una cantidad de dinero: ");
        
        dineroTotal = entrada.nextInt();
        
        cincuenta = dineroTotal / 50;
        veinte = (dineroTotal % 50) / 20;
        diez = ((dineroTotal % 50) % 20) / 10;
        cinco = (((dineroTotal % 50) % 20) % 10) / 5;
        dos = ((((dineroTotal % 50) % 20) % 10) % 5) / 2;
        uno = ((((dineroTotal % 50) % 20) % 10) % 5) % 2;
        
        System.out.println(dineroTotal + "Euros se decomponen en " + cincuenta + " billetes de 50, " + veinte + " billetes de 20, " + diez + " billetes de 10, " + cinco + " billetes de cinco, " + dos + " monedas de 2 euros y " + uno + " monedas de 1 euro.");
    }
    
}
