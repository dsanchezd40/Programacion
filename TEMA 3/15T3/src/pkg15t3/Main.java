//EJERCICIO 15 TEMA 3

//Escribe un programa en JAVA que, utilizando bucles, imprima la tabla de multiplicar de un número que elija el usuario

package pkg15t3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número para calcular su tabla de multiplicar:");
        n = entrada.nextInt();

        for(int m = 0; m <= 10; m++){
            int r = n * m;
            System.out.println(n + " x " + m + " = " + r);
        }
        
    }
    
}
