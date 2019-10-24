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
public class TriPrism extends Triangle{
    public TriPrism(double b, double h, double d){
        base = b;
        height = h;
        depth = d;
    }
    
    public double calcVolume(double b, double h, double d){
        return (b*h/2)*d;
    }
    public double calcSA(double b, double h, double d){
        double s = Math.sqrt((b*b)+(h*h));
        return (b*h)+(2*s*d)+(b*d);
    }
}
