//e3t5
package e03t5;

/**
 *
 * @author alumno
 */
public class E03t5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear rueda1
        Rueda rueda1 = new Rueda();
        rueda1.setMaterial("Goma");
        rueda1.setPulgadas(30);
        
        //Crear rueda2
        Rueda rueda2 = new Rueda();
        rueda2.setMaterial("Fibra");
        rueda2.setPulgadas(40);
        
        //Crear coche1
        Coche coche1 = new Coche("AUDI", "A3 Sportback");

        
        //Crear coche2
        Coche coche2 = new Coche("Volkswagen", "Golf GTI");
        
        
        //Crear coche3
        Coche coche3 = new Coche();
        coche3.setMarca("Volkswagen");
        coche3.setCadena("Passat");
        
    }
    
}
