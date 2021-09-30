package com.oops;

public class SimpleInheritance {
	public static void main(String[] args) {
		Dog puppy=new Dog();
		puppy.eat();
		puppy.bark();
	}
}

class Animal {
	void eat() {
		System.out.println("eating");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking");
	}
}

class Goat extends Animal {
	void bleet() {
		System.out.println("Goats Bleet");
	}
}

class Cat extends Animal {
	void meow() {
		System.out.println("Cat meows");
	}
}


