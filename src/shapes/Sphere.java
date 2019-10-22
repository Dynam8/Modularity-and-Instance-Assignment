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
public class Sphere extends Circular{
    public Sphere(double rads){
        radius = rads;
        circ = rads*2*Math.PI;
    }

    public double calcVolume(double rad){
        return 4/3*Math.PI*rad*rad*rad;
    }
}
