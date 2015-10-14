/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author probook
 */
public class EntidadProducto {
    private String clave;
    private String nombre;
    private double precio;
    private int proveedor;
    private int idProd;

    public EntidadProducto() {
    }

    public EntidadProducto(String clave, String nombre, double precio, int proveedor) {
        this.clave = clave;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the proveedor
     */
    public int getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return the idProd
     */
    public int getIdProd() {
        return idProd;
    }

    /**
     * @param idProd the idProd to set
     */
    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }
    
}

