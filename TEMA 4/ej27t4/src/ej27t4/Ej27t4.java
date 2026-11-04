//e27t4
package ej27t4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej27t4 {

     public static String pedirCaraOCruz(Scanner scanner) {
        System.out.print("Elige cara o cruz: ");
        String eleccion = scanner.nextLine();
        return eleccion;
    }
     
    public static String lanzarMoneda() {
       
        if (Math.random() < 0.5) {
            return "cara";
        } else {
            return "cruz";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        boolean acertado = false;

        while (acertado == false) {
            String eleccionUsuario = pedirCaraOCruz(scanner);
            String resultadoMoneda = lanzarMoneda();

            System.out.println("La moneda ha caído en: " + resultadoMoneda);

           
            if (eleccionUsuario.equals(resultadoMoneda)) {
                System.out.println("¡Enhorabuena! Has acertado.");
                acertado = true;
            } else {
                System.out.println("Has perdido. Intentalo otra vez");
            }
        }

    }

}
