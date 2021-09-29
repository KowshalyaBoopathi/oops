package com.oops;

public abstract class AbstractClass {
	abstract void calculate(int a,int b);
}


class Addition{
	void calculate(int a,int b) {
		System.out.println("Sum"+" "+(a+b));
	}
}

class Subtraction{
	void calculate(int a,int b) {
		System.out.println("Minus"+" "+(a-b));
	}
}

class Multiply{
	void calculate(int a,int b) {
		System.out.println("Multiply"+" "+(a*b));
	}
}
