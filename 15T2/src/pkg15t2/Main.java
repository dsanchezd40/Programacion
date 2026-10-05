package pkg15t2;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo = 10000;    
        int tiempoHoras;
        int tiempoMinutos;
        int tiempoSegundos;
        
        tiempoHoras = tiempo / 3600;
        tiempoMinutos = (tiempo % 3600) / 60;
        tiempoSegundos = ((tiempo % 3600) % 60) % 60;
        
        System.out.println("10000 segundos hacen un total de: " + tiempoHoras + "horas, " + tiempoMinutos + "minutos y " + tiempoSegundos + "segundos.");
    }
    
}
