package com.xworkz.polymorphism;

public class Printer {

	public Printer() {
	System.out.println("-----------Inside printer-------------");
}
	
	public void print() {
		System.out.println("Print the document in default setting");
	}
	
	public void print(String size) {
		System.out.println("Print document based on size"+size);
	}
	
	public void print(int startIndex,int lastIndex) {
		System.out.println("Print the document from page no. "+startIndex+" to "+lastIndex);
		System.out.println("-------------------------------------------");
	}
}
