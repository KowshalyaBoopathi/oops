package com.oops;

public class MainMultiple{

	   public static void main(String args[]){
	       main('k');
	       main('l');
	       main("hello java");
	   }

	   public static void main(int i){
	       System.out.println("Overloaded main()"+i);
	   }

	   public static void main(char i){
	       System.out.println("Overloaded main()"+i);
	   }

	   public static void main(String str){
	       System.out.println("Overloaded main()"+str);
	   }
	}
