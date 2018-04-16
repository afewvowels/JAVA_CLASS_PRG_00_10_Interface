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
public interface Shape {
    // Any class that implements Shape must define these methods
    public double getArea();
    public void resize(double factor);
}
