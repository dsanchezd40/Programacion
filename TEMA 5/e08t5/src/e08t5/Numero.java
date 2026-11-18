//Número
package e08t5;

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
