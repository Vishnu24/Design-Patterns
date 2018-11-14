/**
 * 
 */
package com.vish.pattern.bridge;

/**
 * @author Vishnu
 *
 */
public class Circle extends Shape {

	/**
	 * @param drawAPI
	 */
	protected Circle(IDraw iDraw) {
		super(iDraw);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.vish.pattern.bridge.Shape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
iDraw.drawColor();
	}

}
