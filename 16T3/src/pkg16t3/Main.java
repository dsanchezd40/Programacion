//EJERCICIO 16 TEMA 3

//Crea un programa que imprima los números impares que existen entre los números 20 y el 160. Además, al final, nos dirá cuantos impares ha imprimido en total por pantalla

package pkg16t3;

public class Main {

    public static void main(String[] args) {
        int total = 0;
        for(int i = 20; i < 160; i++){
            if (i % 2 != 0) {
                    System.out.println(i);
                    total++;
                }
        }
        System.out.println("La cantidad de números impares impresos ha sido: " + total);
    }
    
}
