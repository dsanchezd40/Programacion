//EJERCICIO 13 TEMA 3

//Crea un algoritmo en JAVA que, utilizando un bucle while, imprima los números pares que existen entre el número 11 y el número 133

package pkg13t3;


public class Main {

    
    public static void main(String[] args) {
        int n = 11;
            while(n < 133){
                
                if (n % 2 == 0) {
                    System.out.println(n);
                }
                n++;
            }
    }
}