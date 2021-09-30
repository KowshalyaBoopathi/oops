package com.oops;

public class MultipleInheritance {
	
	public static void main(String[] args) {
	Rose rose=new RedRose();
	//rose.type();
	rose.bloom();
	}
}


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

class RedRose implements Flower, Rose {		
	@Override
	public void type() {
		System.out.println("RedRose is of flower type");
	}

	@Override
	public void bloom() {
		Flower.super.bloom();
	}
}

