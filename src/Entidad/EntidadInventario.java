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
public class EntidadInventario {
    
   private byte cantiidad;
   private int idProducto;

    public EntidadInventario() {
    }

    public EntidadInventario(byte cantiidad, int idProducto) {
        this.cantiidad = cantiidad;
        this.idProducto = idProducto;
    }

    /**
     * @return the cantiidad
     */
    public byte getCantiidad() {
        return cantiidad;
    }

    /**
     * @param cantiidad the cantiidad to set
     */
    public void setCantiidad(byte cantiidad) {
        this.cantiidad = cantiidad;
    }

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
   
}
