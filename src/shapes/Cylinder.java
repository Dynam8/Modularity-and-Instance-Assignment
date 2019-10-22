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
public class Cylinder extends Circular{
    private double height;
    
    public Cylinder(double r, double h){
        radius = r;
        height = h;
    }
    
    public double calcVolume(double r, double h){
        return Math.PI*r*r*h;
    }
    public double calcSA(double r, double h){
        return 2*Math.PI*r*r + 2*Math.PI*r*h;
    }
    public double getHeight(){
        return height;
    }
}
