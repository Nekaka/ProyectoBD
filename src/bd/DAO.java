/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;
import java.sql.SQLException;
import model.Usuario;
/**
 *
 * @author vania
 */
public class DAO {
    
    private Conexion oConexion;
    
    public DAO() throws SQLException {
            oConexion = new Conexion("localhost", "BDnegocio", "root", "");
        }
    
    public void crearUsuario(Usuario oUsuario) throws SQLException  {
        String sql = "INSERT INTO usuario (null, '" + oUsuario.getUser() +"', '" + oUsuario.getPass() +"', '" + oUsuario.getNom_ape() + "');";
        
    }
    
}
