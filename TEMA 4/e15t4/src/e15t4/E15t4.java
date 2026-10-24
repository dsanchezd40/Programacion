//e15t4
package e15t4;

import java.util.Scanner;

public class E15t4 {

    /**
     * Método para pedir el dato al usuario
     * @return 
     */
    public static int pedirNumero1(int x) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número:");
        x = entrada.nextInt();
        return x;
    }
    
    public static int pedirNumero2(int y) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ahora, introduce otro número:");
        y = entrada.nextInt();
        return y;
    }
    
    public static int menu(int x, int y, int opt, int z){
        Scanner entrada = new Scanner(System.in);
        do{
            //Mostramos el menú al usuario
            System.out.println("1. Sumar los números"); 
            System.out.println("2. restar los números");
            System.out.println("3. Multiplicar los números");
            System.out.println("4. Dividir los números");
            System.out.println("5. Salir del programa");
            
            //Le pedimos que elija una opción
            System.out.println("Elija una opción");
            opt = entrada.nextInt();
        
        
            //Abrimos switch para realizar las operaciones que nos indique el usuario y detectamos si nos pide dividir con 0
            try{  
                switch(opt){
                    case 1:{
                        z = x + y;
                        System.out.println("La suma es: " + z); 
                        break;
                    }
                    case 2:{
                        z = x - y;
                        System.out.println("La resta es: " + z);
                        break;
                    }
                    case 3:{
                        z = x * y;
                        System.out.println("La multiplicación es; " + z);
                        break;
                    }
                    case 4:{
                        z = x / y;
                        System.out.println("La división es: " + z);
                        break;
                    }
                    case 5:{
                        System.out.println("Programa cerrado");
                    }
                }
        
            }catch(ArithmeticException e){
                System.out.println("No se puede dividir con 0");
            }
            
        } while(opt != 5);
    } return
    public static void main(String[] args) {
        pedirNumero1(x);
        pedirNumero2(y);
        menu(x, y, opt, z);
    }
    
}
