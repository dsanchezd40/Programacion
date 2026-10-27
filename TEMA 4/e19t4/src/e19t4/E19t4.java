//e19t4
package e19t4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class E19t4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dia = entrada.nextLine();
        String posicion = "";
        switch(dia){
            case "lunes" -> posicion = "primer";
            case "martes" -> posicion = "segundo";
            case "miércoles" -> posicion = "tercer";
            case "jueves" -> posicion = "cuarto";
            case "viernes" -> posicion = "quinto";
            case "sábado" -> posicion = "sexto";
            case "domingo" -> posicion = "séptimo";
            default -> posicion = "no es un día de la semana";
        }
    }

}
