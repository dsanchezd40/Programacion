//e13t4
package e13t4;

import java.util.Scanner;

public class E13t4 {
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Número: ");
        int num = entrada.nextInt();
        return num;
    }
    
    public static void comprobar(boolean mayor1, int num){
        Scanner entrada = new Scanner(System.in);
        if(num > 1){
            mayor1 = true;
        }else{
            mayor1 = false;
            System.out.println("introduce un número mayor que 1:");
            entrada.next();
        }
    }
    
    public static void generar(int num){
        for(int i = 1; i <= num; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int num = pedirNumero();
        boolean mayor1 = false;
        comprobar(mayor1, num);
        generar(num);
        
    }
    
}
