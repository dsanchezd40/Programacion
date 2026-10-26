//e17t4
package e17t4;

/**
 *
 * @author alumno
 */
public class E17t4 {

    public static void generarLetra(double aleatorio){
        aleatorio = (Math.floor(Math.random()*26)+97);
        char letra = (char) aleatorio;
    }
    public static void pedirLetra(char letraUser){
        System.out.println("Introduce una letra:");
        letraUser
    }
    public static void main(String[] args) {
        double aleatorio=0;
        generarLetra(aleatorio);
    }
    
}
