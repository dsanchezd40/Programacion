//CAJERO AUTOMÁTICO
package cajero;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Cajero {

    public static void main(String[] args) {
        int opt;
        double saldo = 1000.00;
        double cantidad;
        int err = 0;
        Scanner entrada = new Scanner(System.in);
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
                    break;
                case 2:
                    System.out.println("Ingresar");
                    System.out.print("Indice la cantidad de dinero que desea ingresar: ");
                    cantidad = entrada.nextDouble();
                    if(cantidad > 0){
                        saldo = saldo + cantidad;
                        System.out.println("Ahora dispones de " + saldo + " € en la cuenta");
                    }else{
                        System.out.println("Operación incorrecta");
                        err++;
                        cantidad = entrada.nextDouble();
                    }
                    break;
                case 3:
                    System.out.println("Retirar");
                    System.out.print("Indice la cantidad de dinero que desea retirar: ");
                    cantidad = entrada.nextDouble();
                    if(cantidad > 0 && cantidad <= saldo){
                        saldo = saldo - cantidad;
                        System.out.println("Ahora dispones de " + saldo + " € en la cuenta");
                    }else{
                        System.out.println("No puedes retirar más dinero del que tienes");
                        err++;
                        cantidad = entrada.nextDouble();
                }while (cantidad > 0 && cantidad <= saldo)
                    break;
                case 4:
                    System.out.println("Salir");
                    System.out.println("Nº de errores: " + err);
                    break;
                    default:
                System.out.println("No existe esa opción");
                    break;
            }
        }catch(InputMismatchException e){
            System.out.println("Debes colocar un número y no una letra");
            entrada.next();
        }
        
    }
    
}
