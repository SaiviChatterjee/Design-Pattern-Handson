package com.cognizant.com;

public class FactortGetter {

	public static Factory getFactory(String factory) {
		if(factory.equalsIgnoreCase("audi")) {
			return new AudiFactory();
		}
		else if(factory.equalsIgnoreCase("mercedes")) {
			return new MercedesFactory();
		}
		else
			return null;
	}
}
