package com.capg.exception;

public class NullPointer {

	public static void main(String[] args) {
		nullhandel();
	}
	
	public static void nullhandel() {
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
	}

}
