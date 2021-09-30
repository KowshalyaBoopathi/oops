package com.oops;

public abstract class Calculate {
	 /*void calculate(int a,int b) {
		 System.out.println("The two numbers are");
	 }*/
	
	abstract void calculate(int a,int b);
}


class Addition extends Calculate{
	void calculate(int a,int b) {
		System.out.println("Sum"+" "+(a+b));
	}
}

class Subtraction extends Calculate{
	void calculate(int a,int b) {
		System.out.println("Minus"+" "+(a-b));
	}
}

class Multiply extends Calculate{
	void calculate(int a,int b) {
		System.out.println("Multiply"+" "+(a*b));
	}
}

class Division extends Calculate{
	void calculate(int a,int b) {
		System.out.println("Division"+" "+(a/b));
	}
}

