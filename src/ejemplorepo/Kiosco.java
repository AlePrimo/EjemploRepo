/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplorepo;

/**
 *
 * @author josel
 */
public class Kiosco {
    
    private String ciudad;
    private String direccion;
    private String cliente;

    public Kiosco(String ciudad, String direccion, String cliente) {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.cliente = cliente;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
}
