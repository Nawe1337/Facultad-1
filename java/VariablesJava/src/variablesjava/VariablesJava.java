/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variablesjava;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class VariablesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
      
       /*
      var miVariableEntera2 = 10;
      var miVaribleCadena2 = "seguimos estudiando";
        
        System.out.println("miVaribleCadena2 = " + miVaribleCadena2);
        System.out.println("miVaribleEntera2 = " + miVariableEntera2);
        
        /////////////////////////////////////////////////////
      
         var usuario = "nahuel";
         var titulo = "tecnico";
         var union = titulo +" "+ usuario;
         
         System.out.println("union = " + union); */
       /*
       var a = 8;
       var b = 4;
       var usuario = "nahuel";
        System.out.println(usuario +a+b);*/
       
        System.out.println("proporciona el titulo");
        String titulo = leer.nextLine();
        
        System.out.println(" proporcione el autor");
        String autor = leer.nextLine();
        
        System.out.println(titulo + " fue escrito por "+ autor);
       
    }
    
}
