//Ejercico 34 Tema 3
package pkg34t3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int diaS;
        int horaS;
        int minutoS;
        int diaL;
        int horaL;
        int minutoL;
        
        Scanner entrada = new Scanner (System.in);
        System.out.print("Introduzca el día de salida: ");
        diaS = entrada.nextInt();
        System.out.print("Introduzca la hora de salida: ");
        horaS = entrada.nextInt();
        System.out.print("Introduzca el minuto de salida: ");
        minutoS = entrada.nextInt();
        System.out.print("Introduzca el día de llegada: ");
        diaL = entrada.nextInt();
        System.out.print("Introduzca la hora de llegada: ");
        horaL = entrada.nextInt();
        System.out.print("Introduzca el minuto de llegada: ");
        minutoL = entrada.nextInt();
        
        int diaT = diaL - diaS;
        int horaT = horaL - horaS;
        int minutoT = minutoL - minutoS;
        
        if(horaL < horaS){
            horaT = (24 - horaS) + horaL;
            diaT--;
        }
        if(minutoL < minutoS){
            minutoT = (minutoL + 60) - minutoS;
            horaT--;
        }
        if(horaT >= 24){
            horaT = horaT - 24;
            diaT++;
        }
        
        System.out.println("El tren llegará a su destino en " + diaT + " días, " + horaT + " horas y " + minutoT + " minutos");
    }
    
}
