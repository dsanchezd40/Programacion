//Ejercicio 27 Tema 3
package pkg27t3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int x;
        int y;
        int z;
        int opt = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número:");
        x = entrada.nextInt();
        System.out.println("Ahora, introduce otro número:");
        y = entrada.nextInt();
        
        do{
            //MOSTRAMOS MENÚ AL USUARIO
            System.out.println("1. Sumar los números"); 
            System.out.println("2. restar los números");
            System.out.println("3. Multiplicar los números");
            System.out.println("4. Dividir los números");
            System.out.println("5. Salir del programa");
            
            //PEDIR OPCIÓN
            System.out.println("Elija una opción");
            opt = entrada.nextInt();
        } while(opt > 5);
        
        
            try{
                
                switch(opt){
            case 1:{
                z = x + y;
                System.out.println("La suma es: " + z); 
                break;
            }
            case 2:{
                z = x - y;
                System.out.println("La resta es: " + z);
                break;
            }
            case 3:{
                z = x * y;
                System.out.println("La multiplicación es; " + z);
                break;
            }
            case 4:{
                z = x / y;
                System.out.println("La división es: " + z);
                break;
            }
            case 5:{
                System.out.println("Programa cerrado");
            }
            }
        
            }catch(ArithmeticException e){
                System.out.println("No se puede dividir con 0");
            }   
    } 
}
    
    
