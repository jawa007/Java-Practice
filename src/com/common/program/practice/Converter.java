package com.common.program.practice;

public class Converter implements IConverter{

	ISocket socket;
	
	@Override
	public int getVolt3() {
		return socket.produce()-9;
	}

	@Override
	public int getVolt6() {
		return socket.produce()-6;
	}

	@Override
	public int getVolt9() {
		return socket.produce()-9;
	}

}
