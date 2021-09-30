package com.oops;

public class MultilevelInheritance {
	public static void main(String[] args) {
		Puppy puppy=new Puppy();
		puppy.eat();
		puppy.bark();
		puppy.sound();
	}
}

class Animals {
	void eat() {
		System.out.println("eating");
	}
}

class Dogs extends Animals {
	void bark() {
		System.out.println("barking");
	}
}

class Puppy extends Dogs {
	void sound() {
		System.out.println("whining");
	}
}
