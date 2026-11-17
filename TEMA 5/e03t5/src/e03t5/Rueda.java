//Rueda
package e03t5;

/**
 *
 * @author alumno
 */
public class Rueda {
    //Atributos
    private String material;
    private int numPulgadas;
    
    //CONSTRUCTORES
    //Default
    public Rueda(){
        this.material = "";
        this.numPulgadas = 0;
    }
    //Parametrizado
    public Rueda(String material, int numPulgadas){
        this.material = material;
        this.numPulgadas = numPulgadas;
    }
    
    //GETTERS Y SETTERS
    //Material
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String nombre){
        this.material = material;
    }
    
    //Número de Ruedas
    public int getPulgadas(){
        return numPulgadas;
    }
    public void setPulgadas(int numPulgadas){
        this.numPulgadas = numPulgadas;
    }
    
    //Mostrar en pantalla
    public void MostrarEstado(){
        System.out.println("Material: " + material);
        System.out.println("Número de pulgadas: " + numPulgadas);
    }
}
