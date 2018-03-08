package com.java.serialversionuid;

import java.io.Serializable;

public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	
	static String name="STATIC";
    String street="TRANSIENT";
	transient String type="TRANSIENT";
	//final transient String type="TRANSIENT";
	String country;
	

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreet() {
		return this.street;
	}

	public String getCountry() {
		return this.country;
	}
		

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Address.name = name;
	}

	@Override
	public String toString() {
		return new StringBuffer(" Street : ").append(this.street).append(" Country : ").append(this.country).append(" name : ").append(this.name).append(" type : ").append(this.type).toString();
	}

	public String getType() {
		return type;
	}

//	public void setType(String type) {
//		this.type = type;
//	}
}
