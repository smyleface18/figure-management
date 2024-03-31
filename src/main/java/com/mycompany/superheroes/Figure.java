



package com.mycompany.superheroes;

import com.mycompany.superheroes.Dimension;
import com.mycompany.superheroes.Superheroe;


public class Figure {
    
    String codigo;
    double price;
    Dimension dimension;
    Superheroe superheroe;

    public Figure(String codigo, double price, Dimension dimension, Superheroe superheroe) {
        this.codigo = codigo;
        this.price = price;
        this.dimension = dimension;
        this.superheroe = superheroe;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    @Override
    public String toString() {
        return "Figure{" + "codigo=" + codigo + ", price=" + price + ", dimension=" + dimension + ", superheroe=" + superheroe + '}';
    }
    
    
   public void increasePrice(double newprice){
       this.price = newprice;
   }
    
}
