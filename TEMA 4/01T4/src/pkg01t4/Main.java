//Ejercicio 1 tema 4
package pkg01t4;

import java.util.Scanner;

public class Main {
    
    /**
     * Método para pedir número al usuario
     * @return 
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        return num;
    }
    
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        //Introducimos un número cualquiera
        int num = pedirNumero();
        //Establecemos condiciones en función si es positivo o negativo
        if(num > 0){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");
        }
    }
    
}
