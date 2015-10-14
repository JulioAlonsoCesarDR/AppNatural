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
public class EntidadUsuario {

    private String nombre;
    private String usuario;
    private int pass;
    private int tipo;

    public EntidadUsuario() {
    }

    public EntidadUsuario(String nombre, String usuario, int pass, int tipo) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.pass = pass;
        this.tipo = tipo;
    }

    public EntidadUsuario(String usuario, int pass, int tipo) {
        this.usuario = usuario;
        this.pass = pass;
        this.tipo = tipo;
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
     * @return the usuario
     */
    public String
            getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the pass
     */
    public int getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(int pass) {
        this.pass = pass;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}
