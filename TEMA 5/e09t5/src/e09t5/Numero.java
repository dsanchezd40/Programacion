/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e09t5;

/**
 *
 * @author alumno
 */
public class Numero {
    //Atributo
    private int valor;
    
    //CONSTRUCTOR
    //Por defecto
    public Numero(){
        this.valor = 0;
    }
    
    //Parametrizado
    public Numero(int valor){
        this.valor = valor;
    }
    
    //GET SET
    public int getValor(){
        return valor;
    }
    public void setValor(int valor){
        this.valor = valor;
    }
}
