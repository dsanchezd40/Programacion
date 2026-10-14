//CAJERO AUTOMÁTICO
package cajero;
//Importamor Escáner y Excepción
import java.util.InputMismatchException;
import java.util.Scanner;
public class Cajero {

    public static void main(String[] args) {
        //Declaramos variables
        int opt = 0;
        double saldo = 1000.00;
        double cantidad;
        int err = 0;
        int op = 0;
        int pin = 123;
        int tries = 3;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca el PIN: ");
        pin = entrada.nextInt();
        
        if(pin != 123){
            do{
              tries--;
              System.out.print("Incorrecto. " + tries + " intentos restantes: ");
              entrada.next();  
            }while(tries != 1);  
        }else{
            System.out.println("Contraseña correcta");
            do{
                System.out.println("Elija una opción:");
                System.out.println("1. Conslutar");
                System.out.println("2. Ingresar");
                System.out.println("3. Retirar");
                System.out.println("4. Salir");
        
        
                try{
                    opt = entrada.nextInt();
                    switch (opt){
                        case 1:
                            System.out.println("Consultar");
                            System.out.println(saldo + " €");
                            op++;
                            break;
                        case 2:
                            System.out.println("Ingresar");
                            System.out.print("Indice la cantidad de dinero que desea ingresar: ");
                            cantidad = entrada.nextDouble();
                            op++;
                            if(cantidad > 0){
                                saldo = saldo + cantidad;
                                System.out.println("Ahora dispones de " + saldo + " € en la cuenta");
                            }else{
                                System.out.println("Operación incorrecta");
                                err++;
                            }
                            break;
                        case 3:
                            System.out.println("Retirar");
                            System.out.print("Indice la cantidad de dinero que desea retirar: ");
                            cantidad = entrada.nextDouble();
                            op++;
                            if(cantidad > 0 && cantidad <= saldo){
                                if(cantidad > 500){
                                    System.out.println("No se pude retirar más de 500€");
                                }else{
                                    saldo = saldo - cantidad;
                                }
                                System.out.println("Ahora dispones de " + saldo + " € en la cuenta");
                            }else{
                                System.out.println("No puedes retirar más dinero del que tienes");
                                err++;
                                cantidad = entrada.nextDouble();
                            }while (cantidad > 0 && cantidad <= saldo)
                            break;
                        case 4:
                            System.out.println("Salir");
                            System.out.println("Saldo: " + saldo);
                            System.out.println("Nº de errores: " + err);
                            System.out.println("Nº de operaciones: " + op);
                            break;
                        default:
                            System.out.println("No existe esa opción");
                            break;
                    }
                }catch(InputMismatchException e){
                    System.out.println("Debes colocar un número y no una letra");
                    entrada.next();
                }
        
            }while(opt != 4);
        }
        if(tries <= 0){
            System.out.println("SISTEMA BLOQUEADO");
        }
    }
}
