//e14t4
package e14t4;

import java.util.Scanner;

public class E14t4 {

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Número: ");
        int num = entrada.nextInt();
        return num;
    }
    
    public static void comprobar(boolean mayor0, int num){
        Scanner entrada = new Scanner(System.in);
        for(int i = 1; i > 0; i++){
            if(num > 1){
                mayor0 = true;
            }else{
                mayor0 = false;
                System.out.println("introduce un número mayor que 0:");
                entrada.next();
            }    
        }
    }
    
    public static void generar(int num){
        for(int i = 1; i <= num; i++){
            System.out.println(3*i);
        }
    }
    public static void main(String[] args) {
        int num = pedirNumero();
        boolean mayor0 = false;
        comprobar(mayor0, num);
        generar(num);
        
    }
    
}
