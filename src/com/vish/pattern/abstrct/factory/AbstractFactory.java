package com.vish.pattern.abstrct.factory;

public abstract class AbstractFactory {
	abstract Color getColor(String color); 
	abstract Shape getShape(String shape) ;
}
