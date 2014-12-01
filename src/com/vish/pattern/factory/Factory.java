package com.vish.pattern.factory;

/**
 * @author Vishnu
 *
 */
public class Factory {
	public static void main(String args[]) {
		Currency currency = CurrencyFactory.createCurrency("India");
		System.out.println(currency.getSymbol());
	}
}
