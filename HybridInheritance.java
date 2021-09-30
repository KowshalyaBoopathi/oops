package com.oops;

public class HybridInheritance {
	public static void main(String[] args) {
	GreenBanana gb=new GreenBanana();
	gb.color();
	gb.twocolor();
	}
}

class Fruit {
	void color() {
		System.out.println("Fruits can be in any color ");
	}
}

class Banana extends Fruit {
	void color() {
		System.out.println("Banana is in yellow color");
	}
}

class Watermelon extends Fruit {
	void color() {
		System.out.println("Watermelon is in green color");
	}
}
//what about water melon class???
class GreenBanana extends Banana {
	void twocolor() {
		System.out.println("Banana is in green color");
	}
}