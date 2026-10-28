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
        System.out.println("Introduce un día");
        String dia = entrada.nextLine();
        String posicion;
        switch(dia){
            case "Lunes" -> posicion = "primer";
            case "Martes" -> posicion = "segundo";
            case "Miércoles" -> posicion = "tercer";
            case "Jueves" -> posicion = "cuarto";
            case "Viernes" -> posicion = "quinto";
            case "Sábado" -> posicion = "sexto";
            case "Domingo" -> posicion = "séptimo";
            default -> posicion = "no es un día de la semana";
        }
        System.out.println("El " + dia + " es el " + posicion + "día de la semana");
    }

}
