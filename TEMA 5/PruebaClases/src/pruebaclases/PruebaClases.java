package pruebaclases;

/**
 *
 * @author alumno
 */
public class PruebaClases {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Crear bici-1
        Bicicleta bici1 = new Bicicleta();
        bici1.setMarca("Orbea");
        bici1.setColor("Rojo");
        bici1.setPrecio(100f);
        bici1.setYear(5);
        
        //Incrementar contador de bicis en 1
        Bicicleta.aumentarContadorBicicleta();
        
        //Crear bici-2
        Bicicleta bici2 = new Bicicleta();
        bici2.setMarca("Mérida");
        bici2.setColor("azul");
        bici2.setPrecio(500f);
        bici2.setYear(15);
        
        //Incrementar contador de bicis en 1
        //Bicicleta.aumentarContadorBicicleta();
        
        //Mostrar bici-1 con Mostrar
        System.out.println("=====BICI-1=====");
        bici1.mostrarBicicleta();
        
        System.out.println(" ");
        
        //Mostrar bici-2 con toString()
        System.out.println("=====BICI-2=====");
        System.out.println(bici2.toString());
        
        System.out.println(" ");
        
        //Mostrar color bici-1
        System.out.println("=====COLOR BICI-1=====");
        System.out.println(bici1.getColor());
        
        System.out.println(" ");
        
        //Contador
        System.out.println("=====CONTADOR DE BICICLETAS=====");
        System.out.println(Bicicleta.getContadorBicicleta());
        
        
        //Crear bici con constructor parametrizado
        //Bicicleta bici3 = new Bicicleta("Canyon", "negro", 2000, 3);
        
        System.out.println(Bicicleta.getContadorBicicleta());
        
        Ciclista c1 = new Ciclista("Pepe", 1);
        System.out.println(c1);
        
        Bicicleta bici4 = new Bicicleta("Canyon", "negro", 2000, 3, c1);
        System.out.println(bici4);
        
        Bicicleta bici5 = new Bicicleta("Canyon", "negro", 2000, 3, new Ciclista());
        System.out.println(bici5);
        
        Bicicleta bici6 = new Bicicleta("Canyon", "negro", 2000, 3, new Ciclista("Ana", 2));
        System.out.println(bici6);
    }
    
}
