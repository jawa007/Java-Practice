package com.common.program.practice;

public class MobileSocket {

	IConverter converter;

	public boolean consume(int volt) {
		if (converter.getVolt3() >= 3) {
			return true;
		}
		return false;
	}
}
