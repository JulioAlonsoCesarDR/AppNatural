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
public class EntidadMiembros {

    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String correo;
    private int idMiembro;
    private int tel1;
    private int tel2;

    public EntidadMiembros(String nombre, String aPaterno, String aMaterno, String correo, int tel1, int tel2) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.correo = correo;
        this.tel1 = tel1;
        this.tel2 = tel2;
    }

    public EntidadMiembros() {
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
     * @return the aPaterno
     */
    public String getaPaterno() {
        return aPaterno;
    }

    /**
     * @param aPaterno the aPaterno to set
     */
    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    /**
     * @return the aMaterno
     */
    public String getaMaterno() {
        return aMaterno;
    }

    /**
     * @param aMaterno the aMaterno to set
     */
    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the tel1
     */
    public int getTel1() {
        return tel1;
    }

    /**
     * @param tel1 the tel1 to set
     */
    public void setTel1(int tel1) {
        this.tel1 = tel1;
    }

    /**
     * @return the tel2
     */
    public int getTel2() {
        return tel2;
    }

    /**
     * @param tel2 the tel2 to set
     */
    public void setTel2(int tel2) {
        this.tel2 = tel2;
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

}
