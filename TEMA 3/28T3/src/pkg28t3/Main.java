//Ejercicio 28 Tema 3
package pkg28t3;

public class Main {

    public static void main(String[] args) {
        double numeroAleatorio = (Math.random()) * 100;
        System.out.println(numeroAleatorio);
        if(numeroAleatorio % 2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
        
    }
    
}
