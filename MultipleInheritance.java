package com.oops;

public class MultipleInheritance {
	
	public static void main(String[] args) {
	//downcasting;	
	Rose rose1=new RedRose();
	RedRose rose=(RedRose)rose1;
	
	// RedRose rose=new RedRose();
	rose.type();
	rose.bloom();
	}
}
//implement all method in interfaces

interface Flower {
	default void bloom() {
		System.out.println("Flower is in bloom");
	}
	void type();
}

interface Rose {
	default void bloom() {
		System.out.println("Rose is bloooming");
	}
}
//hoe interfaces solve multiple inheritance problem.
class RedRose implements Flower, Rose {		
	@Override
	public void type() {
		System.out.println("RedRose is of flower type");
	}
//auto suggestion.
	@Override
	public void bloom() {
		Flower.super.bloom();
		Rose.super.bloom();
	}
}

