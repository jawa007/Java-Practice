package com.test.design.pattern;

import java.io.Serializable;

public class SingletonExample implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private volatile static SingletonExample singletonInstance;
	
	// private constructor restricted to this class itself
	private SingletonExample() {
	}

	public static SingletonExample getSingletonInstance() {
		if (null == singletonInstance) {
			synchronized (SingletonExample.class) {
				if (null == singletonInstance) {
					singletonInstance = new SingletonExample();
				}
			}
		}
		return singletonInstance;
	}

	protected Object readResolve() {
		return singletonInstance;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
