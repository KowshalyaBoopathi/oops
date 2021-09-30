package com.oops;

public class OverloadingExample {
	public static void main(String[] args) {
		Shape shape=new Shape();
		shape.area();
		shape.area(10);
		shape.area(10,20);
		shape.area(10,20,30);
		shape.area(8.5,9.5);
	}
}


class Shape {
	
	void area() {
		System.out.println("Area is ");
	}
	
	void area(int r) {
		int area=(int) (3.14*r*r);
		System.out.println("Area of circle is "+area);
	}
	
	void area(int b, int h) {
		int area=(int) (0.5*b*h);
		System.out.println("Triangle area is "+area);
	}
	
	void area(int l,int b,int h) {
		int area=l*b*h;
		System.out.println("Cuboid area is "+area);
	}
	
	void area(double b, double h) {
		double area=(0.5*b*h);
		System.out.println("Triangle area is "+area);
	}
}