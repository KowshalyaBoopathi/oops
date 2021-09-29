package com.oops;

public abstract class Sample {
	   public abstract void demo();
	}

class Super1 extends Sample{
	   public void demo() {
	      System.out.println("demo method of super1");
	   }
	}

class Super2 extends Sample{
	   public void demo() {
	      System.out.println("demo method of super2");
	   }
	}
