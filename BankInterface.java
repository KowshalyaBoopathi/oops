package com.oops;

public class BankInterface {
	   public static void main(String args[]) {
		   Printable icici = new Bank();
		   icici.print();
		   Transaction trans = new Bank();
		   trans.print();
		   int amount=trans.withdrawAmount();
		   System.out.println(amount);	   
	   }
}
