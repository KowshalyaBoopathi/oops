package com.oops;

public class Shapes {
	
	//overriding//run time//dynamic
	
		  public void area() {
		    System.out.println("The formula for area of ");
		  }
		}

		class Triangle extends Shapes {
		  public void area() {
		    System.out.println("Triangle is ½ * base * height ");
		  }
		}
		
		class Circle extends Shapes {
		  public void area() {
		    System.out.println("Circle is 3.14 * radius * radius ");
		  }
		}

