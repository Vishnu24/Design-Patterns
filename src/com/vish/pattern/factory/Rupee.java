package com.vish.pattern.factory;

/**
 * @author Vishnu
 *
 */
public class Rupee implements Currency{

	@Override
	public String getSymbol() {
		return "Rs.";
	}
}
