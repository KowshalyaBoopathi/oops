package com.oops;

public class CalculateAbstractClass {
	public static void main(String[] args) {
		Addition add=new Addition();
		Subtraction sub=new Subtraction();
		Multiply mul=new Multiply();
		Division div = new Division();
		
		
		add.calculate(20, 10);
		sub.calculate(20, 10);
		mul.calculate(20, 10);
		div.calculate(20, 10);

	}

}
