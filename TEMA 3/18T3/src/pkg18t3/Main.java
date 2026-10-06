//EJERCICIO 18 TEMA 3

//Realiza un programa que le pida una contraseña al usuario. Si la escribe bien le dará la enhorabuena, pero si la escribe mal 3 veces le dará un mensaje de error de acceso

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
