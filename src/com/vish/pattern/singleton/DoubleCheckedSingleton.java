package com.vish.pattern.singleton;

/**
 * @author Vishnu
 *
 */
public class DoubleCheckedSingleton {
	 private static DoubleCheckedSingleton instance;
     
	    private DoubleCheckedSingleton(){}
	     
	    public static DoubleCheckedSingleton getInstance(){
	        if(instance == null){
	            synchronized (ThreadSafeSingleton.class) {
	            	if(instance == null)
	            instance = new DoubleCheckedSingleton();
	          }
	        }
	        return instance;
	    }
}
