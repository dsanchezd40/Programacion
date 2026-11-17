package pruebaclases;

/**
 *
 * @author alumno
 */
public class Bicicleta {
    
    //Atributos (NUNCA se inicializa en la declaración)
    private String marca;
    private String color;
    private float precio;
    private int year;
    
    //Atributo static (si se inicializa en la declaración)
    private static int contadorBicicleta = 0;
    
    //Atributo de otra clase
    private Ciclista ciclista;
    
    
    //CONSTRUCTORES
    // 1. Por defecto
    public Bicicleta(){
        this.marca = "";
        this.color = "";
        this.precio = 0.0f;
        this.year = 0;
        
        this.ciclista = new Ciclista();
        
        aumentarContadorBicicleta();
    }
    // 2. Parametrizado
    public Bicicleta(String marca, String color, float precio, int year, Ciclista ciclista){
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.year = year;

        this.ciclista = ciclista;
        
        aumentarContadorBicicleta();
    }
    
    // 3. Personalizado
    public Bicicleta(String color){
       this.marca = "";
       this.color = color;
       this.precio = 0.0f;
       this.year = 0;
    }
    
    
    //Metodos
    //Getters - Setters
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String m){
        marca = m;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String c){
        color = c;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public void setPrecio(float p){
        precio = p;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setYear(int y){
        year = y;
    }
    
    public static int getContadorBicicleta(){
        return contadorBicicleta;
    }
    
    public Ciclista getCiclista(){
        return ciclista;
    }
    public void setCiclista(Ciclista ciclista){
        ciclista = ciclista;
    }
    
    //Otros métodos
    public void mostrarAntiguedad(){
        if(year > 10){
            System.out.println("La bici es antigua");
        }else{
            System.out.println("La bici es nueva");
        }
    }   
    
    public static void aumentarContadorBicicleta(){
        contadorBicicleta++;
    }
    
    
    //Método mostrar         
    public void mostrarBicicleta(){
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
        System.out.println("Años: " + year);
        System.out.println("Ciclista: " + ciclista.toString());
    }
    
    //toString
    @Override
    public String toString(){
        return "Marca: " + marca 
                + ", Color: " + color 
                + ", Precio: " + precio 
                + ", Años: " + year 
                + ", Ciclista: " + ciclista;
    }
}
