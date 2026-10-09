//Ejercicio 29 Tema 3

package pkg29t3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double aleatorio = Math.floor(Math.random() * 100);
        int entero = (int) aleatorio;
        int user;
        int intentos = 0;
        System.out.println("Dime un número del 1 al 100, a ver si lo adivinas:");
        
        Scanner entrada = new Scanner(System.in);
        do{
            user = entrada.nextInt();
            intentos++;
        if(user > entero){
            System.out.println("Prueba un número menor");
        }else if(user < entero){
            System.out.println("Prueba un número mayor");
        }else {
            System.out.println("HAS ACERTADO");
            System.out.println("Lo has hecho en " + intentos + " intentos");
            }
        } while(user != entero);
        
    }
    
}
