/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Productos;
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
    
    public void crearProducto(String nombre, int stock, int precio, int estado) throws SQLException  {
        sql = "INSERT INTO productos VALUES (null, '" +nombre +"', '" + stock + "', '" + precio +"', '"+ estado+ "');";
        oConexion.ejecutar(sql);
        System.out.println(sql);
    }
    
    public void actualizarProducto(int id,String nombre, int stock, int precio, int estado) throws SQLException  {
        sql = "UPDATE productos SET id='" + id +"', nombre='" +nombre +"', stock='" + stock + "', precio='" + precio +"', estado='"+ estado+ "' WHERE id='"+id+"';";
        oConexion.ejecutar(sql);
        System.out.println(sql);
    }
    
    public void borrarProducto(int id) throws SQLException{
        sql = "DELETE FROM productos WHERE id='"+id+"';";
        oConexion.ejecutar(sql);
        System.out.println(sql);
    }
    
    public DefaultTableModel show_table_productos() throws SQLException{
        sql = "SELECT * FROM productos;";
        oConexion.ejecutarSelect(sql);
        System.out.println(sql);
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"ID","NOMBRE","STOCK","PRECIO","ESTADO"});
        
        try {
            while(oConexion.rs.next()){
                modelo.addRow(new Object[]{oConexion.rs.getInt("id"), oConexion.rs.getString("nombre"), oConexion.rs.getInt("stock"), oConexion.rs.getInt("precio"), oConexion.rs.getInt("estado")});
            }
        return modelo;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
    public Productos esProductos(int id) throws SQLException{
        sql = "SELECT * FROM productos WHERE id='"+id+"';";
        System.out.println(sql);
        oConexion.rs = oConexion.ejecutarSelect(sql);
        Productos oProductos = new Productos();
        if(oConexion.rs.next()){          
            oProductos.setId(oConexion.rs.getInt(1));
            oProductos.setNombre(oConexion.rs.getString(2));
            oProductos.setStock(oConexion.rs.getInt(3));
            oProductos.setPrecio(oConexion.rs.getInt(4));
            oProductos.setEstado(oConexion.rs.getInt(5));
            return oProductos;
        }else{
            return null;
        }
    }
    
    public void getProductos(Productos oProductos) throws SQLException{
        
        sql = "SELECT * FROM productos WHERE id='"+oProductos.getId()+"';";
        oConexion.ejecutarSelect(sql);
        
        while(oConexion.rs.next()){
            oProductos.setId(oConexion.rs.getInt("id"));
            oProductos.setNombre(oConexion.rs.getString("nombre"));
            oProductos.setStock(oConexion.rs.getInt("stock"));
            oProductos.setPrecio(oConexion.rs.getInt("precio"));
            oProductos.setEstado(oConexion.rs.getInt("estado"));
            
        }
    }
    
    
    public void crearVenta(int id, int id_user, int total, int fecha_venta, int estado) throws SQLException{
    sql = "INSERT INTO ventas VALUES (null, '" +id_user +"', '" +total + "', '" + fecha_venta +"', '"+ estado+ "');";
    oConexion.ejecutar(sql);
    System.out.println(sql);
    }
    
    
    
}
