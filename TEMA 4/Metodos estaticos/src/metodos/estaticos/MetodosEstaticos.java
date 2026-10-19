//Apuntes tema 4
package metodos.estaticos;

import java.util.Scanner;
import operadores.Operaciones;


public class MetodosEstaticos {
    /**
     * Método que imprime por pantalla "hola, mundo"
     */
    public static void saludar(){
        System.out.println("Hola, mundo");
    }
    
    /**
     * Método que pide al usuario un número entero
     * 
     * @return el número que escribe al usuario
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Número: ");
        int num = entrada.nextInt();
        return num;
    }
    
    /**
     * Método que multiplica dos números recibidos por parámetro
     * @param num1
     * @param num2
     * @return 
     * Devuelve resultado
     */
    public static int multiplicar(int num1, int num2){
       return num1 * num2; 
    }
    public static void main(String[] args) {
        saludar();
        
        int num1 = pedirNumero();
        int num2 = pedirNumero();
        
        int resultado = multiplicar(num1, num2);
        System.out.println("El resultado es: " + resultado);
        System.out.println(multiplicar(num1, num2));
        
        System.out.println("Multiplcar pasando método por parámetro");
        System.out.println(multiplicar(pedirNumero(), pedirNumero()));
        
        //Llamo al metodo sumar del paquete de operaciones
        Operaciones.sumar(num1, num2);
        
    }
    
}
