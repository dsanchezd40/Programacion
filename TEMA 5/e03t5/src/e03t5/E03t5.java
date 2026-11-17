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
        Coche coche1 = new Coche("AUDI", "A3 Sportback", rueda1);
        System.out.println(coche1);
        
        //Crear coche2
        Coche coche2 = new Coche("Volkswagen", "Golf GTI", rueda1);
        System.out.println(coche2);
        
        //Crear coche3
        Coche coche3 = new Coche("Volkswagen", "Passat", rueda2);
        System.out.println(coche3);
    }
    
}
