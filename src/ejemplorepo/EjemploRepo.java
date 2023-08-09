/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplorepo;

/**
 *
 * @author Ale
 */
public class EjemploRepo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hola, mundo!");
        
        Caramelo candyLemmon = new Caramelo("Limon", 4);
        
        System.out.println(candyLemmon.getSabor() + " " + candyLemmon.getCantidadPaquete());
        
        Alfajor jorgito=new Alfajor("Chocolate", 300);
        
    }
    
}
