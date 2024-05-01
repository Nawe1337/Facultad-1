/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pasajegrados;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class PasajeGrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     
        System.out.println(" ingrese la cantidad en grados celsius");
        double celsius = leer.nextFloat();
        
        double pasaje = ( celsius * 9/5)+32;
        
        System.out.println(" el total de "+celsius+"a fahrenheint es "+pasaje);
    }
    
}
