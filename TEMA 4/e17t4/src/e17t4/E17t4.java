//e17t4
package e17t4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class E17t4 {

    public static char generarLetra(double aleatorio) {
        aleatorio = (Math.floor(Math.random() * 26) + 97);
        char letra = (char) aleatorio;
        return letra;
    }

    public static char pedirLetra(char letraUser) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una letra: ");
        letraUser = entrada.nextLine().charAt(0);
        return letraUser;
    }

    public static void comprobar(char letra, char letraUser) {
        Scanner entrada = new Scanner(System.in);
        int intentos = 1;
        while (letraUser != letra) {
            if (letraUser > letra) {
                System.out.print("Prueba con una letra más pequeña: ");
            } else if (letraUser < letra) {
                System.out.print("Prueba con una letra más grande: ");
            }
            letraUser = entrada.nextLine().charAt(0);
            intentos++;
        }

        System.out.println("Has acertaddo");
        System.out.println("Nº de intentos: " + intentos);
    }

    public static void main(String[] args) {
        double aleatorio = 0;
        generarLetra(aleatorio);
        char letra = (char) generarLetra(aleatorio);
        char letraUser = pedirLetra(letra);
        comprobar(letra, letraUser);
    }

}
