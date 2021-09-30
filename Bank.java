package com.oops;

interface Printable {
	default void print() {
		System.out.println("The receipt is from printable");
	}
	}

interface Transaction {
	default void print() {
		System.out.println("The receipt is from transaction");
	}
	int withdrawAmount();
	}
	
interface Receipt {
	void receiptPrinting();
}
public class Bank implements Transaction, Printable {

	@Override
	public void print() {
		System.out.println("The amount is withdrawn form ICICI ATM");
		   Printable.super.print();
		   Transaction.super.print();
	}

	@Override
	public int withdrawAmount() {
		int amount=1000;
		return amount;
	}
}

/*class BankOne implements Transaction, Printable {

	@Override
	public int withdrawAmount() {
		int amount=2000;
		return amount;
	}

	@Override
	public void print() {
		System.out.println("The amount is withdrawn form HDFC ATM");		
	}
}*/
