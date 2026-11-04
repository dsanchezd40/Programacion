//e23t4
package ej23t4;

/**
 *
 * @author alumno
 */
public class Ej23t4 {

    public final static double VELOCIDADLUZ = 299792458;
    public final static double CONSTANTEUNIVERSALGRAVITACION = 6.67430 * Math.pow(10, -11);
    public final static double CONSTANTEPLANCK = 6.62607015 * Math.pow(10, -34);

   
    public static void mostrarConstantes() {
        System.out.println("Velocidad de la luz: " + VELOCIDADLUZ);
        System.out.println("Constante universal de gravitación: " + CONSTANTEUNIVERSALGRAVITACION);
        System.out.println("Constante de Planck: " + CONSTANTEPLANCK);
    }
    public static void main(String[] args) {
        mostrarConstantes();
    }
    
}
