//clases
package e05t5;
/**
 *
 * @author alumno
 */
public class Clases {
    //Atributos
    private String nombre;
    private double nota;
    
    //CONSTRUCTORES
    //Default
    public Clases(){
        this.nombre = "";
        this.nota = 0;
    }
    
    //Parametrizado
    public Clases(String nombre, double nota){
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //GET SET
    //Nombre
    public String getNombre(){
        return nombre;
    }
    public void setMaterial(String nombre){
        this.nombre = nombre;
    }
    
    //Nota
    public double getNota(){
        return nota;
    }
    public void setNota(int nota){
        this.nota = nota;
    }    
}
