//Ejercicio 1 tema 4
package pkg01t4;

import java.util.Scanner;

public class Main {

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        return num;
    }
    
    
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        int num = pedirNumero();
        if(num > 0){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");
        }
    }
    
}
