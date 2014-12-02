package com.vish.pattern.singleton;

/**
 * @author Vishnu
 *
 */
public class EagerSingleton {
	private static  EagerSingleton instance = new EagerSingleton();
	 
    private EagerSingleton() {
    }
 
    /**
     * @return
     */
    public static EagerSingleton getInstance() {
        return instance;
    }
}
