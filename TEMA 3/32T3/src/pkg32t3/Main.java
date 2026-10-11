//Ejercicio 32 Tema 3
package pkg32t3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int annoAct;
        int mesAct;
        int diaAct;
        int annoNac;
        int mesNac;
        int diaNac;
    
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el año actual: ");
        annoAct = entrada.nextInt();
        System.out.print("Introduzca el mes actual: ");
        mesAct = entrada.nextInt();
        System.out.print("Introduzca el día actual: ");
        diaAct = entrada.nextInt();
        System.out.print("Ahora, introduzca su año de nacimiento: ");
        annoNac = entrada.nextInt();
        System.out.print("Introduzca su mes de nacimiento: ");
        mesNac = entrada.nextInt();
        System.out.print("por último, introduzca su día de nacimiento: ");
        diaNac = entrada.nextInt();
        
        int anno = annoAct - annoNac;
        int mes = mesAct - mesNac;
        int dias = diaAct - diaNac;
        
        System.out.println("Su edad exacta es de " + anno + " años, " + mes + " meses y " + dias + " días");
    }
    
}
