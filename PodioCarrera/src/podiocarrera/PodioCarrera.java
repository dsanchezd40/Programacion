package podiocarrera;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class PodioCarrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        int aux;
        int diferencia;
        
         Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca el primer tiempo: ");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca el segundo tiempo: ");
        num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer tiempo: ");
        num3 = entrada.nextInt();
        System.out.println("Por último, introduzca el cuarto tiempo: ");
        num4 = entrada.nextInt();
        
        //PRIMERA VUELTA
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        } else if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        } else if (num3 > num4) {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        
        //SEGUNDA VUELTA
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        } else if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        } else if (num3 > num4) {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        
        //TERCERA VUELTA
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        } else if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        } else if (num3 > num4) {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        
        //CUARTA VUELTA
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        } else if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        } else if (num3 > num4) {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        
        //CASO DE EMPATE ENTRE 1º Y 2º
        if (num1 == num2) {
            System.out.println("Hay empate en el primer puesto.");
            diferencia = num1 - num2;
            System.out.println("Diferencia 1º - 2º: " + diferencia + "s");
        } else {
            System.out.println("No hay empate");
        }
        
        //CASO DE EMPATE ENTRE 2º Y 3º
        if (num2 == num3); {
            System.out.println("Hay empate entre el 2º y 3º puesto");
    }
        //CASO DE EMPATE ENTRE 3º Y 4º
        if (num3 == num4) {
            System.out.println("Hay empate entre el 3º y 4º puesto");
    }
        //CASO DE 3 EMPATES POR ENCIMA
        if (num1 == num2 && num2 == num3) {
            System.out.println("Hay un empate entre los 3 primeros");
    }
       //CASO DE 3 EMPATES POR DEBAJO 
        if (num2 == num3 && num3 == num4) {
            System.out.println("Hay un empate entre los 3 últimos");
    }
        //CASO DE 4 EMPATES
        if (num1 == num2 && num3 == num4){
            System.out.println("Ha habido un empate total");
    }
        
        
        
        
        System.out.println("1º puesto: " + num1 + "s");
        System.out.println("2º puesto: " + num2 + "s");
        System.out.println("3º puesto: " + num3 + "s");
        System.out.println("4º puesto: " + num4 + "s"); 
    }
    
}
