//e25t4
package e25t4;

import java.util.Scanner;

public class E25t4 {

    public static int pedirBase() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        return entrada.nextInt();
    }
    
    public static int pedirExponente(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el exponente: ");
        return entrada.nextInt();
    }
    
    public static void elevar(int base, int exponente) {
        System.out.print("El resultado es: " + (int) Math.pow(base, exponente));
    }
    public static void main(String[] args) {
        int base = pedirBase();
        int exponente = pedirExponente();
        elevar(base, exponente);
    }

}
