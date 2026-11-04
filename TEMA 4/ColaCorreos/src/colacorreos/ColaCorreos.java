//Ejercicio Cola de Correos
package colacorreos;

import generar.Generar;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ColaCorreos {

    //Declaramos las constantes que vamos a utilizar
    public final static String ENVIAR = "E";
    public final static String RECOGER = "R";
    public final static int RANDOM = (int) (Math.random() * 100);

    /**
     * Método donde creamos el menú con sus opciones
     *
     * @return
     */
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        //Declaramos las variables de los tickets que queremos generar si son de envío o recogida
        int nE = RANDOM;
        int nR = RANDOM;
        int opt = 0;
        while (opt != 4) {
            try {
                //Abrimos el menú y le damos a elegir al usuario una opción de las disponibles
                System.out.println("1. Enviar");
                System.out.println("2. Recoger");
                System.out.println("3. Generar lote de tickets");
                System.out.println("4. Salir");

                System.out.print("Elije una opción:");
                opt = entrada.nextInt();
                //Abrimos un switch para realizar diferentes comandos en función de lo que nos marque el uruario
                switch (opt) {
                    case 1: { //Genera un número de envío aleatorio comprendido entre 1 y 100 y lo imprime en pantalla
                        System.out.println("E-" + nE);
                        break;
                    }
                    case 2: { //Genera un número de envío aleatorio comprendido entre 1 y 100 y lo imprime en pantalla
                        System.out.println("R-" + nR);
                        break;
                    }
                    case 3: { 
                        System.out.println("¿Enviar o Recoger?"); //le preguntamos al usuario si el lote de tickets que quiere generar quiere que sea para enviar o recoger
                        String respuesta = entrada.nextLine();
                        boolean igualE = ENVIAR.equalsIgnoreCase(respuesta);
                        boolean igualR = RECOGER.equalsIgnoreCase(respuesta);
                        if (!igualE && !igualR) {
                            System.out.println("Introduce 'E' para enviar o 'R' para recoger:"); //Controlamos que ponta o una E o una R
                            respuesta = entrada.nextLine();
                        }
                        //Aquí pedimos al usuario el número de tickets que desea sacar
                        System.out.print("Introduce una cantidad de tickets y que sea múltiplo de 3: ");
                        int cant = entrada.nextInt();
                        //Controlamos que introduzca un número que sea múltiplo de 3
                        while (cant % 3 != 0) {
                            System.out.println("Error - Introduce un número que se amúltiplo de 3:");
                            cant = entrada.nextInt();
                        }
                        //invocamos un método que recibe el tipo y cantidad de tickets y los genera aleatoriamente
                        Generar.recibir(respuesta, cant);

                        break;
                    }
                    case 4: {
                        System.out.println("Programa cerrado");
                    }

                }
            } catch (InputMismatchException e) { //Controlamos que no introduzca ningún caracter que no sea un número
                System.out.println("Introduce un número, no una letra:");
                opt = entrada.nextInt();
            }

        }
        return opt;
    }

    public static void main(String[] args) {
        menu();
    }

}
