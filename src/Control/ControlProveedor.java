/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author probook
 */
public class ControlProveedor {
     private Conexion conexion = new Conexion();
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;

    public ControlProveedor() {
        try {
            if ((con = conexion.getConexionMYSQL()) == null) {
                JOptionPane.showMessageDialog(null, "Error con la conexion a la BD");
                return;
            }
            st = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public ResultSet selectProveedor() {
        try {
            String query = "SELECT `proveedor` FROM `proveedor`;";
            rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

         
}
