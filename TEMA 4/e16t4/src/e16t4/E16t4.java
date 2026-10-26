//e16t4
package e16t4;

public class E16t4 {

    public static double raiz(double num64){
        num64=64;
        return Math.sqrt(num64);
    }
    
    public static double cubo(double num8, double numCubo){
        num8=8;
        return Math.pow(num8, numCubo);
    }
    
    public static double exponencial(double num2){
        num2=2;
        return Math.pow(num2, Math.E);
    }
    
    public static double logaritmo(double dec){
        dec=2.71828;
        return Math.log(dec);
    }
    
    public static double menorValor(double num2, double num3){
        num3=3;
        return Math.min(num2, num3);
    }
    
    public static double valorAbs(double num4){
        num4=-4.5;
        return Math.abs(num4);
    }
    
    public static double valorCerc(double num4){
        num4=-4.5;
        return Math.round(num4);
    }
    
    public static double seno(double num45){
        num45=45;
        return Math.sin(num45);
    }
    public static void main(String[] args) {
        double num64 = 64;
        double num8=8;
        double numCubo=3;
        double num2=2;
        double dec=2.71828;
        double num3=3;
        double num4=-4.5;
        double num45=45;
        
        System.out.println("Raíz cuadrada de 64: " + raiz(num64));
        System.out.println("8 elevado al cubo: " + cubo(num8, numCubo));
        System.out.println("Exponencial de 2: " + exponencial(num2));
        System.out.println("Logaritmo de 2,71828: " + logaritmo(dec)); 
        System.out.println("Menor valor entre 2 y 3 : " + menorValor(num2, num3));
        System.out.println("Valor absoluto de -4,5: " + valorAbs(num4)); 
        System.out.println(" Redondeando -4,5 con ROUND: " + valorCerc(num4));
        System.out.println("Seno de 45 grados: " + seno(num45)); 
    }
    
}
