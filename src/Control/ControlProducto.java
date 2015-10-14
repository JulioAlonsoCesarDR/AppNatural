/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidad.EntidadProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author probook
 */
public class ControlProducto {

    private Conexion conexion = new Conexion();
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;

    public ControlProducto() {
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

    public ResultSet selectProducto() {
        try {
            String query = "SELECT `clave`, `nombre`, `precio`, `proveedor`FROM `producto`pro INNER JOIN `proveedor` p ON pro.idProveedor = p.idProveedor;";
            rs = st.executeQuery(query);

            return rs;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ResultSet selectProductoNombre() {
        try {
            String query = "SELECT `nombre` FROM producto;";
            rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ResultSet selectProdNom(Entidad.EntidadProducto pd) {
        try {
            String query = "SELECT`idProducto`, `clave`, `nombre`, `precio`, `idProveedor` FROM `producto` WHERE nombre = ?;";

            ps = (PreparedStatement) conexion.getConexionMYSQL().prepareStatement(query);
            ps.setString(1, pd.getNombre());

            rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ResultSetMetaData selectProductoRSM() throws SQLException {
        String cadSQL = "SELECT `clave`, `nombre`, `precio`, `proveedor`FROM `producto`pro INNER JOIN `proveedor` p ON pro.idProveedor = p.idProveedor;";

        ps = (PreparedStatement) conexion.getConexionMYSQL().prepareStatement(cadSQL);
        rs = ps.executeQuery();
        ResultSetMetaData rm = rs.getMetaData();
        return rm;
    }

    public void delete(int id) {
        try {
            String query = "DELETE FROM producto WHERE idProducto = "+id+";";
           
             st.executeUpdate(query);
           
        } catch (Exception e) {
            e.printStackTrace();
           
        }
    }

    public boolean insert(Entidad.EntidadProducto pd) {
        try {
            String query = "INSERT INTO `producto` (`clave`, `nombre`, `precio`, `idProveedor`) VALUES ( ?, ?, ?, ?);";
            ps = (PreparedStatement) conexion.getConexionMYSQL().prepareStatement(query);
            //ps = (PreparedStatement) con.prepareStatement(query);
            ps.setString(1, pd.getClave());
            ps.setString(2, pd.getNombre());
            ps.setDouble(3, pd.getPrecio());
            ps.setInt(4, pd.getProveedor());
            ps.executeUpdate();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(Entidad.EntidadProducto pd) {
        try {
            String query = "UPDATE `producto` SET `clave`= ?,`nombre`= ?,`precio`=? WHERE idProducto = ?";
            ps = (PreparedStatement) conexion.getConexionMYSQL().prepareStatement(query);
            ps.setString(1, pd.getClave());
            ps.setString(2, pd.getNombre());
            ps.setDouble(3, pd.getPrecio());
            ps.setInt(4, pd.getIdProd());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public static void main(String[] args) {
        ControlProducto cp = new ControlProducto();
       
    }
    

}
