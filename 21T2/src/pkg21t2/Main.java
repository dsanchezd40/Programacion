package pkg21t2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tiempo;
        int tiempoDias;
        int tiempoHoras;
        int tiempoMinutos;
        int tiempoSegundos;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca un número de segundos: ");
        tiempo = entrada.nextInt();
        
        tiempoDias = tiempo / 86400;
        tiempoHoras = (tiempo % 86400) / 3600;
        tiempoMinutos = ((tiempo % 86400) % 3600) / 60;
        tiempoSegundos = (((tiempo % 86400) % 3600) % 60) % 60;
        
        System.out.println(tiempo + " segundos hacen un total de: " + tiempoDias + "días, " + tiempoHoras + " horas," + tiempoMinutos + " minutos y " + tiempoSegundos + "segundos.");
    }
    
}
