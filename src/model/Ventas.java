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
    
   }
