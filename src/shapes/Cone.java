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
public class Cone {
    private double height;
    
    public double getHeight(){
        return height;
    }
    public double calcVolume(double r,double h){
        return Math.PI*r*r*(h/3);
    }
    public double calcSA(double r, double h){
        return Math.PI*r*r + Math.PI*r*h;
    }
}
