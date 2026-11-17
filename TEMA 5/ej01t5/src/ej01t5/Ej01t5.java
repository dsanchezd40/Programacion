//e1t5
package ej01t5;

/**
 *
 * @author alumno
 */
public class Ej01t5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear miCoche
        Coche miCoche = new Coche();
        miCoche.setModelo("GTI");
        miCoche.setMarca("Golf");
        miCoche.setColor("Rojo");
        
        //Crear cochePadre
        Coche cochePadre = new Coche();
        cochePadre.setModelo("Passat");
        cochePadre.setMarca("Wolskwagen");
        cochePadre.setColor("Negro");
        
        //Arrancar coches
            //miCoche
            miCoche.setAcelerar();
            
            //cochePadre
            cochePadre.getMotorEncencido();
        
        //Acelerar miCoche 5 veces
        for(int i = 1; i < 5; i++){
            miCoche.setAcelerar();
        }
        
        //Frenar miCoche 2 veces
        for(int i = 1; i < 2; i++){
            miCoche.getFrenar();
        }
        
        //Acelerar cochePadre 3 veces
        for(int i = 1; i < 3; i++){
            miCoche.getAcelerar();
        }
        
        //Apagar cochePadre
        cochePadre.getMotorApagado();
        
        //Mostrar estado de miCoche
        System.out.println("=== MI COCHE ===");
        System.out.println(miCoche.toString());
        
        System.out.println(" ");
        
        //Mostrar estado de cochePadre
        System.out.println("=== COCHE PADRE ===");
        System.out.println(cochePadre.toString());
        
    }
    
}
