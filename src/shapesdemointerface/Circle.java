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
public class Circle implements Shape {
    double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
    
    @Override
    public void resize(double factor) {
        radius = radius * factor;
    }
}
