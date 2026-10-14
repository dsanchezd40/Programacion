//CAJERO AUTOMÁTICO
package cajeroauto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CAJEROAUTO {

    public static void main(String[] args) {
        // Declaramos variables
        int opt = 0;
        double saldo = 1000.00;
        double cantidad;
        int err = 0;
        int op = 0;
        int pin = 0; // Inicializado para capturar la entrada
        int tries = 3; // Definimos 3 intentos totales
        
        Scanner entrada = new Scanner(System.in);
        
        // Bucle de control de acceso por PIN
        while (tries > 0 && pin != 123) {
            System.out.print("Por favor, introduzca el PIN: ");
            pin = entrada.nextInt();
            
            if (pin != 123) {
                tries--;
                if (tries > 0) {
                    System.out.println("Incorrecto. " + tries + " intentos restantes ");
                }
            }
        }
        
        // Si el PIN es correcto, entra al menú principal
        if (pin == 123) {
            System.out.println("Correcto");
            do {
                System.out.println("Elija una opción:");
                System.out.println("1. Consultar");
                System.out.println("2. Ingresar");
                System.out.println("3. Retirar");
                System.out.println("4. Salir");
                try {
                    opt = entrada.nextInt();
                    switch (opt) {
                        case 1:
                            System.out.println("Consultar");
                            System.out.println(saldo + " €");
                            op++;
                            break;
                        case 2:
                            System.out.println("Ingresar");
                            System.out.print("Indique la cantidad de dinero que desea ingresar: ");
                            cantidad = entrada.nextDouble();
                            op++;
                            if (cantidad > 0) {
                                saldo = saldo + cantidad;
                                System.out.println("Ahora dispones de " + saldo + " € en la cuenta");
                            } else {
                                System.out.println("Operación incorrecta");
                                err++;
                            }
                            break;
                        case 3:
                            System.out.println("Retirar");
                            System.out.print("Indique la cantidad de dinero que desea retirar: ");
                            cantidad = entrada.nextDouble();
                            op++;
                            if (cantidad > 0 && cantidad <= saldo) {
                                if (cantidad > 500) {
                                    System.out.println("No se puede retirar más de 500€");
                                } else {
                                    saldo = saldo - cantidad;
                                    System.out.println("Ahora dispones de " + saldo + " € en la cuenta");
                                }
                            } else {
                                System.out.println("No puedes retirar más dinero del que tienes");
                                err++;
                            }
                            break;
                        case 4:
                            System.out.println("Salir");
                            System.out.println("Saldo: " + saldo);
                            System.out.println("N° de errores: " + err);
                            System.out.println("N° de operaciones: " + op);
                            break;
                        default:
                            System.out.println("No existe esa opción");
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Debes colocar un número y no una letra");
                    entrada.next(); // Limpia el buffer del escáner
                }
            } while (opt != 4);
            
        } else {
            // Si agota los intentos sin acertar el PIN
            System.out.println("SISTEMA BLOQUEADO");
        }
    }
    
}
