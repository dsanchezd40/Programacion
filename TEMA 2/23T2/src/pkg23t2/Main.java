package pkg23t2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double precio;
        int unidades;
        double precioTotal;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        precio = entrada.nextDouble();
        
        System.out.println("¿Cuántas unidades quiere llevarse? ");
        unidades = entrada.nextInt();
        
        precioTotal = precio * unidades;
        
        System.out.println("El precio total de su compra es de : " + precioTotal + " euros.");
    }
    
}
