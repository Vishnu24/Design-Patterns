package com.vish.pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * @author Vishnu
 *
 */
public class ReflectionSingletonTest {
	public static void main(String[] args) {
        EagerSingleton instanceOne = EagerSingleton.getInstance();
        EagerSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
