//e8t5
package e08t5;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class E08t5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = entrada.nextInt();
        
        //Crear valor
        Numero x = new Numero(num);
        
        //Comprobar si es par o impar
        EsPar.esPar(num);
    }
    
}
