/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superheroes;

/**
 *
 * @author caleb
 */
public class Superheroe {
    
    String name;
    String description ;
    boolean layer;

    public Superheroe(String name) {
        this.name = name;
        this.layer = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isLayer() {
        return layer;
    }

    public void setLayer(boolean layer) {
        this.layer = layer;
    }

    @Override
    public String toString() {
        return "Superheroe{" + "name=" + name + ", description=" + description + ", layer=" + layer + '}';
    }
    
    

    
    
}
