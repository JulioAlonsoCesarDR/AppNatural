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
public class EntidadProveedor {
    
    private char proveedor;
    private char correo;

    public EntidadProveedor() {
    }

    public EntidadProveedor(char proveedor, char correo) {
        this.proveedor = proveedor;
        this.correo = correo;
    }

    /**
     * @return the proveedor
     */
    public char getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(char proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return the correo
     */
    public char getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(char correo) {
        this.correo = correo;
    }
    
}
