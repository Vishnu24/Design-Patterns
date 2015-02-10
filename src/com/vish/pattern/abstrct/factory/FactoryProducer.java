package com.vish.pattern.abstrct.factory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new Shapefactory();
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new Colorfactory();
		}
		return null;
	}
}
