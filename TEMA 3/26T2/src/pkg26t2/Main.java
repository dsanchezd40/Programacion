//Ejercicio 26 Tema 3
package pkg26t2;

public class Main {
    
    public static void main(String[] args) {
        //Declaramos una variable que vaya añadiendo los números impares para que se vayan sumando
        int suma = 0;
        //Usamos un bucle for ya que sabemos el rango de este bucle y le añadimos una condición para detectar si el número es impar
        for(int i = 111; i <= 222; i++){
            if(i % 2 != 0){
                System.out.println(i);
                suma = suma + i;
                i++;
                }
            }
        System.out.println("La suma de estos números es: " + suma);
        }
        
    }
    
