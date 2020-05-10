package com.cognizant.com;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory type1 = FactortGetter.getFactory("audi");
		Headlight headlight1 = type1.makeHeadlight();
		headlight1.headlightType();
		Tire tire1 = type1.makeTire();
		tire1.tireType();
		
		Factory type2 = FactortGetter.getFactory("mercedes");
		Headlight headlight2 = type2.makeHeadlight();
		headlight2.headlightType();
		Tire tire2 = type2.makeTire();		
		tire2.tireType();
		
	}

}
