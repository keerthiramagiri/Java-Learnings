package myproject;

import java.util.Scanner;

public class SumTen {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n,i=11,sum=0;
	while(i <= 10)
	{ 
		System.out.println("Enter a number");
		n= s.nextInt();
		sum= sum + n;
		i++;
		}
	System.out.println("sum = "+sum);
	

	}

}
