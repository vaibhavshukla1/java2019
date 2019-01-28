package com.capg.exception;

public class MultipleException {

	public static void main(String[] args) {
		multipleexception();
	}

	private static void multipleexception() {
		// TODO Auto-generated method stub
		String str=null;
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
			if(str.equals("asd")) {
				System.out.println("exit");
			}
		}
		catch(ArithmeticException ae) {
			System.out.println("Division by 0");
		}
		catch(NullPointerException np) {
			System.out.println("string pointed to null");
		}
	}
}
