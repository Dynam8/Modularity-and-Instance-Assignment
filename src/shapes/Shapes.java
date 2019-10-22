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
public class Shapes {
    protected double volume;
    protected double SA;
    
    void putVolume(double v){
        System.out.printf("The volume of the object is "+Math.round(v)+"\n");
    }
    void putSA(double sa){
        System.out.printf("The surface area of the object is"+Math.round(sa)+"\n");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sphere mine = new Sphere(10.0);
        mine.volume = mine.calcVolume(mine.radius);
        mine.putVolume(mine.volume);
    }
    
}
