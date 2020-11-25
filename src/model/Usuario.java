/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nekaka
 */
public class Usuario {
    private int id;
    private String user;
    private String pass;
    private String nom_ape;
    
    public Usuario(){
        
    }
    
    public Usuario(int id, String user, String pass, String nom_ape){
        this.id = id;
        this.user = user;
        this.pass = pass;
        this.nom_ape = nom_ape;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNom_ape() {
        return nom_ape;
    }

    public void setNom_ape(String nom_ape) {
        this.nom_ape = nom_ape;
    }
    
    
    
}
