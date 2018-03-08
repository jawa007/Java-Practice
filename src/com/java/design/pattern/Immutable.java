package com.java.design.pattern;

public class Immutable {
	public static void main(String... s) {
		Address adr = new Address("1234");
		Check chk = new Check(adr);
		adr.setPinCode("abcd");

		chk.getAdr().setPinCode("abcd");
		System.out.println(chk.getAdr().getPinCode());
	}
}

class Address {
	private String pinCode;

	public Address(String s) {
		this.pinCode = s;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

}

final class Check {

	final private Address adr;

	public Check(Address adr) {
		this.adr = new Address(adr.getPinCode());
	}

	public Address getAdr() {
		return new Address(this.adr.getPinCode());
	}

}
