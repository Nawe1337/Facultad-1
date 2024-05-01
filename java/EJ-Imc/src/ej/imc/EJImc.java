/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej.imc;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class EJImc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     
     
        System.out.println("ingrese su peso");
        double peso = leer.nextDouble();
        
        System.out.println(" ingrese su altura");
        double altura = leer.nextDouble();
        
        
        double totalImc = peso / (altura * altura);
        
        System.out.println(" su imc tenienendo en cuenta su altura de " +altura+ " ctms y peso de "+peso+" kg es :");
        System.out.println(totalImc);
    }
    
}
