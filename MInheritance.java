package com.oops;

/*interface Event {
	   public void start();
	}
interface Sports {
	   public void play();
	}
interface Hockey extends Sports, Event{
	   public void show();
	}
public class MInheritance{
	   public static void main(String[] args){
	      Hockey hockey = new Hockey() {
	         public void start() {
	            System.out.println("Start Event");
	         }
	         public void play() {
	            System.out.println("Play Sports.");
	         }
	         public void show() {
	            System.out.println("Show Hockey.");
	         }
	      };

	      hockey.start();
	      hockey.play();
	      hockey.show();
	   }
}*/

interface Flower1 {
	default void bloom() {
		System.out.println("Flower is in bloom");
	}
	void colour();
}

class Rose1 {
	void size() {
		System.out.println("Rose is big in size");
	}
}

class BigRose extends Rose1 implements Flower1{
	
	@Override
	public void colour() {
		System.out.println("Big rose is red in color");
	}
	
	public void bloom() {
		//Flower1.super.bloom();
		System.out.println("bigrose is in bloom");
	}
}

public class MInheritance{
	   public static void main(String[] args){
		   BigRose r=new BigRose();
		   r.colour();
		   r.bloom();
		   r.size();
	   }
}
