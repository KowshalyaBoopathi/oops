package com.oops;

public class overriding {
		  public static void main(String[] args) {
		    Shapes myShape = new Shapes();  
		    Shapes myTriangle = new Triangle();  
		    Shapes myCircle = new Circle(); 
		    myShape.area();
		    myTriangle.area();
		    myShape.area();
		    myCircle.area();
		  }
}
