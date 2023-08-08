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
public class Caramelo {
    private String sabor;
    private int cantidadPaquete;

    public Caramelo(String sabor, int cantidadPaquete) {
        this.sabor = sabor;
        this.cantidadPaquete = cantidadPaquete;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getCantidadPaquete() {
        return cantidadPaquete;
    }

    public void setCantidadPaquete(int cantidadPaquete) {
        this.cantidadPaquete = cantidadPaquete;
    }
    
    
    
}
