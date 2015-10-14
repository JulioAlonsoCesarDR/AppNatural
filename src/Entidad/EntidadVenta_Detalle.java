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
public class EntidadVenta_Detalle {
    
    private int idNota;
    private  char fecha;
    private  int idEmpleado;
    private  int idMiembro;
    private  int idPago;
    private  byte noOperacion;
    private  double monto;
    
    private int idProducto;
    private byte cantidad;

    public EntidadVenta_Detalle() {
    }

    public EntidadVenta_Detalle(int idNota, char fecha, int idEmpleado, int idMiembro, int idPago, byte noOperacion, double monto, int idProducto, byte cantidad) {
        this.idNota = idNota;
        this.fecha = fecha;
        this.idEmpleado = idEmpleado;
        this.idMiembro = idMiembro;
        this.idPago = idPago;
        this.noOperacion = noOperacion;
        this.monto = monto;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public EntidadVenta_Detalle(int idNota, char fecha, int idEmpleado, int idMiembro, int idPago, byte noOperacion, double monto) {
        this.idNota = idNota;
        this.fecha = fecha;
        this.idEmpleado = idEmpleado;
        this.idMiembro = idMiembro;
        this.idPago = idPago;
        this.noOperacion = noOperacion;
        this.monto = monto;
    }

    /**
     * @return the idNota
     */
    public int getIdNota() {
        return idNota;
    }

    /**
     * @param idNota the idNota to set
     */
    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    /**
     * @return the fecha
     */
    public char getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(char fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the idMiembro
     */
    public int getIdMiembro() {
        return idMiembro;
    }

    /**
     * @param idMiembro the idMiembro to set
     */
    public void setIdMiembro(int idMiembro) {
        this.idMiembro = idMiembro;
    }

    /**
     * @return the idPago
     */
    public int getIdPago() {
        return idPago;
    }

    /**
     * @param idPago the idPago to set
     */
    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    /**
     * @return the noOperacion
     */
    public byte getNoOperacion() {
        return noOperacion;
    }

    /**
     * @param noOperacion the noOperacion to set
     */
    public void setNoOperacion(byte noOperacion) {
        this.noOperacion = noOperacion;
    }

    /**
     * @return the monto
     */
    public double getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(double monto) {
        this.monto = monto;
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

    /**
     * @return the cantidad
     */
    public byte getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(byte cantidad) {
        this.cantidad = cantidad;
    }
    
}
