package myproject;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] n = new int[5];
		System.out.print("Enter 5 values");
		for(int i=0;i<n.length;i++)
			n[i] = s.nextInt();
		System.out.println("Enter value to search");
		int key = s.nextInt();
		boolean isFound = false;
		for(int i=0;i<n.length;i++)
			{
			if(key == n[i])
			{
				isFound = true;
				break;
				
			}
			
			}
		if(isFound == true)
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
			}

}
