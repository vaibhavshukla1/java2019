package com.capg.exception;

public class TryinsideCatch {

	public static void main(String[] args) {
		trycatch();
	}
	
	public static void trycatch() {
		int a=10;
		int b=0;
		try {
				try {
					int c=a/b;
				}
				catch(ArithmeticException ae) {
					System.out.println("exception : divided by 0");
					try {
						b=2;
						int c=a/b;
						System.out.println("Division is "+c);
					}
					catch(ArithmeticException ae1) {
						System.out.println("division problem");
					}
				}
			}
		catch(NullPointerException np) {
			System.out.println("string is pointed to null");
		}
	}

}
