/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author vania
 */
public class Ventas {
    private int id;
    private int id_user;
    private int total;
    private String id_producto;
    
    public Ventas(){
        
    }
    
    public Ventas(int id, int id_user,int total, String id_producto){
        this.id = id;
        this.id_user = id_user;
        this.total = total;
        this.id_producto = id_producto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }
    
    
    
   }
