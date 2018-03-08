package com.core.techgig;

public class Camel implements Rideable{
	int weight =2;
	public static void main(String[] args) {
		new Camel().go(8);
	}
	private void go(int speed) {
		++speed;
		weight++;
		int walkRate=speed*weight;
		System.out.println(walkRate+getGait());
	}
	@Override
	public String getGait() {
		return "mph,lope";
	}

}
