package mypack2;

import mypack1.Calculator;

public class Calculator2 {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Sum ="+c.add(10,20));
		System.out.println("product ="+c.multiply(10,20));
		
	}

}
