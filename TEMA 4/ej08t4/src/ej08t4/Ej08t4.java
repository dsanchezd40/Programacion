//e08t4
package ej08t4;

import java.util.Scanner;

public class Ej08t4 {

    /**
     * Método que pide al usuario un número entero
     * 
     * @return el número que escribe al usuario
     */
    public static int pedirDinero() {
        Scanner entrada = new Scanner(System.in);
        int dinero = entrada.nextInt();
        return dinero;
    }
    
    public static void descomponer(int dinero, int cincuenta, int veinte, int diez, int cinco, int dos, int uno){
      System.out.println(dinero + " Euros se descomponen en:");
        //Billetes de 50
        cincuenta = dinero / 50;
            if (cincuenta >= 1) {
                System.out.println("Billetes de 50: " + cincuenta);
            }
        //Billetes de 20    
        veinte = (dinero % 50) / 20;
            if (veinte >= 1) {
                System.out.println("Billetes de 20: " + veinte);
            }
        //Billetes de 10    
        diez = ((dinero % 50) % 20) / 10;
            if (diez >= 1) {
                System.out.println("Billetes de 10: " + diez);
            }
        //Billetes de 5    
        cinco = (((dinero % 50) % 20) % 10) / 5;
            if (cinco >= 1) {
                System.out.println("Billetes de 5: " + cinco);
            }
        //Monedas de 2    
        dos = ((((dinero % 50) % 20) % 10) % 5) / 2;
            if (dos >= 1) {
                System.out.println("Monedas de 2 euros: " + dos);
            }
        //Monedas de 1    
        uno = ((((dinero % 50) % 20) % 10) % 5) % 2;
            if (uno >= 1) {
                System.out.println("Monedas de 1 euro: " + uno);
            }   
    }
    
    public static void main(String[] args) {
        System.out.println("Introduzca una cantidad de dinero:");
        int dinero = pedirDinero();
        int cincuenta = dinero / 50;
        int veinte = (dinero % 50) / 20;
        int diez = ((dinero % 50) % 20) / 10;;
        int cinco = (((dinero % 50) % 20) % 10) / 5;
        int dos = ((((dinero % 50) % 20) % 10) % 5) / 2;
        int uno = ((((dinero % 50) % 20) % 10) % 5) % 2;
        
        descomponer(dinero, cincuenta, veinte, diez, cinco, dos, uno);
    }
    
}
