package com.design.pattren.singleton;

import java.io.Serializable;

public class SingletonAlternate implements Serializable  {
	private static final long serialVersionUID = 1L;
	 
    private SingletonAlternate() {
        // private constructor
    }
 
    private static class DemoSingletonHolder {
        public static final SingletonAlternate INSTANCE = new SingletonAlternate();
    }
 
    public static SingletonAlternate getInstance() {
        return DemoSingletonHolder.INSTANCE;
    }
 
    protected Object readResolve() {
        return getInstance();
    }
}
