//Método para invocar desde el proyecto
package generar;

/**
 *
 * @author alumno
 */
public class Generar {
    public final static int RANDOM = (int) (Math.random() * 100);
    
    
    public static void recibir (String respuesta, int cant){
        for(int i = 0; i != cant; i++){
            System.out.println(respuesta + RANDOM);
        }
    }
}
