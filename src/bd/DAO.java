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
    private String sql;// se crea una variable String para almacenar la consulta temporalmente
    
    public DAO() throws SQLException {
            oConexion = new Conexion("localhost", "BDnegocio", "root", "");
        }
    
    public void crearUsuario(Usuario oUsuario) throws SQLException  {
        sql = "INSERT INTO usuario (null, '" + oUsuario.getUser() +"', '" + oUsuario.getPass() +"', '" + oUsuario.getNom_ape() + "');";
        oConexion.ejecutar(sql);
        System.out.println(sql);
    }
    
    public void borrarUsuario(int id) throws SQLException{
        sql = "DELETE FROM usuario WHERE id='"+id+"';";
        oConexion.ejecutar(sql);
        System.out.println(sql);
    }
    
    public void actualizarUsuario(Usuario oUsuario) throws SQLException{
        sql = "UPDATE usuario SET user='"+oUsuario.getUser()+"', pass='"+oUsuario.getPass()+"', nom_ape='"+oUsuario.getNom_ape()+"' WHERE id='"+oUsuario.getId()+"';";
        oConexion.ejecutar(sql);
        System.out.println(sql);
    }
    
    public Usuario esUsuario(String user, String pass) throws SQLException{
        sql="SELECT * FROM usuario WHERE user='"+user+"' AND pass='"+pass+"';";
        System.out.println(sql);
        oConexion.rs = oConexion.ejecutarSelect(sql);
        Usuario oUsuario;
        if(oConexion.rs.next()){
            oUsuario = new Usuario();
            oUsuario.setId(oConexion.rs.getInt(1));
            oUsuario.setUser(oConexion.rs.getString(2));
            oUsuario.setPass(oConexion.rs.getString(3));
            oUsuario.setNom_ape(oConexion.rs.getString(4));
            return oUsuario;  
        }else{
            return null;
        }
        
    }
}
