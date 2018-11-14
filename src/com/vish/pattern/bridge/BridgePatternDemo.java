/**
 * 
 */
package com.vish.pattern.bridge;

/**
 * @author Vishnu
 *
 */
public class BridgePatternDemo {
	public static void main(String[] args) {
        Shape rect = new Rectangle(new RedColor());
        rect.draw();
         
        Shape circle = new Circle(new GreenColor());
        circle.draw();
    }
}
