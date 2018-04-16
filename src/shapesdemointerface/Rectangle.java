/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesdemointerface;

/**
 *
 * @author kbsmith01
 */
public class Rectangle implements Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return this.width * this.height;
    }
    
    @Override
    public void resize(double factor) {
        this.width = this.width * factor;
        this.height = this.height * factor;
    }
}
