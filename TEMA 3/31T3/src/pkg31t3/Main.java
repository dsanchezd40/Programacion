//Ejercicio 31 tema 3
package pkg31t3;

public class Main {

    public static void main(String[] args) {
        int imp = 0;
        int tries = 0;
        
        while(imp < 3){
            int n = (int) (Math.random() * 100);
            System.out.println(n);
            tries++;
            if(n % 2 != 0){
                imp++;
            } 
        }
            
        System.out.println("Han sido generados " + tries + " números para obtener 3 impares");
    }
    
}
