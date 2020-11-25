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
public class Pedido {
    private int id;
    private String producto;
    private int cantidad;
    public Pedido(){
        
    }
    public Pedido(int id, String producto, int cantidad){
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
    }
}
