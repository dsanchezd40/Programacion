//e2t5
package e02t5;

/**
 *
 * @author alumno
 */
public class E02t5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear curso 1
        Cursos curso1 = new Cursos();
        curso1.setNombre("Finanzas");
        curso1.setHoras(50);
        
        //Incrementar contador en 1
        Cursos.aumentarNumeroCursos();
        
        // Crear curso 2
        Cursos curso2 = new Cursos();
        curso2.setNombre("Programación");
        curso2.setHoras(80);
        
        //Incrementar contador en 1
        Cursos.aumentarNumeroCursos();
        
        //Mostrar datos curso 1 y 2
        System.out.println("=== CURSO 1 ===");
        curso1.MostrarEstado();
        System.out.println(" ");
        System.out.println("=== CURSO 2 ===");
        curso2.MostrarEstado();
        System.out.println(" ");
        
        //Mostrar número de cursos
        System.out.println("=== TOTAL DE CURSOS ===");
        System.out.println(Cursos.getContadorCursos());
    }
    
}
