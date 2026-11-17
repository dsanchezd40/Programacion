//Coche
package e03t5;

/**
 *
 * @author alumno
 */
public class Coche {
    //Atributos
    private String marca;
    private String cadena;
    
    //Atributo de otra clase
    private Rueda ruedas;
    
    //CONSTRUCTORES
    //Default
    public Coche(){
        this.marca = "";
        this.cadena = "";
        
        this.ruedas = ruedas;
    }
    //Parametrizado
    public Coche(String marca, String cadena, Rueda ruedas){
        this.marca = marca;
        this.cadena = cadena;
        
        this.ruedas = ruedas;
    }
    
    
    //GETTERS Y SETTERS
    //Marca
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    //Cadena
    public String getCadena(){
        return cadena;
    }
    public void setCadena(String cadena){
        this.cadena = cadena;
    }
    
    //Ruedas
    public Rueda getRuedas(){
        return ruedas;
    }
    public void setRuedas(Rueda ruedas){
        this.ruedas = ruedas;
    }
    
    //Método mostrar -- toString()
    @Override
    public String toString(){
        return "Marca: " + marca 
                + " // Cadena: " + cadena 
                + " // Destalles de la rueda: " + ruedas.toString();
    }
    
}
