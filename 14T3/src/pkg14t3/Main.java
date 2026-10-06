////EJERCICIO 14 TEMA 3

//Implementa un algoritmo en JAVA que, utilizando bucles, imprima los 100 primeros números paresImplementa un algoritmo en JAVA que, utilizando bucles, imprima los 100 primeros números pares

package pkg14t3;

public class Main {

    public static void main(String[] args) {
        for(int n = 0; n <= 100; n++) {
            if (n % 2 == 0){
                System.out.println(n);
            }
        }
    }
    
}
