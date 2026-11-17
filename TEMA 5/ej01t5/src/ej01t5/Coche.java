//coche
package ej01t5;

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
    
    //Constructor
    //Por defecto
    public Coche(){
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.speed = 0;
        this.motorEncendido = false;
    }
    //Parametrizado
    public Coche(String marca, String modelo, String color, int speed, boolean motorEncendido){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.speed = speed;
        this.motorEncendido = motorEncendido;
    }
    
    
    //Métodos públicos
    //Marca
    public String getMarca(){
        return marca;
    }    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    //Modelo
    public String getModelo(){
        return modelo;
    }   
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    //Color
    public String getColor(){
        return color;
    }   
    public void setColor(String color){
        this.color = color;
    }
    
    //Arrancar coche
    public int getMotorEncencido(){
        return speed;
    }   
    public void setMotorEncendido(int speed){
        motorEncendido = true;
        this.speed = 10;
    }
    
    //Apagar coche
    public int getMotorApagado(){
        return speed;
    }   
    public void setMotorApagado(){
        motorEncendido = false;
        this.speed = 0;
    }
    
    //Acelerar coche
    public int getAcelerar(){
        return speed;
    }   
    public void setAcelerar(){
        this.speed = speed + 20;
    }
    
    //Frenar coche
    public int getFrenar(){
        return speed;
    }   
    public void setFrenar(){
        this.speed = speed - 6;
    }
    
    //Obtener Estado
    public void MostrarEStado(){
        System.out.println(" ");
        System.out.println("===== COCHE =====");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color " + color);
        System.out.println("Velocidad: " + speed);
    }
    
    //toString
    @Override
    public String toString(){
        return "Marca: " + marca 
                + ", Modelo: " + modelo 
                + ", color: " + color 
                + ", Velocidad: " + speed; 
    }
    
}
