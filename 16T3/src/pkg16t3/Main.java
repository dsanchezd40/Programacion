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
