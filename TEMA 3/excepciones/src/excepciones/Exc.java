package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
package excepciones;

/**
 *
 * @author alumno
 */
public class excepciones
        
        
        
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            Scanner entrada = new Scanner (System.in);
            System.out.println("Edad:");
            int edad = entrada.nextInt();
            
        }catch(InputMismatchException e){
            System.out.println("Dato no válido");
        } finally {
            System.out.println("Dato pedido al usuario");
        }
        }
    
}
