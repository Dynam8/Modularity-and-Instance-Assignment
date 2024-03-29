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
public class Pyramid5 extends Triangle{
    
    public Pyramid5(double b, double h, double d){
        base = b;
        height = h;
        depth = d;
    }
    
    public double calcVolume(double b, double h, double d){
        return b*h*d/3;
    }
    public double calcSA(double b, double h){
        double s = Math.sqrt((b*b)+(h*h));
        return b*h + 2*b*s;
    }
}
