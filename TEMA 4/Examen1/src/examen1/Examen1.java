//Examen RA1 / RA2 / RA3
package examen1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Examen1 {

    /**
     * Método para formar grupos para acceder a una atracción
     */
    public static void formar() {
        Scanner entrada = new Scanner(System.in);
        //Le pedimos al usuario el número de visitantes que van a tener
        System.out.print("Introduce el número total de visitantes: ");
        int visit = entrada.nextInt();
        int grupos = 2;
        //Buscamos mediante bucles el número óptimo de grupos con el mismo número de visitantes
        if (visit % grupos != 0) {
            grupos++;
        } else {
            System.out.println("Se pueden hacer " + grupos + " grupos");
        }

    }

    /**
     * Método para ordenar los tiempos de espera de tres atracciones
     */
    public static void ordenar() {
        Scanner entrada = new Scanner(System.in);
        //Le pedimos al usuario los tiempos de espera de las tres atracciones
        System.out.println("Introduce el tiempo de espera en minutos de la primera atracción:");
        int tmp1 = entrada.nextInt();
        System.out.println("Introduce el tiempo de espera en minutos de la segunda atracción:");
        int tmp2 = entrada.nextInt();
        System.out.println("Introduce el tiempo de espera en minutos de la tercera atracción:");
        int tmp3 = entrada.nextInt();

        int aux;

        //Aquí mediante condicionales vamos jugando con los valores de los números y nuestro auxiliar para ordenarlos de menor a mayor
        //1º vuelta
        if (tmp1 > tmp2) {
            aux = tmp2;
            tmp2 = tmp1;
            tmp1 = aux;
        }
        if (tmp2 > tmp3) {
            aux = tmp3;
            tmp3 = tmp2;
            tmp2 = aux;
        }

        //2º vuelta
        if (tmp1 > tmp2) {
            aux = tmp2;
            tmp2 = tmp1;
            tmp1 = aux;
        }
        if (tmp2 > tmp3) {
            aux = tmp3;
            tmp3 = tmp2;
            tmp2 = aux;
        }
        //Imprimimos por pantalla
        System.out.println("El orden es: " + tmp1 + ", " + tmp2 + ", " + tmp3);
    }

    /**
     * Método para calcular el área de la superficie sobre la que se colocará el
     * nuevo tiovivo
     *
     * @return
     */
    public static double calcular() {
        Scanner entrada = new Scanner(System.in);
        //Pedimos al usuario el radio del tiovivo
        System.out.println("Introduce el radio del tiovivo: ");
        int radio = entrada.nextInt();
        //Calculamos el área mediante la constante de pi y elevando el radio al cuadrado (A = pi * (r^2))
        double area = Math.PI * Math.pow(radio, 2);
        //Imprimimos por pantalla
        System.out.println("El área del tiovivo es: " + area);
        return area;
    }

    public static void menu() {
        Scanner entrada = new Scanner(System.in);
        int opt;
        //Creamos un menú en el que le pedimos al usuario una opción y hasta que no decida salir del programa no se va a cerrar
        do {
            System.out.println("1. Formar grupos para acceder a una atracción");
            System.out.println("2. Ordenar los tiempos de espera de tres atracciones");
            System.out.println("3. Calcular el área de la superficie sobre la que se colocará el nuevo tiovivo");
            System.out.println("4. Salir del programa");

            System.out.println("Elige una opción: ");
            opt = entrada.nextInt();

            switch (opt) {
                case 1:
                    formar();
                    break;
                case 2:
                    ordenar();
                    break;
                case 3:
                    calcular();
            }
        } while (opt != 4);

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //En el método principal procuramos que en el menú co pongan como opción un caracter que no sea un número y se lo avisamos
        try {
            menu();
        } catch (InputMismatchException e) {
            System.out.println("Debes introducir un número");
            entrada.next();
        }

    }

}
