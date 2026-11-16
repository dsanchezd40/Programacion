//coche
package e01t5;

/**
 *
 * @author alumno
 */
public class Coche {
    
    //Atributos del coche
    private String marca;
    private String modelo;
    private String color;
    private int speed;
    private boolean motorEncendido = false;
    
    //Métodos públicos
    //Marca
    public String getMarca(){
        return marca;
    }    
    public void setMarca(String m){
        marca = m;
    }
    
    //Modelo
    public String getModelo(){
        return modelo;
    }   
    public void setModelo(String mod){
        modelo = mod;
    }
    
    //Color
    public String getColor(){
        return color;
    }   
    public void setColor(String c){
        color = c;
    }
    
    //Arrancar coche
    public int getMotorEncencido(){
        return speed;
    }   
    public void setMotorEncendido(int s){
        motorEncendido = true;
        s = 10;
    }
    
    //Apagar coche
    public int getMotorApagado(){
        return speed;
    }   
    public void setMotorApagado(int s){
        motorEncendido = false;
        s = 0;
    }
    
    //Acelerar coche
    public int getAcelerar(){
        return speed;
    }   
    public void setAcelerar(int s){
        s = 20;
    }
    
    //Frenar coche
    public int getFrenar(){
        return speed;
    }   
    public void setFrenar(int s){
        s = 6;
    }
    
    //Obtener Estado
    public void MostrarEStado(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color " + color);
        System.out.println("Velocidad: " + speed);
    }
    
}
