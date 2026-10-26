//e15t4
package ej15t4;

import java.util.Scanner;

public class Ej15t4 {
    
    public static int pedirNumero1() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int x = entrada.nextInt();
        return x;
    }

    public static int pedirNumero2() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce otro número:");
        int y = entrada.nextInt();
        return y;
    }

    public static void hacerMenu(int x, int y) {
        Scanner entrada = new Scanner(System.in);
        int opt;
        do {
            //Mostramos el menú al usuario
            System.out.println("1. Sumar los números");
            System.out.println("2. restar los números");
            System.out.println("3. Multiplicar los números");
            System.out.println("4. Dividir los números");
            System.out.println("5. Salir del programa");

            //Le pedimos que elija una opción
            System.out.println("Elija una opción");
            opt = entrada.nextInt();

            //Abrimos switch para realizar las operaciones que nos indique el usuario y detectamos si nos pide dividir con 0
            try {
                switch (opt) {
                    case 1: {
                        int z = x + y;
                        System.out.println("La suma es: " + z);
                        break;
                    }
                    case 2: {
                        int z = x - y;
                        System.out.println("La resta es: " + z);
                        break;
                    }
                    case 3: {
                        int z = x * y;
                        System.out.println("La multiplicación es; " + z);
                        break;
                    }
                    case 4: {
                        int z = x / y;
                        System.out.println("La división es: " + z);
                        break;
                    }
                    case 5: {
                        System.out.println("Programa cerrado");
                    }
                }

            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir con 0");
            }

        } while (opt != 5);
    }

    public static void main(String[] args) {
        int x = pedirNumero1();
        int y = pedirNumero2();
        int z = 0;
        int opt = 0;
        hacerMenu(x, y);
    }

}
