package com.core.enum1.program;

//Enum can implemnets Interface but cannot extends 
//Class beacuse implicitly enum extends java.lang.enum 
//and java does not support multiple inheritance.
//We can convert String to Enum using 
public class EnumHowTo {

	public enum Language {
		JAVA(1), PYTHON(2), PERL(3), SCALA(4);

		private int rank;

		// Enum constructor cannot be public or protected
		private Language(int rank) {
			this.rank = rank;
		}

		public int getRank() {
			return rank;
		}

	};

	public static void main(String args[]) {
		String scala = "SCALA";
		// Enum to String using Enum.valueOf()
		Enum language = Enum.valueOf(Language.class, scala);

		// Enum to String using Language.valueOf()
		language = Language.valueOf(scala);

		System.out.println("Java Enum Iterate Example using for loop");
		for (Language pl : Language.values()) {
			System.out.println(pl.name() + " : " + pl.rank);
		}

	}

}
