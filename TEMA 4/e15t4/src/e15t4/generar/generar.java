//Método para invocar desde el proyecto
package e15t4.generar;

/**
 *
 * @author alumno
 */
public class generar {
    public static void recibir (String respuesta, int cant){
        for(int i = 0; i != cant; i++){
            System.out.println(respuesta + (Math.random() * 100));
        }
    }
}
