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
