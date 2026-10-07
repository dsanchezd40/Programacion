package pkg21t3;
import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
        //Declaramos las dos variables que vamos a usar para la división
        int a;
        int b;
        int c;
        
        try {
            Scanner entrada = new Scanner(System.in);
            //Pedimos al usuario el dividendo y divisor que desee para operar
            System.out.println("Por favor, indroduzca el dividendo: "); 
            a = entrada.nextInt();
            System.out.println("Ahora introduzca el divisor; ");
            b = entrada.nextInt();
            //implementamos la variable resultado
            c = a / b;
            //Le enviamos al usuario el resultado
            System.out.println("El resultado de la división entre " + a + " y " + b + " es: " + c);
        } catch(ArithmeticException e) {
            System.out.println("La operación no se ha podido realizar debido a un caracter erróneo");
        }
    }
    
}
