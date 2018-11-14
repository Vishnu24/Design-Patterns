/**
 * 
 */
package com.vish.pattern.bridge;

/**
 * @author Vishnu
 * 
 */
public abstract class Shape {
	protected IDraw iDraw;

	protected Shape(IDraw drawAPI) {
		this.iDraw = drawAPI;
	}
	public abstract void draw();
}
