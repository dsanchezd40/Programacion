//e5t5
package e05t5;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class E05t5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, introduzca la nota de Programación: ");
        double nPr = entrada.nextDouble();
        
        System.out.print("Por favor, introduzca la nota de Lenguaje de Marcas: ");
        double nLM = entrada.nextDouble();
        
        System.out.print("Por favor, introduzca la nota de Bases de Datos: ");
        double nBD = entrada.nextDouble();
        
        System.out.print("Por favor, introduzca la nota de Entornos de Desarrollo: ");
        double nED = entrada.nextDouble();
        
        System.out.print("Por favor, introduzca la nota de Sistemas Informáticos: ");
        double nSI = entrada.nextDouble();
        
        System.out.print("Por favor, introduzca la nota de Formación y Orientación Laboral: ");
        int nFOL = entrada.nextInt();
    
        //Crear asignatura Programación
        Clases progr = new Clases("Programación", nPr);
        
        //Crear asignatura LMSGI
        Clases lmsgi = new Clases("Lenguaje de Marcas", nLM);
        
        //Crear asignatura BD
        Clases bDatos = new Clases("Bases de Datos", nBD);
        
        //Crear asignatura ED
        Clases eDes = new Clases("Entornos de Desarrollo", nED);
        
        //Crear asignatura SI
        Clases sInf = new Clases("Sistemas Informáticos", nSI);
        
        //Crear asignatura FOL
        Clases fol = new Clases("Formación y Orientación Laboral", nFOL);
        
        
        System.out.println("La nota media del curso es: " + NotaMedia.calcularMedia(nPr, nLM, nBD, nED, nSI, nFOL));
        
        
    }
    
}
