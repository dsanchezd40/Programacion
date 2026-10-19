//Ejercicio 2 Tema 4

package pkg02t4;

import java.util.Scanner;
import operaciones.Operaciones02t4;


public class e02t4 {
    /**
     * Métofo que pide números al usuario
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
        int num1 = pedirNumero();
        int num2 = pedirNumero();
        //Establecemos condiciones en función si el primer número es mayor a 10
        if(num1 > 10){
            Operaciones02t4.multiplicar(num1, num2);
        }else{
            Operaciones02t4.sumar(num1, num2);
        }
    }
    
}
