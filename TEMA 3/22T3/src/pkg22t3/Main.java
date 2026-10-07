//Ejercicio 22 Tema 3

package pkg22t3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Declaramos variables de los datos que nos tiene que proporcionar el usuario para hacer la operación y a su vez del resultado
        int a;
        int b;
        int c;
        //Abrimos un control de excepciones por si el usuario introduce una letra en vez de un número
        try{
            Scanner entrada = new Scanner(System.in);
            //Le pedimos al usuario los números que desee sumar y le devolvemos el resultado
            System.out.println("Introduce el primer número");
            a = entrada.nextInt();
            System.out.println("Ahora introduce el segundo número");
            b = entrada.nextInt();
            c = a + b;
            System.out.println("El resultado de la suma es: " + c);
        }catch(InputMismatchException e){
            System.out.println("Has introducido una letra en vez de un número");
        }
    }
    
}
