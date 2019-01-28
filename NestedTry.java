package com.capg.exception;

public class NestedTry {

	public static void main(String[] args) {
		nestedtry();
	}
	
	public static void nestedtry() {
		int a=10;
		int b=0;
		try {
				try {
					int c=a/b;
				}
				catch(ArithmeticException ae) {
					System.out.println("exception : divided by 0");
				}
			}
		catch(NullPointerException np) {
			System.out.println("string is pointed to null");
		}
	}
}
