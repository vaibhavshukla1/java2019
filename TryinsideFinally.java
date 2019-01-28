package com.capg.exception;

public class TryinsideFinally {

	public static void main(String[] args) {
		tryinsidefinally();
	}

	private static void tryinsidefinally() {
		int a=10;
		int b=5;
		try {
			int c=a/b;
			System.out.println("Division is "+c);
		}
		catch(ArithmeticException ae1) {
			System.out.println("division problem");
		}
		finally {
			String str=null;
			try {
				if(str.equals("hi")) {
					System.out.println("Hello");
				}
				else {
					System.out.println("Bye");
				}
			}
			
			catch(NullPointerException np) {
				System.out.println("string is pointed to null");
			}
			System.out.println("It Always Execute...");
		}
	}
	
	

}
