//Cursos
package e02t5;

/**
 *
 * @author alumno
 */
public class Cursos {
    //Atributos
    private String nombre;
    private int numeroHoras;
    
    //Atributo estático
    private static int numeroCursos = 0;
    
    //CONSTRUCTORES
    //Default
    public Cursos(){
        this.nombre = "";
        this.numeroHoras = 0;
        aumentarNumeroCursos();
    }
    
    //Parametrizado
    public Cursos(String nombre, int numeroHoras){
        this.nombre = nombre;
        this.numeroHoras = numeroHoras;
    }
    
    //GETTERS Y SETTERS
    
    //Nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //Horas
    public int getHoras(){
        return numeroHoras;
    }
    public void setHoras(int numeroHoras){
        this.numeroHoras = numeroHoras;
    }
    
    public static int getContadorCursos(){
        return numeroCursos;
    }
    
    //CONTADOR
    public static void aumentarNumeroCursos(){
        numeroCursos++;
    }
    
    
    //Mostrar en pantalla
    public void MostrarEstado(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Horas: " + numeroHoras);
    }
    
    
    
}
