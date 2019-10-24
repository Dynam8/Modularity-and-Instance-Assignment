/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author S331471193
 */
public class Prism extends Shapes{
    protected double length;
    protected double width;
    protected double height;
    
    public Prism(double l, double w, double h){
        // constructor for actual prisms
        length = l;
        width = w;
        height = h;
    }
    public Prism(double b){
        // Constructor for Cubes
        length = b;
        width = b;
        height = b;
    }
    
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double calcVolume(double l, double w, double h){
        return l*w*h;
    }
    public double calcSA(double l, double w, double h){
        return (2*l*w) + (2*l*h) + (2*w*h);
    }
}
