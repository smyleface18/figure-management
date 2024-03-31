/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superheroes;

import com.mycompany.superheroes.Figure;
import java.util.ArrayList;

public class Coleccion {
    
    String nameColletion;
    ArrayList <Figure> listFigures = new ArrayList <>();

    public Coleccion(String nameColletion) {
        this.nameColletion = nameColletion;
        

        
    }

    public String getNameColletion() {
        return nameColletion;
    }

    public void setNameColletion(String nameColletion) {
        this.nameColletion = nameColletion;
    }
    
   public void addFigure(Figure fig){
   
       this.listFigures.add(fig);
   }
   
   public void increaseprice(double newprice,String id){
       for (Figure fig : this.listFigures){
           if(fig.codigo == id ){
               fig.increasePrice(newprice);
               break;
           }
       }
   }

    @Override
    public String toString() {
        return "Coleccion{" + "nameColletion=" + nameColletion + ", listFigures=" + listFigures + '}';
    }
    
    
   public String layerToString(){
       
       String figuresLayers = "";
       
       for(Figure fig: this.listFigures){
           if (fig.superheroe.layer == true){
               figuresLayers += fig.superheroe.name;
           }
       }
       
       return figuresLayers;
   }
   
   public ArrayList<Figure> figurevaluable(){
       
        ArrayList<Figure> figureValuable = new ArrayList<>();
       
       figureValuable.add(this.listFigures.get(0));
       
       int size = this.listFigures.size();
       
       for (int i = 1; i < size; i++) {
           Figure fig = this.listFigures.get(i);
           if( fig.price> figureValuable.get(0).price){
                
                figureValuable.clear();
                figureValuable.set(0, fig);
           }
           else if (fig.price == figureValuable.get(0).price){
               figureValuable.add(fig);
           }
       }

       return figureValuable;
   }
   
   public double getValueColletion(){
       
       double valueColletion = 0;
       
       for(Figure fig : this.listFigures){
           valueColletion += fig.price;
       }
       
       return valueColletion;
   }
   
   public double gitVolumeColletion(){
       double volumeColletion = 0;
       
       for(Figure fig:this.listFigures){
           double width  = fig.dimension.width;
           double heigth = fig.dimension.heigth;
           double depth  = fig.dimension.depth;
           
           volumeColletion += (width*heigth*depth);
       }
       
       return volumeColletion;
   }
}
