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
public class Productos {
    private int id;
    private String nombre;
    private int stock;
    private int precio;
    public Productos(){
        
    }
     public Productos(int id, String nombre, int stock, int precio){
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }
}
