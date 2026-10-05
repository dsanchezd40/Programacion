package pkg16t2;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dineroTotal = 130;
        int billetesCincuenta;
        int billetesDiez;
        
        billetesCincuenta = dineroTotal / 50;
        billetesDiez = (dineroTotal % 50) / 10;
        
        System.out.println("130 euros hacen un total de: " + billetesCincuenta + " billetes de 50 euros y " + billetesDiez + " billetes de 10 euros");
        
    }
    
}
