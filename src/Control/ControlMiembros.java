/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author probook
 */
public class ControlMiembros {

    private final Conexion conexion = new Conexion();
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;

    public ControlMiembros() {
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

    public ResultSet selectMiembros() {
        try {
            String query = "SELECT `nombre`, `aPaterno`, `aMaterno`,`tel1`,`tel2`, `correo`FROM `Miembros`mie INNER JOIN `telmiembros` tel ON mie.idmiembros = tel.idmiembros;";
            rs = st.executeQuery(query);

            return rs;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ResultSet selectMiembrosNombre() {
        try {
            String query = "SELECT `nombre` FROM Miembros;";
            rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ResultSet selectMiembroID() {
        try {
            String query = "SELECT `idMiembros` FROM Miembros;";
            rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public ResultSet selectProdNom(Entidad.EntidadMiembros pd) {
        try {
            String query = "SELECT`idMiembros`, `clave`, `nombre`, `precio`, `idProveedor` FROM `Miembros` WHERE nombre = ?;";
            ps = (PreparedStatement) conexion.getConexionMYSQL().prepareStatement(query);
            ps.setString(1, pd.getNombre());

            rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ResultSetMetaData selectMiembrosRSM() throws SQLException {
        String cadSQL = "SELECT `nombre`, `aPaterno`, `aMaterno`, `tel1`,`tel2`, `correo`FROM `Miembros`mie INNER JOIN `telmiembros` tel ON mie.idmiembros = tel.idmiembros;";

        ps = (PreparedStatement) conexion.getConexionMYSQL().prepareStatement(cadSQL);
        rs = ps.executeQuery();
        ResultSetMetaData rm = rs.getMetaData();
        return rm;
    }

    public void delete(int id) {
        try {
            String query = "DELETE FROM Miembros WHERE idMiembros = " + id + ";";
            st.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public boolean insertCompleo(Entidad.EntidadMiembros mie) {
        try {
            String query = "INSERT INTO `Miembros` (`nombre`, `apaterno`, `amaterno`, `correo`) VALUES ( ?, ?, ?, ?);";
            ps = (PreparedStatement) conexion.getConexionMYSQL().prepareStatement(query);
            ps.setString(1, mie.getNombre());
            ps.setString(2, mie.getaPaterno());
            ps.setString(3, mie.getaMaterno());
            ps.setString(4, mie.getCorreo());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean insertAMaterno(Entidad.EntidadMiembros mie) {
        try {
            String query = "INSERT INTO `Miembros` (`nombre`, `apaterno`, `correo`) VALUES ( ?, ?, ?);";
            ps = (PreparedStatement) conexion.getConexionMYSQL().prepareStatement(query);
            ps.setString(1, mie.getNombre());
            ps.setString(2, mie.getaPaterno());
            ps.setString(3, mie.getCorreo());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean insertCorreo(Entidad.EntidadMiembros mie) {
        try {
            String query = "INSERT INTO `Miembros` (`nombre`, `apaterno`, `amaterno`) VALUES ( ?, ?, ?);";
            ps = (PreparedStatement) conexion.getConexionMYSQL().prepareStatement(query);
            ps.setString(1, mie.getNombre());
            ps.setString(2, mie.getaPaterno());
            ps.setString(2, mie.getaMaterno());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean insertCorreoAmaterno(Entidad.EntidadMiembros mie) {
        try {
            String query = "INSERT INTO `Miembros` (`nombre`, `apaterno`) VALUES ( ?, ?);";
            ps = (PreparedStatement) conexion.getConexionMYSQL().prepareStatement(query);
            ps.setString(1, mie.getNombre());
            ps.setString(2, mie.getaPaterno());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(Entidad.EntidadMiembros pd) {
        try {
            String query = "UPDATE `Miembros` SET `clave`= ?,`nombre`= ?,`precio`=? WHERE idMiembros = ?";
            ps = (PreparedStatement) conexion.getConexionMYSQL().prepareStatement(query);
//            ps.setString(1, pd.getClave());
//            ps.setString(2, pd.getNombre());
//            ps.setDouble(3, pd.getPrecio());
//            ps.setInt(4, pd.getIdProd());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
