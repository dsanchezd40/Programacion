//EJERCICIO 12 TEMA 3

//Crea un algoritmo en JAVA que, utilizando un bucle do…while, imprima los números pares que existen entre el número 11 y el número 133

package pkg12t3;

public class Main {

    public static void main(String[] args) {
        int n = 11;
            do {
                n++;
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            } while(n < 133);
    }
    
}
