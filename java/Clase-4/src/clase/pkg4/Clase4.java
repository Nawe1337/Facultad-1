/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg4;

/**
 *
 * @author nahue
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        //byte 
        
       byte numEnteroByte = 127;
        System.out.println("numeroEnteroByte = "+numEnteroByte);
        System.out.println(" el numero maximo en byte es "+ Byte.MAX_VALUE);
        System.out.println(" el numero minimo en byte es "+ Byte.MIN_VALUE);
        
        //short
       short numeroEnteroShort = 32727;
        System.out.println(" numero entero short "+ numeroEnteroShort);
        System.out.println(" el numero maximo short es "+ Short.MAX_VALUE);
        System.out.println(" el numero minimo short es "+ Short.MIN_VALUE);
        
        //int
        int numEnteroInt = (int) 2147483647L; // L mayuscula se utiliza para cuando supera el limite permitido 
        System.out.println("numEnteroInt = "+numEnteroInt);
        System.out.println("valor maximo es "+ Integer.MAX_VALUE);
        System.out.println("valor minimo es "+ Integer.MIN_VALUE);
         
        //long
        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = "+ numEnteroLong);
        System.out.println("valor maximo es "+ Long.MAX_VALUE);   
         System.out.println("valor minimo es "+ Long.MIN_VALUE);
        
        //Float
        
        float numFlotante = 10.0F;
        System.out.println("numFlotante = " + numFlotante);
        System.out.println("el valor minimo de float es "+ Float.MIN_VALUE);
        System.out.println("el valor maximo de floar es "+ Float.MAX_VALUE);
        
        double numDouble = 10.002;
        System.out.println("numDouble = " + numDouble);
        System.out.println(" el numero maximo es "+ Double.MAX_VALUE);
        System.out.println(" el numero minimo es "+ Double.MIN_VALUE);
        
        
        
    }
    
}
