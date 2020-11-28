/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
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
    
    public void crearUsuario(String user, String pass, String nom_ape) throws SQLException  {
        sql = "INSERT INTO usuario VALUES (null, '" + user +"', '" + pass +"', '" + nom_ape + "');";
        oConexion.ejecutar(sql);
        System.out.println(sql);
    }
    
    public void borrarUsuario(int id) throws SQLException{
        sql = "DELETE FROM usuario WHERE id='"+id+"';";
        oConexion.ejecutar(sql);
        System.out.println(sql);
    }
    
    public void actualizarUsuario(int id, String user, String pass, String nom_ape) throws SQLException{
        sql = "UPDATE usuario SET user='"+user+"', pass='"+pass+"', nom_ape='"+nom_ape+"' WHERE id='"+id+"';";
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
    
    public DefaultTableModel show_table_user() throws SQLException{
        sql = "SELECT * FROM usuario;"; 
        oConexion.ejecutarSelect(sql);
        System.out.println(sql);
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"ID","USER","PASS","NOM_APE"});
        
        try{
        while(oConexion.rs.next()){
            modelo.addRow(new Object[]{oConexion.rs.getInt("id"), oConexion.rs.getString("user"), oConexion.rs.getString("pass"), oConexion.rs.getString("nom_ape")});
        }
        return modelo;
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
}
