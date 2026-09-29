/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionales;

/**
 *
 * @author alumno
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 4;
        
        //IF
        if (num1 % 2 == 0){
            System.out.println("El número es par");
        }
        
        //IF - ELSE
        if (num1 % 2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        
        //IF - ELSE IF
        if(num1 > 0){
        System.out.println("El número es positivo");
        } else if(num1 > 0) {
            System.out.println("El número es negativo");
            } else {
            System.out.println("El número es 0");
            }
        
        //SWITCH
        switch(num1) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No existe día de la semana");
        }
        
        
        
        
    }
    
}
