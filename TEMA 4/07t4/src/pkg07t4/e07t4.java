//07t4
package pkg07t4;

import java.util.Scanner;



public class e07t4 {

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        return num;
    }
    
    public static void ordenar(int num1, int num2, int num3, int num4){
        int aux;
        
        for(int i = 0; i < 3; i++){
            
            if(num1 > num2){
                aux = num2;
                num2 = num1;
                num1= aux;
            }else if (num2 > num3){
                aux = num3;
                num3 = num2;
                num2 = aux;
            }else if (num3 > num4){
                aux = num4;
                num4 = num3;
                num3 = aux;
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        //Introducimos cuatro números
        int num1 = pedirNumero();
        System.out.print("Introduzca un número: ");
        int num2 = pedirNumero();
        System.out.print("Introduzca un número: ");
        int num3 = pedirNumero();
        System.out.print("Introduzca un número: ");
        int num4 = pedirNumero();
        
        //LLamamos al método ordenar que está en otro paquete
        ordenar(num1, num2, num3, num4);
        //Enseñamos por pantalla los números en el orden correcto
        System.out.println("El orden de los números introducidos es: " + num1 + " - " + num2 + " - " + num3 + " - " + num4);
    }
    
}
