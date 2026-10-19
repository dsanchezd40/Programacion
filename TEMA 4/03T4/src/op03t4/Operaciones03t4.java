//Operaciones para 03T4
package op03t4;

/**
 *
 * @author alumno
 */
public class Operaciones03t4 {
    /**
     * Método para detectar el número más grande de entre 3 números
     * @param num1
     * @param num2
     * @param num3 
     */
    public static void ordenar(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3) {
            System.out.println("El número mayor de los introducidos es el " + num1);
    } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número mayor de los introducidos es el " + num2);
    } else if (num3 > num1 && num3 > num2) {
            System.out.println("El número mayor de los introducidos es el " + num3);
    }
    }
}
