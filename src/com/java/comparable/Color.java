package com.java.comparable;

public class Color implements Comparable<Color> {
	
	private String color;

	
	
	public Color(String color) {
		super();
		this.color = color;
	}



	@Override
	public int compareTo(Color o) {
		return this.color.compareTo(o.color);
	}



	@Override
	public String toString() {
		return "Color [color=" + color + "]";
	}

	
}
