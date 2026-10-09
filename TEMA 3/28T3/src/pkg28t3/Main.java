//Ejercicio 28 Tema 3
package pkg28t3;

public class Main {

    public static void main(String[] args) {
        
        //Declaramos la variable del número aleatorio y como sale un número decimal lo pasamos a entero mediante un cast, luego lo imprimimos por pantalla
         double aleatorio = Math.floor(Math.random() * 100);
         int entero = (int) aleatorio;
         System.out.println(entero);

        //Comprobamos si el número generado es par o impar usando condicionales
        if (entero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
    
}
