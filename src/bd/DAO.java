/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;
import java.sql.SQLException;
/**
 *
 * @author vania
 */
public class DAO {
private Conexion oConexion;
public DAO() throws SQLException {
        oConexion = new Conexion("localhost", "BDnegocio", "root", "");
    }
    
}
