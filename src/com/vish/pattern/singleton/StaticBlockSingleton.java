package com.vish.pattern.singleton;

/**
 * @author Vishnu
 *
 */
public class StaticBlockSingleton {
	 private static StaticBlockSingleton instance;
     
	    private StaticBlockSingleton(){}
	     
	    static{
	        try{
	            instance = new StaticBlockSingleton();
	        }catch(Exception e){
	            throw new RuntimeException("Exception is occured in creating singleton instance");
	        }
	    }
	     
	    public static StaticBlockSingleton getInstance(){
	        return instance;
	    }
}
