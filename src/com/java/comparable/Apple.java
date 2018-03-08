package com.java.comparable;

public class Apple implements Comparable<Apple> {

	private String variety;

	private Color color;

	private int weight;
	
	
	

	public Apple(String variety, Color color, int weight) {
		super();
		this.variety = variety;
		this.color = color;
		this.weight = weight;
	}




	@Override
	public int compareTo(Apple other) {
		int result = this.variety.compareTo(other.variety);

		if (result != 0) {
			return result;
		}

		if (result == 0) {
			result = this.color.compareTo(other.color);
		}

		if (result != 0) {
			return result;
		}

		if (result == 0) {
			result = Integer.compare(this.weight, other.weight);
		}
		return result;
	}

	@Override
	public String toString() {
		return "Apple [variety=" + variety + ", color=" + color + ", weight=" + weight + "]";
	}

	
	
}
