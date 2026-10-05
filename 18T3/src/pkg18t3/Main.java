package pkg18t3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int contraseña = 123;
        int intentos = 3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la contraseña");
        contraseña = entrada.nextInt();
        if(contraseña != 123){
            intentos--;
            System.out.println("Contraseña incorrecta, te quedan " + intentos + " intentos. Intente de nuevo:");
            
            contraseña = entrada.nextInt();
        }
        if(intentos == 0){
            System.out.println("ERROR DE ACCESO");
        }
    }
    
}
