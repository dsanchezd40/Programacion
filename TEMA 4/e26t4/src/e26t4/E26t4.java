//e26t4
package e26t4;
import java.util.Scanner;

public class E26t4 {
    public static int pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        return scanner.nextInt();
    }
    
    public static boolean esPrimo(int numero) {        
        if (numero <= 1) {
            return false;
        }        
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false; 
            }
        }        
        return true;
    }

    public static void mostrarResultado(int numero, boolean primo) {
        if (primo) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
    }

    public static void main(String[] args) {
        int numero = pedirNumero();        
        boolean resultado = esPrimo(numero);
        mostrarResultado(numero, resultado);
    }
}
