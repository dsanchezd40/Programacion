package op06t4;

/**
 *
 * @author alumno
 */
public class Operaciones06t4 {
    /**
     * Método para valorar la nota introducida con una calificación entre 1 y 10
     * @param num1 
     */
    public static void valorar(int num1){
        switch(num1) {
            case 0:
            case 1: 
            case 2:   
            case 3: 
            case 4: {
                System.out.println("Suspenso");
                break;
            }
            case 5:
            case 6: {
                System.out.println("Bien");
                break;
            }
            case 7:
            case 8: {
                System.out.println("Notable");
                break;
            }
            case 9:
            case 10: {
                System.out.println("Sobresaliente");
                break;
            }
            default: {
                System.out.println("Error, no se ha detectado ninguna nota entre 0 y 10");
            }
        }
    }
}
