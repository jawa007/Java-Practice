package com.design.pattren.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

	private static final long serialVersionUID = -57018114748160680L;

	// private static Singleton soleInstance= new Singleton();//Eager Initialization

	private static volatile Singleton instance = null;

	//http://howtodoinjava.com/2012/10/22/singleton-design-pattern-in-java/
	
	// private constructor
	private Singleton() {}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				// Double check
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// Another way

}
