//e12t4
package e12t4;

import java.util.Scanner;

public class E12t4 {

    /**
     * Método que pide al usuario un número entero
     *
     * @return el número que escribe al usuario
     */
    public static int pedirContraseña() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Contraseña: ");
        int contraseña = entrada.nextInt();
        return contraseña;
    }

    public static void comprobar(int contraseña, int intentos) {
        Scanner entrada = new Scanner(System.in);
        //SI LA CONTRASEÑA QUE INTRODUCIMOS NO ES LA CORRECTA, SE RESTA UN INTENTO Y TE LO PIDE DE NUEVO HASTA QUE TE QUEDES SIN INTENTOS O ACIERTES

        for (int i = 2; i > 0; i--) {
            if (contraseña != 123) {
                intentos--;
                System.out.println("Contraseña incorrecta, te quedan " + intentos + " intentos. Intente de nuevo:");
                entrada.next();
                //CUANDO GASTAMOS LOS INTENTOS, NOS APARECERÁ UN MENSAJE DE ERROR Y NO NOS DEJARÁ SEGUIR        
                if (intentos == 1) {
                    System.out.println("ERROR DE ACCESO");
                }
            }
        }

    }

    public static void main(String[] args) {
        int intentos = 3;
        int contraseña = pedirContraseña();
        comprobar(contraseña, intentos);
    }

}
