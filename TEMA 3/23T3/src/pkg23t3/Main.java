//Ejercicio 23 Tema 3

package pkg23t3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declaramos una variable que nos va a proporcionar el usuario para poder realizar el algoritmo
        int a;
        int i;
        Scanner entrada = new Scanner(System.in);
        do{
           //Pedimos al usuario un número mayor que 1, en caso de que no sea así, se lo comunicamos para que nos de otro
           System.out.println("Introduce un número mayor que 1:");
        a = entrada.nextInt();
        if(a <= 1){
                System.out.println("El número introducido es menor que 1, introduce otro:"); 
          } 
        } while(a <=1);
        
        //Ahora creamos un bucle con 'for' para que comience con la variable i y mientras que sea más pequeño que el número solicitado, se irán imprimiendo i pero cada vez con un valor mayor hasta llegar al valor proporcionado por el usuario
        for(i = 1; i <= a; i++){
            System.out.println(i);
            
        }
        
    }
    
}
