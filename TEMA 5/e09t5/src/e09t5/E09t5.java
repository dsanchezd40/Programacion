//e9t5
package e09t5;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class E09t5 {

    public static int pedirNumero1(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número");
        return entrada.nextInt();
    }
    
    public static int pedirNumero2(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número");
        return entrada.nextInt();
    }
    
    public static int pedirNumero3(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número");
        return entrada.nextInt();
    }
    
    public static void ordenar(int num1, int num2, int num3){
        
    }
    
    public static void main(String[] args) {
        int num1 = pedirNumero1();
        int num2 = pedirNumero2();
        int num3 = pedirNumero3();
        
        //Crear valor num1
        Numero x = new Numero(num1);
        
        //Crear valor num2
        Numero y = new Numero(num2);
        
        //Crear valor num3
        Numero z = new Numero(num3);
        
        ordenar(num1, num2, num3);
    }
    
}
