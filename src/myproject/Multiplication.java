package myproject;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = s.nextInt();
		for(int i=1;i<=10;i++)
		{
			
			int p = n * i;
			System.out.println(n+" * "+i+" = "+p);
		}
		
	}

}
