//e24t4
package ej24t4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej24t4 {

    public static int MAYORIAEDAD = 18;

    public static String nombre(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        return entrada.nextLine();
    }
    public static int edad(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        return entrada.nextInt();
    }
    public static void comprobar(int edad){
        if(edad < MAYORIAEDAD){
            System.out.println("Eres menor de edad");
        }else{
            System.out.println("Eres mayor de edad");
        }
    }
    public static void main(String[] args) {
        String nombre = nombre();
        int edad = edad();
        comprobar(edad);
    }
    
}
