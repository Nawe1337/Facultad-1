/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendalibrios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class TiendaLibrios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Pidiendo datos
        System.out.println("Ingrese el nombre del libro");
        String nombre = leer.nextLine();
        System.out.println("digite el ID del libro");
        int ID = leer.nextInt();
        System.out.println(" Digite el precio del libro");
        double presio = leer.nextDouble();
        System.out.println(" presione 1 si el envio es gratis");
        int envio = leer.nextInt();
        
        
        System.out.println(" El nombre del libro es: "+ nombre);
        System.out.println(" El id del libro es: "+ID);
        System.out.println(" El presio del libro es: "+presio);
        if ( envio == 1){
            System.out.println(" El envio es gratis ");
        }
        else{
            System.out.println(" El envio no es gratis ");
        }
    }
    
}
