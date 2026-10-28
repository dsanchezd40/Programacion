//e21t4
package e21t4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class E21t4 {

    public static int num1() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num1 = entrada.nextInt();
        return num1;
    }

    public static int num2() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num2 = entrada.nextInt();
        return num2;
    }

    public static int comprobar(int num1, int num2) {
        Scanner entrada = new Scanner(System.in);
        while (num1 > num2) {
            System.out.print("Error: introduce un número mayor que el primero: ");
            num2 = entrada.nextInt();
        }
        return num2;
    }

    public static int generar(int num1, int num2) {
        int suma = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                suma = suma + i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int num1 = num1();
        int num2 = num2();
        num2 = comprobar(num1, num2);   // recoge el valor corregido
        int suma = generar(num1, num2);
        System.out.println("LA suma es: " + suma);
    }

}
