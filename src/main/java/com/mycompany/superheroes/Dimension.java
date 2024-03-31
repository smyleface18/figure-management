

package com.mycompany.superheroes;


public class Dimension {
    
    double heigth;
    double width;
    double depth;
    public Dimension() {
        this.heigth = 0;
        this.width = 0;
        this.depth = 0;
    }

    public Dimension(double heigth, double width, double depth) {
        this.heigth = heigth;
        this.width = width;
        this.depth = depth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
    
    
    
   public double getVolumen(){
       double volume = this.depth * this.heigth * this.width;
       return volume;
   }

    @Override
    public String toString() {
        return "Dimension{" + "heigth=" + heigth + ", width=" + width + ", depth=" + depth +  "volume="+ (depth*width*heigth)+  '}';
    }
   
   
    
}
