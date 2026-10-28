//E20t4
package e20t4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class E20t4 {

    static String MADRID = "Madrid";
    static String COLON = "Colón";

    public static int primera() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("1ª PREGUNTA - ¿Cuál es la capital de España?:");
        String capital = entrada.nextLine();
        boolean iguales = capital.equalsIgnoreCase(MADRID);
        if (iguales == true) {
            System.out.println("Correcto!!");
            return 5;
        } else {
            System.out.println("Incorrecto...");
            System.out.println("La respuesta correcta era: " + MADRID);
            return 0;
        }

    }

    public static int segunda() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("2ª PREGUNTA: ¿Quién descubrió América?:");
        String respuesta = entrada.nextLine();
        boolean iguales = respuesta.equalsIgnoreCase(COLON);
        if (iguales == true) {
            System.out.println("Correcto!!");
            return 5;
        } else {
            System.out.println("Incorrecto...");
            System.out.println("La respuesta correcta era: " + COLON);
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println("EXAMEN DE CULTURAL GENERAL");

        int nota = primera() + segunda();
        
        System.out.println("Nota del exámen: " + nota);
    }

}
